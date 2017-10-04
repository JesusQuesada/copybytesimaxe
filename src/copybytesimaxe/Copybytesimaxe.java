package copybytesimaxe;

import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author jquesadaabeijon
 */
public class Copybytesimaxe {

    public static void main(String[] args) throws IOException {
        File fis = new File("/home/local/DANIELCASTELAO/jquesadaabeijon/NetBeansProjects/Copybytesimaxe/Halloween.jpg");
        File fos = new File("/home/local/DANIELCASTELAO/jquesadaabeijon/NetBeansProjects/Copybytesimaxe/Halloween2.jpg");
        
        leeryescribir(fis, fos, true);
    }

    public static void leeryescribir(File fis, File fos, boolean wr) throws IOException {

        int i = 0;
        //FileInputStream fis1 = new FileInputStream(fis);
        //FileOutputStream fos1 = new FileOutputStream (fos, wr);

       
        
        BufferedInputStream fis1 = new BufferedInputStream(new FileInputStream(fis));
        BufferedOutputStream fos1 = new BufferedOutputStream(new FileOutputStream (fos, wr));
        

        while ((i = fis1.read())!= -1) {
               fos1.write(i);

           
               
                
            }
         fos1.close();
         fis1.close();
         System.out.println("La imagen se ha copiado del archivo 'Halloween' al archivo 'Halloween2'.");
        
        }

        
    }

