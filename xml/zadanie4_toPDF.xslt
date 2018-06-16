<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="3.0">
	<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>

	<xsl:template match="/">
		<fo:root>
			<fo:layout-master-set>
				<fo:simple-page-master master-name="A4" page-width="210mm" page-height="297mm" margin="10mm">
					<fo:region-body margin-top="25mm" />
					<fo:region-before region-name="header" />
				</fo:simple-page-master>
			</fo:layout-master-set>
			
			<fo:page-sequence master-reference="A4" initial-page-number="1">
			<fo:title>Podsumowanie: 2018r </fo:title>
			
				<fo:static-content flow-name="header">
					<fo:block>
						<fo:block-container position="absolute" top="0mm" left="0mm" width="190mm" height="20mm" >
							<fo:block border-color="#b73543" color="#000000" border-style="solid" border-width="0.5mm" text-align="center" padding="3mm" font-size="18pt">
								    Winestore by D<![CDATA[&]]>P
							</fo:block>                	                                         
						</fo:block-container>
					</fo:block>					
					<fo:block>	
						<fo:block-container position="absolute" top="25mm" left="0mm" width="190mm" height="40mm">
							<fo:block text-align="center">  							
							<xsl:for-each select="winestore/project/author">
								<fo:block>
									<xsl:value-of select="."/> 
								</fo:block>
							</xsl:for-each>	
							</fo:block>	
					 </fo:block-container>
					</fo:block>
				</fo:static-content>
			
				<fo:flow flow-name="xsl-region-body">
					<fo:block>
						<fo:block-container top="25mm" width="190mm" font-size="16pt" border-color="#b73543" color="#CC0000" border-after-style="solid" border-width="0.5mm" height="30mm">
									<fo:block text-align="center" padding-top="15mm"> PODSUMOWANIE ROKU 2018</fo:block>
						</fo:block-container>
					</fo:block>
					
					<fo:block>
						<fo:block-container position="absolute" width="190mm"  left="0mm" top="30mm">
							<fo:table table-layout="fixed" width="100%" border-color="#888888" border-width="medium" border-style="solid">
								<fo:table-column column-width="10mm"/>
								<fo:table-column column-width="40mm"/>
								<fo:table-column column-width="28mm"/>		
								<fo:table-column column-width="20mm"/>			
								<fo:table-column column-width="30mm"/>
								<fo:table-column column-width="20mm"/>
								<fo:table-column column-width="15mm"/>
								<fo:table-column column-width="15mm"/>
								<fo:table-column column-width="17mm"/>
								
								<fo:table-header background-color="#DFDFDF">
								   <fo:table-cell padding="2mm" border-color="#000000" border-width="thin" border-style="solid">
									   <fo:block > Lp. </fo:block>
								   </fo:table-cell>
								   <fo:table-cell padding="2mm" border-color="#000000" border-width="thin" border-style="solid">
									   <fo:block > Tytul </fo:block>
								   </fo:table-cell>
								   <fo:table-cell padding="2mm" border-color="#000000" border-width="thin" border-style="solid">
									   <fo:block > Tworca </fo:block>
								   </fo:table-cell>
								   <fo:table-cell padding="2mm" border-color="#000000" border-width="thin" border-style="solid">
									   <fo:block > Kolor </fo:block>
								   </fo:table-cell>		
								   <fo:table-cell padding="2mm" border-color="#000000" border-width="thin" border-style="solid">
									   <fo:block > Znizka </fo:block>
								   </fo:table-cell>
								   <fo:table-cell padding="2mm" border-color="#000000" border-width="thin" border-style="solid">
									   <fo:block > Cena </fo:block>
								   </fo:table-cell>		   
								   <fo:table-cell padding="2mm" border-color="#000000" border-width="thin" border-style="solid">
									   <fo:block > Alc %</fo:block>
								   </fo:table-cell>
								   <fo:table-cell padding="2mm" border-color="#000000" border-width="thin" border-style="solid">
									   <fo:block > Vol</fo:block>
								   </fo:table-cell>	
								   <fo:table-cell padding="2mm" border-color="#000000" border-width="thin" border-style="solid">
									   <fo:block > Cena </fo:block>
								   </fo:table-cell>	
								</fo:table-header>
					
								<fo:table-body >
									<xsl:for-each select="winestore/wine">
										<fo:table-row >
											<fo:table-cell padding="1mm" border-color="#000000" border-width="thin" border-style="solid" font-size="10pt">
											   <fo:block> <xsl:value-of select="position()"/> </fo:block>				   
											</fo:table-cell>
											<fo:table-cell padding="1mm" border-color="#000000" border-width="thin" border-style="solid" font-size="10pt">
											   <fo:block>  <xsl:value-of select="name"/> </fo:block>
											</fo:table-cell>
											<fo:table-cell padding="1mm" border-color="#000000" border-width="thin" border-style="solid" font-size="10pt">
											   <fo:block>  <xsl:value-of select="country/text()"/>  </fo:block>
											</fo:table-cell>
											<fo:table-cell padding="1mm" border-color="#000000" border-width="thin" border-style="solid" font-size="10pt">
											   <fo:block>  <xsl:value-of select="color"/>  </fo:block>
											</fo:table-cell>
											<fo:table-cell padding="1mm" border-color="#000000" border-width="thin" border-style="solid" font-size="10pt">
												<fo:block>  <xsl:value-of select="taste"/>  </fo:block>
											</fo:table-cell>
											<fo:table-cell padding="1mm" border-color="#000000" border-width="thin" border-style="solid" font-size="10pt">
												<fo:block>  <xsl:value-of select="year"/>  </fo:block>
											</fo:table-cell>
											<fo:table-cell padding="1mm" border-color="#000000" border-width="thin" border-style="solid" font-size="10pt">
												<fo:block>  <xsl:value-of select="alcohol"/>  </fo:block>
											</fo:table-cell>
											<fo:table-cell padding="1mm" border-color="#000000" border-width="thin" border-style="solid" font-size="10pt">
												<fo:block>  <xsl:value-of select="volume"/>  </fo:block>
											</fo:table-cell>	
											<fo:table-cell padding="2mm" border-color="#000000" border-width="thin" border-style="solid" font-size="10pt">
											   <fo:block>  <xsl:value-of select="price/text()"/>  </fo:block>				   
											</fo:table-cell>
										</fo:table-row>
									</xsl:for-each>			
							</fo:table-body>
							</fo:table>  	
						</fo:block-container>
					</fo:block>
					
					
				</fo:flow>
					
			</fo:page-sequence>
		</fo:root>
	</xsl:template>
</xsl:stylesheet>
