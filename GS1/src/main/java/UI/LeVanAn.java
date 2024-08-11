package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class LeVanAn {
    private JPanel currentPanel = null;
    private final Color originalColor = new Color(13,18,130);
    private final Color hoverColor = new Color(2, 94, 167);
    private final Color clickColor = new Color(255, 102, 102);
        
    
    // 1. Nâng cao trải nghiệm UX
    public void moreSmooth(JComponent previousComponent, JComponent nextComponent, KeyEvent evt) {
        if(evt.getKeyCode() == KeyEvent.VK_ENTER ||
           evt.getKeyCode() == KeyEvent.VK_TAB ||
           evt.getKeyCode() == KeyEvent.VK_DOWN) {
            nextComponent.requestFocus();
        } else if(evt.getKeyCode() == KeyEvent.VK_UP) {
            previousComponent.requestFocus();
        }
    }

    // 2. Xóa dữ liệu hiện tại
    public void clearData(JComponent... components) { 
        for(JComponent component : components) {
            if (component instanceof JRadioButton) {
                ((JRadioButton) component).setSelected(false);  
            } else if (component instanceof JTextField) {
                ((JTextField) component).setText("");           
            } else if (component instanceof JTextArea) {
                ((JTextArea) component).setText("");            
            } else if (component instanceof JComboBox) {
                ((JComboBox<?>) component).setSelectedIndex(-1);
            } else if (component instanceof JLabel) {
                ((JLabel) component).setText("");
                ((JLabel) component).setIcon(null);
            } else if (component instanceof JSpinner) {
                ((JSpinner) component).setValue(0);
            } else if (component instanceof JTable) {
                DefaultTableModel model = (DefaultTableModel) ((JTable) component).getModel();
                model.setRowCount(0);  // Xóa tất cả các hàng
            }
        }
    }

    
    // 3. Tạo hiệu ứng Hover, và Đánh dấu mục đang sử dụng
    public void setPanelEvents(JPanel... panels) {
        for(JPanel panel : panels) {
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    if (panel != currentPanel) {
                        panel.setBackground(hoverColor);
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (panel != currentPanel) {
                        panel.setBackground(originalColor);
                    }
                }

                @Override
                public void mouseClicked(MouseEvent e) {
                    if (currentPanel != null && panel != currentPanel) {
                        currentPanel.setBackground(originalColor);
                    }
                    panel.setBackground(clickColor);
                    currentPanel = panel;
                }
            });
        }
    }
    
    // 4. Xóa các thành phần bên trong parentPanel sau đó thêm childPanel chèn hết parentPanel
    public void changePanel(JPanel parentPanel, JPanel childPanel) {
        parentPanel.removeAll();                      // Xóa tất cả các thành phần con hiện tại từ parentPanel
        parentPanel.add(childPanel, BorderLayout.CENTER);  // Thêm panel mới vào parentPanel rồi set border để childPanel chèn hết parentPanel
        parentPanel.revalidate();                     // Thông báo cho layout manager rằng bố cục cần được tính toán lại
        parentPanel.repaint();                        // Vẽ lại parentPanel với các thay đổi mới
    }
    
    // 5. Sửa ảnh theo kích thước ta mong muốn
    public ImageIcon resizeImage(ImageIcon originalIcon, int width, int height) {
        // Get image from ImageIcon
        Image originalImage = originalIcon.getImage();

        // Create new image with specified dimensions
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        // Return the resized ImageIcon
        return new ImageIcon(resizedImage);
    }
    
    // 6. Đưa vào keyrelease để tối ưu hóa việc tìm kiếm
    public void filterDataByTableToTextField(JTable jtable, JTextField txt) {
            DefaultTableModel defaultTableModel = (DefaultTableModel) jtable.getModel();
            TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(defaultTableModel);
            jtable.setRowSorter(obj);
            obj.setRowFilter(RowFilter.regexFilter("(?i)" + txt.getText()));
    }
}
