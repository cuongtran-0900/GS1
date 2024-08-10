import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ForListProduct {
    private static JPanel mainPanel;
    private static JFrame frame;
    private static ArrayList<JPanel> panels;

    public static void main(String[] args) {
        frame = new JFrame("Main Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        mainPanel = new JPanel();
        mainPanel.setLayout(new WrapLayout(FlowLayout.LEFT, 0, 0)); // WrapLayout để hỗ trợ xuống dòng

        panels = new ArrayList<>();

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        JButton addButton = new JButton("Add Panel");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addPanel();
                resizePanels();
            }
        });

        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(addButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private static void addPanel() {
        JPanel newPanel = new JPanel();
        newPanel.setBackground(getRandomColor());
        panels.add(newPanel);
        mainPanel.add(newPanel);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private static void resizePanels() {
        int panelCount = panels.size();
        int mainPanelWidth = mainPanel.getParent().getWidth(); // Lấy chiều rộng của JScrollPane

        for (JPanel panel : panels) {
            panel.setPreferredSize(new Dimension(mainPanelWidth / 4, 100)); // Mỗi panel chiếm 1/4 chiều rộng và cao 100
        }

        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private static Color getRandomColor() {
        return new Color((int) (Math.random() * 0x1000000));
    }
}

class WrapLayout extends FlowLayout {
    public WrapLayout(int align, int hgap, int vgap) {
        super(align, hgap, vgap);
    }

    @Override
    public Dimension preferredLayoutSize(Container target) {
        return layoutSize(target, true);
    }

    @Override
    public Dimension minimumLayoutSize(Container target) {
        Dimension minimum = layoutSize(target, false);
        minimum.width -= (getHgap() + 1);
        return minimum;
    }

    private Dimension layoutSize(Container target, boolean preferred) {
        synchronized (target.getTreeLock()) {
            int targetWidth = target.getParent().getWidth();
            if (targetWidth == 0) {
                targetWidth = Integer.MAX_VALUE;
            }

            int hgap = getHgap();
            int vgap = getVgap();
            Insets insets = target.getInsets();
            int horizontalInsetsAndGap = insets.left + insets.right + (hgap * 2);
            int maxWidth = targetWidth - horizontalInsetsAndGap;

            Dimension dim = new Dimension(0, 0);
            int rowWidth = 0;
            int rowHeight = 0;

            int nmembers = target.getComponentCount();
            for (int i = 0; i < nmembers; i++) {
                Component m = target.getComponent(i);
                if (m.isVisible()) {
                    Dimension d = preferred ? m.getPreferredSize() : m.getMinimumSize();
                    if (rowWidth + d.width > maxWidth) {
                        addRow(dim, rowWidth, rowHeight);
                        rowWidth = 0;
                        rowHeight = 0;
                    }
                    if (rowWidth != 0) {
                        rowWidth += hgap;
                    }
                    rowWidth += d.width;
                    rowHeight = Math.max(rowHeight, d.height);
                }
            }
            addRow(dim, rowWidth, rowHeight);

            dim.width += horizontalInsetsAndGap;
            dim.height += insets.top + insets.bottom + vgap * 2;

            return dim;
        }
    }

    private void addRow(Dimension dim, int rowWidth, int rowHeight) {
        dim.width = Math.max(dim.width, rowWidth);
        if (dim.height > 0) {
            dim.height += getVgap();
        }
        dim.height += rowHeight;
    }
}
