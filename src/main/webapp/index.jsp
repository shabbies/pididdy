<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
<<<<<<< HEAD
        <title>Upload</title>
    </head>
    <body>
        <!--<h2>Hello Heroku!</h2>-->
        <div>
            <h1>Upload a File</h1>

            <form action="webresources/file/upload" method="post" enctype="multipart/form-data">

                <p>
                    Select a file : <input type="file" name="fileInput" />
=======
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Upload a File</h1>

            <form action="/FileUploadServlet" method="post" enctype="multipart/form-data">

                <p>
                    Select a file : <input type="file" name="file" />
>>>>>>> 91901996ba199c27899873cb7af440b31b377750
                </p>

                <input type="submit" value="Upload It" />
            </form>

        </div>
    </body>
</html>
