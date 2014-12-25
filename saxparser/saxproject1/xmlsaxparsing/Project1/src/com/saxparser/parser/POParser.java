package com.saxparser.parser;

import com.saxparser.handler.POHandler;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class POParser {
    public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException {

       SAXParserFactory factory = SAXParserFactory.newInstance();
       SAXParser parser = factory.newSAXParser();

       parser.parse(new File("C:\\po.xml"), new POHandler());
    }
}
