/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pi.diddy.controller;

import com.sun.jna.Native;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 *
 * @author SARA
 */
public class OcrController {

    static {
//        System.setProperty("java.library.path", "src/main/resources/dll/win32-x86-64");
//        System.setProperty("jna.library.path", "src/main/resources/dll/win32-x86-64");
    }

    public OcrController() {

    }

    public String getImageString(String file) {
        File imageFile = new File(file);
        Tesseract instance = Tesseract.getInstance(); // JNA Interface Mapping

        try {
            String result = instance.doOCR(imageFile);
            return result;
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
