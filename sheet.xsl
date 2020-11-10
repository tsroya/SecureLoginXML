<?xml version="1.0" encoding="UTF-8"?>
<html xsl:version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <body style="font-family:Arial;font-size:12pt;background-color:#EEEEEE">

        <div style="text-align: center">
            <h2>
                Enter your Login Details Below:
            </h2>
            <form action="login" method="post">
                <label for="userid">UserID:</label>
                <xsl:variable name="userid" select="defaultpg/credential/userid"/>
                <input type="text" name= "username" />
                <xsl:text>&#xd;</xsl:text>
                <label for="password">Password:</label>
                <xsl:variable name="password" select="defaultpg/credential/password"/>
                <input type="text" name= "username" />
                <xsl:text>&#xd;</xsl:text>
                <xsl:variable name="loginbtn" select="defaultpg/credential/loginbtn"/>
                <input type = "submit" name="loginbtn" value="{$loginbtn}" />
            </form>
        </div>

    </body>
</html>