/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.sun.jna.NativeLibrary;
import java.io.File;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 *
 * @author SARA
 */
public class TestOcr {

    public static void main(String[] args) {
        System.setProperty("jna.library.path", "src/main/resources/dll/win32-x86-64");
//        NativeLibrary.addSearchPath("libtesseract302", "src/main/resources/dll/win32-x86-64");
        File imageFile = new File("D:\\SMU\\Year 4 Sem 1\\IS439 - IOT - G1\\examples\\FileService\\samples\\eurotext.png");
        Tesseract instance = Tesseract.getInstance(); // JNA Interface Mapping
        // Tesseract1 instance = new Tesseract1(); // JNA Direct Mapping
        //In case you don't have your own tessdata, let it also be extracted for you
//        File tessDataFolder = LoadLibs.extractTessResources("tessdata");

        //Set the tessdata path
//        instance.setDatapath(tessDataFolder.getAbsolutePath());
        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
            System.out.println(net.sourceforge.tess4j.util.LoadLibs.getTessAPIInstance());
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }

//        String file = "samples/eurotext.pdf";
//        OcrController ocrCtrl = new OcrController();
//        System.out.println(ocrCtrl.getImageString(file));
    }
}
