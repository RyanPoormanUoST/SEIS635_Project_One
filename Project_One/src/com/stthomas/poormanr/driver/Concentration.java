package com.stthomas.poormanr.driver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Concentration {

    public static void main(String args[]) {
        try{
            BufferedImage image;
            image = ImageIO.read(new File("card_images/2_of_clubs.png"));

            image.getGraphics().drawLine(1, 1, image.getWidth()-1, image.getHeight()-1);
            image.getGraphics().drawLine(1, image.getHeight()-1, image.getWidth()-1, 1);

//            ImageIO.write(image, "png", new File("/tmp/output.png"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
