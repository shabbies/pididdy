<html>
    <head>
        <title>Upload</title>
    </head>
    <body>
        <!--<h2>Hello Heroku!</h2>-->
        <div>
            <h1>Upload a File</h1>

            <form action="webresources/file/upload" method="post" enctype="multipart/form-data">

                <p>
                    Select a file : <input type="file" name="fileInput" />
                </p>

                <input type="submit" value="Upload It" />
            </form>

        </div>
    </body>
</html>
