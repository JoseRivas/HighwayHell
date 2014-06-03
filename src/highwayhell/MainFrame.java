
package highwayhell;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

    MainFrame() {
        add(new MainPan());
        setTitle("Highway Hell");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,350);
        setResizable(true);
        setVisible(true);
    }
}
