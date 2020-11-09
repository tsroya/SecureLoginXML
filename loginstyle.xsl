<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
  <html>
    <body>
      <h2>Enter Your Login Details Below:</h2>
      <table border = "1">
        <tr bgcolor = "#d12988">
          <td><xsl:value-of select="defaultpg/credential/userid"/></td>
          <th><input type = "text" name = "userid" value = "{$userid}"></th>
        </tr>
        <tr bgcolor = "#4dc84a">
          <td><xsl:value-of select="defaultpg/credential/password"/></td>
          <th><input type = "text" name = "password" value = "{$password}"></th>
        </tr>
        <tr>
          <th><input type = "submit" name = "loginbtn" value = "{$loginbtn}"></th>
        </tr>
      </table>
    </body>
  </html>
</xsl:template>
</xsl:stylesheet>
