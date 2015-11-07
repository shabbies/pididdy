package servlet;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S3UploadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        BasicAWSCredentials awsCreds = new BasicAWSCredentials("AKIAJEY5PHY35DCUPXGA", "Vj+rnXktBa+pwIuykht+QgC5NqgJYD29DqRHFOky");

        AmazonS3 s3 = new AmazonS3Client(awsCreds);
        Region se1 = Region.getRegion(Regions.AP_SOUTHEAST_1);
        s3.setRegion(se1);

        String bucketName = "media.pi-diddy.herokuapp.com";
        String key = "MyObjectKey";

        System.out.println("Uploading a new object to S3 from a file\n");
        s3.putObject(new PutObjectRequest(bucketName, key, createSampleFile()));
    }
    
    private static File createSampleFile() throws IOException {
        File file = File.createTempFile("aws-java-sdk-", ".txt");
        file.deleteOnExit();

        Writer writer = new OutputStreamWriter(new FileOutputStream(file));
        writer.write("abcdefghijklmnopqrstuvwxyz\n");
        writer.write("01234567890112345678901234\n");
        writer.write("!@#$%^&*()-=[]{};':',.<>/?\n");
        writer.write("01234567890112345678901234\n");
        writer.write("abcdefghijklmnopqrstuvwxyz\n");
        writer.close();

        return file;
    }
    
}
