package xmlproject.transform;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.xhtmlrenderer.pdf.ITextRenderer;

import com.lowagie.text.DocumentException;

public class PDFTransform {

	public void transformToPDF() throws IOException, DocumentException
	{
		
	System.out.println("hello there from transform");	
		
	
		//*******
		// TXT
		//*******
		
	//	TransformerFactory tFactory = null;
	//	Transformer transformer = null;
	//	 /* Create a TransformerFactory object */           
	//    tFactory = TransformerFactory.newInstance();
	//    /* Get the incoming XSLT file */
	//    try {
	//		transformer = tFactory.newTransformer(new StreamSource("xml\\zadanie4_toTXT.xslt"));
	//	} catch (TransformerConfigurationException e) {
	//		// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
	//    /* Get the XML file and apply the XSLT transformation to convert to HTML */
	//    try {
	//		transformer.transform(new StreamSource("xml\\zadanie4.xml"),new StreamResult(new FileOutputStream("xml\\output.txt")));
	//	} catch (FileNotFoundException e) {
	//		// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	} catch (TransformerException e) {
	//		// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
	
	
		TransformerFactory tFactory = null;
		Transformer transformer = null;
		 /* Create a TransformerFactory object */           
        tFactory = TransformerFactory.newInstance();
        /* Get the incoming XSLT file */
        try {
			transformer = tFactory.newTransformer(new StreamSource("xml\\zadanie4_toPDF.xslt"));
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        /* Get the XML file and apply the XSLT transformation to convert to HTML */
        try {
			transformer.transform(new StreamSource("xml\\zadanie4.xml"),new StreamResult(new FileOutputStream("xml\\output.html")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        String File_To_Convert = "xml\\output.html";
        String url = new File(File_To_Convert).toURI().toURL().toString();
        System.out.println(""+url);
        String HTML_TO_PDF = "xml\\ConvertedFile.pdf";
        OutputStream os = new FileOutputStream(HTML_TO_PDF);       
        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocument(url);      
        renderer.layout();
        renderer.createPDF(os);        
        os.close();
        
		
	}

}
