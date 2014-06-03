
package highwayhell;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
public class MainPan extends JPanel{
    private BufferedImage Road;
    public MainPan(){
        try{
            Road = ImageIO.read(new File("img\\road.jpg"));
        } catch (IOException ex){
            //handle exception...
        }
        
    }
    @Override
    protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(Road, 0, 0, getWidth(),getHeight(),null);
        }
    //adding images to the panel
    //http://stackoverflow.com/questions/299495/how-to-add-an-image-to-a-jpanel
}
