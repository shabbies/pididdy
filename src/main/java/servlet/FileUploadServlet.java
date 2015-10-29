package servlet;

import com.pi.diddy.controller.OcrController;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.commons.io.IOUtils;


@MultipartConfig
public class FileUploadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Part avatarPart = request.getPart("file");
        byte[] avatarByte = null;
        if (avatarPart != null){
            avatarByte = IOUtils.toByteArray(avatarPart.getInputStream());
        }
        
//        System.out.println("HIHI its working");
        
        String filePath = avatarPart.getName();

        String output = "File saved to server location : " + filePath;

        // see image to database for recognition 
        // If exist, go to database to get the best quality audio for the image and return the audio to the user
        // Else, send the image to OCR & and generate new ID for the image
        OcrController ocrCtrl = new OcrController();
        String ocr_response = ocrCtrl.getImageString(filePath);
        // Next, send the string generated by OCR to language translator
        // send the image to forum 
        // return the audio to the user
        
        
    }
    
}
