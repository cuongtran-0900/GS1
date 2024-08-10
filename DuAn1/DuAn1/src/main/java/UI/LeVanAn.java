package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
    
}
