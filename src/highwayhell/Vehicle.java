
package highwayhell;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Vehicle {
    public Image img;
    public Vehicle(){
        try{
            img = ImageIO.read(new File("img\\yellowcar.png"));
        } catch (IOException ex){
            //handle exception...
        }
        
    }
}
