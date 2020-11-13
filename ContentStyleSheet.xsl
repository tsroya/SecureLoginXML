<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template match="/">
        <html>
            <body>
                <div style="text-align: center;  padding: 70px 0;">
                    <form action="" method="post"> <!-- action must be changed to reference a file -->
                        <h1>BiblioPedia</h1>
                        <table style="margin: auto; border-collapse: collapse; ">
                            <tr >
                                <td style = "text-decoration : underline">
                                    <b> <h3> <xsl:value-of select="//title"/> </h3> </b>
                                </td>
                            </tr>
                        </table>
                        <table style="text-align: left;">
                            <tr>
                                <td>
                                    <xsl:value-of select="//text"/>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <img width = "%50" height = "%50" src="{/contentType/contents/photo/text()}"/>
                                </td>
                            </tr>
                            <tr>
                            <td style = "color: red; font-family: Courier">
                                <b><i> <xsl:value-of select="//quote"/> </i></b>
                            </td>
                        </tr>
                        </table>
                    </form>
                </div>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
