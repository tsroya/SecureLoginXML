<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template match="/">
        <html>
            <body>
                <h2>Enter Your Login Details Below:</h2>
                <table border="1">
                    <tr >
                        <td>
                            <xsl:value-of select="//userid"/>
                        </td>
                        <th>
                            <input type="text" name="userid" />
                        </th>
                    </tr>
                    <tr>
                        <td>
                            <xsl:value-of select="//password"/>
                        </td>
                        <th>
                            <input type="text" name="password" />
                        </th>
                    </tr>
                    <tr>
                        <th>
                            <input type="submit" name="loginbtn" />
                        </th>
                    </tr>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>