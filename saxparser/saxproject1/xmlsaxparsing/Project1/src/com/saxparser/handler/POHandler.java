package com.saxparser.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class POHandler extends DefaultHandler {
    @Override
    public void characters(char[] xml, int offSet, int length) throws SAXException {
       String data = new String(xml, offSet, length);
       System.out.print(data);
    }

    @Override
    public void startDocument() throws SAXException {
       System.out.println("START DOCUMENT");
    }

    @Override
    public void endDocument() throws SAXException {
       System.out.println("END DOCUMENT");
    }

    @Override
    public void startElement(String arg0, String arg1, String localName, Attributes arg3) throws SAXException {
       System.out.println("<"+localName+">");
    }

    @Override
    public void endElement(String arg0, String arg1, String localName) throws SAXException {
       System.out.println("</"+localName+">");
    }
}
