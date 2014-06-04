package highwayhell;

//import java.awt.Dimension;
//import java.awt.Toolkit;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

    MainFrame() {
        add(new MainPan());
        setTitle("Highway Hell");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Toolkit kit = Toolkit.getDefaultToolkit();
        //Dimension screenSize = kit.getScreenSize();
       // int nWidth = screenSize.width;
        //int nHeight = screenSize.height;
       // setSize(nWidth / 2, nHeight / 2); // for half the size of the screen
       // setLocationByPlatform(true);
        setSize(800, 700);//defined screen size; not ideal for different sized monitors
        setResizable(false);
        setVisible(true);
    }
}
