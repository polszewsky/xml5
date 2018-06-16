<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="3.0">
	<xsl:output method="text" version="1.0" encoding="UTF-8" indent="yes"/>
	<xsl:variable name="newline">
		<xsl:text>&#10;</xsl:text>
	</xsl:variable>
	
	<xsl:template match="/">
		
		<xsl:for-each select="winestore/project/author">
			<xsl:value-of select="."/>
			<xsl:value-of select="$newline"/>
		</xsl:for-each>
		
		<xsl:text>Winestore by D.P</xsl:text>
		
		<xsl:value-of select="$newline"/>
		
		<xsl:text>Podsumowaine sklepu: 2018r</xsl:text>
		
		<xsl:value-of select="$newline"/>
		<xsl:value-of select="$newline"/>
		
		<xsl:text>                  Nazwa       ||</xsl:text>
		<xsl:text>     Kontynent       ||</xsl:text>
		<xsl:text>    Kolor       ||</xsl:text>
		<xsl:text>    Wytrawność     ||</xsl:text>
		<xsl:text>    Rok       ||</xsl:text>
		<xsl:text>    Cena      </xsl:text>
		
		<xsl:value-of select="$newline"/>
		
		<xsl:text>------------------------------||</xsl:text>
		<xsl:text>---------------------||</xsl:text>
		<xsl:text>----------------||</xsl:text>
		<xsl:text>---------------------||</xsl:text>
		<xsl:text>--------------||------------------------</xsl:text>
		
		<xsl:value-of select="$newline"/>
		
		<xsl:for-each select="winestore/wine">
			<xsl:value-of select="substring(concat(name, '                          '), 1, 30)"/>
			<xsl:text>|| </xsl:text>
			<xsl:value-of select="substring(concat(country/cont, '                    '), 1, 20)"/>
			<xsl:text>|| </xsl:text>
			<xsl:value-of select="substring(concat(color, '                  '), 1, 15)"/>
			<xsl:text>|| </xsl:text>
			<xsl:value-of select="substring(concat(taste, '                  '), 1, 20)"/>
			<xsl:text>|| </xsl:text>
			<xsl:value-of select="substring(concat(year, '         '), 1, 15)"/>
			<xsl:text>|| </xsl:text>
			<xsl:value-of select="substring(concat(price, '       '), 1, 30)"/>
			
			
			<xsl:value-of select="$newline"/>
		</xsl:for-each>
		
		<xsl:value-of select="$newline"/>
		<xsl:text>-------------------------------------------</xsl:text>
		<xsl:value-of select="$newline"/>
		
		<xsl:value-of select="winestore/wineCount"/>
		
		<xsl:for-each select="winestore/wineAvailable">
			<xsl:value-of select="."/>
			<xsl:value-of select="$newline"/>
		</xsl:for-each>
		
		<xsl:value-of select="$newline"/>
		
		<xsl:for-each select="winestore/wineColor">
			<xsl:value-of select="."/>
			<xsl:value-of select="$newline"/>
		</xsl:for-each>
	
	</xsl:template>
</xsl:stylesheet>
