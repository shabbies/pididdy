<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Upload</title>
    </head>
    <body>
        <div>
            <h1>File Upload</h1>
            <form method="post" action="/fileupload" enctype="multipart/form-data">
                <p>Select file to upload:
                <input type="file" name="file" />
                </p>
                <br>
                <input type="submit" value="Upload" />
            </form>
        </div>
    </body>
</html>
