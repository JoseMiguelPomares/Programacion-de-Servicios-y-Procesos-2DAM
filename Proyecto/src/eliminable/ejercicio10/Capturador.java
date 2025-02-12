package eliminable.ejercicio10;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Capturador implements Runnable{
    private String directorio;
    private int numCaptura = 0;

    public Capturador(){
        this.directorio = "./";
    }
    public Capturador(String directorio){
        this.directorio = directorio;
    }

    @Override
    public void run(){
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        try {
            BufferedImage capture = new Robot().createScreenCapture(screenRect);
            ImageIO.write(capture, "bmp", new File(directorio + "/captura"+ numCaptura +".bmp"));
            numCaptura++;
        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }
    }
}
