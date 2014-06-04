/*
 *Other vehicles that arent user controlled
 */
package highwayhell;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Obstacle {

    public int width, height;

    public Obstacle() {
    }

    public Image getImage() {
        Image img = null;
        int nRand;
        String sFilename;
        nRand = (int) (Math.random() * 5) + 1;
        if (nRand == 1) {
            sFilename = "img\\yellowcar.png";
        } else if (nRand == 2) {
            sFilename = "img\\yellowcar.png";
        } else if (nRand == 3) {
            sFilename = "img\\police.png";
        } else if (nRand == 4) {
            sFilename = "img\\bluecar.png";
        } else {
            sFilename = "img\\whitecar.png";
        }
        try {
            img = ImageIO.read(new File(sFilename));
        } catch (IOException ex) {
            //handle exception...
        }
        return img;
    }
    public int yPos(){
        int nRand, nYpos;
        nRand = (int) (Math.random() * 5) + 1;
        if (nRand == 1) {
            nYpos= 50;
        } else if (nRand == 2) {
            nYpos= 100;
        } else if (nRand == 3) {
            nYpos= 150;
        } else if (nRand == 4) {
            nYpos= 200;
        } else if (nRand == 5){
            nYpos= 250;
        } else{
            nYpos= 300;
        }
        return nYpos;
    }
}
