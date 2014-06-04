package highwayhell;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MainPan extends JPanel {

    private Vehicle car;
    private Obstacle obs;
    private BufferedImage Road;

    public MainPan() {
        car = new Vehicle();
        obs = new Obstacle();
        try {
            Road = ImageIO.read(new File("img\\road.jpg"));
        } catch (IOException ex) {
            //handle exception...
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(Road, 0, 0, getWidth(), getHeight(), null);
        g.drawImage(car.img, 0, (int) (getHeight() / 1.9), getWidth() / 10, getHeight() / 10, null);//draw image of car in the middle of screen
        g.drawImage(obs.getImage(), (int)(getWidth()/1.1), obs.yPos(), getWidth() / 10, getHeight() / 10, null);
        //the size of the images scale with the window size
    }
    //adding images to the panel
    //http://stackoverflow.com/questions/299495/how-to-add-an-image-to-a-jpanel
}
