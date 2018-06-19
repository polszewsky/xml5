<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<xsl:stylesheet version="3.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:output  method="html"    encoding="UTF-8"     indent="yes"/>

<xsl:template match="winestore">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>WINESTORE - PODSUMOWANIE 2018</title>
</head>

<body>
<h2>WINESTORE BY D&amp;P</h2>
<h3>PODSUMOWANIE SKLEPU - 2018 r.</h3>
<hr/>
<p><xsl:value-of select="moddate"/></p>
<p><xsl:value-of select="wineCount"/></p>
<p><xsl:value-of select="wineAvailable"/></p>
<p><xsl:value-of select="wineColor"/></p>
<hr/>
<h3>SPIS WIN</h3>
<hr/>

<table>
<tr>
	<th>Nazwa</th>
	<th>Kraj</th>
	<th>Kolor</th>
	<th>Smak</th>
	<th>Alc</th>
	<th>Rocznik</th>
	<th>Cena</th>
</tr>

    <xsl:for-each select="wine">
    <tr>
      <td><xsl:value-of select="name"/></td>
      <td><xsl:apply-templates select="country"/></td>
	  <td><xsl:value-of select="color"/></td>
	  <td><xsl:value-of select="taste"/></td>
	  <td><xsl:value-of select="alcohol"/></td>
	  <td><xsl:value-of select="year"/></td>
	  <td><xsl:value-of select="price"/></td>
    </tr>
    </xsl:for-each>

</table>

</body>
</html>
</xsl:template>

<xsl:template match="country">
  <xsl:value-of select="."/>
</xsl:template>



</xsl:stylesheet>