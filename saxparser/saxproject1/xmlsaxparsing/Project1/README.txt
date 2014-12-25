SAX Parser Example Project1 : 
=============================
Reads the XML Document (i.e. po.xml) sequentially and prints it on to the console.

POHandler.java : 
================
We are overriding the following five methods which would be triggered based on the type of elements the parser is pointing to the source XML document.
i.e. we can override the methods to process respective events.

Methods
|
|--- startDocument : Triggered at the start of the XML document
|--- startElement  : Triggered when parser encounters the beginning or starting element Ex: <purchaseOrder>
|--- endElement    : Triggered when parser encounters the ending or closing element Ex: </purchaseOrder>
|--- endDocument   : Triggered by the parser when it reaches end of the XML document.
|--- characters    : Triggered when parser encounters data portion between the XML elements Ex: <itemCode>IND007</itemCode>, IND007 is the data portion here.
                     To this method, Parser passes the entire XML as character array along with two other integers 
                     (i) offset  : one integer indicating the position in the array from which the current data portion begins and
                     (ii) length : second integer indicating the length of data portion i.e. no. of characters of data portion or data span.
FYI, The org.xml.sax.helpers package contains DefaultHandler, which defines the class that will handle the SAX events that the parser generates.
					 
POParser.java : 
===============
The javax.xml.parsers package contains the SAXParserFactory class that creates the parser instance used. It throws a ParserConfigurationException if it cannot produce a parser that matches the specified configuration of options. The javax.xml.parsers package also contains the SAXParser class, which is what the SAXParserFactory returns for parsing. The org.xml.sax package defines all the interfaces used for the SAX parser. 

In order to read the elements of XML document and process them by raising events, we need a parser and here in SAX it is called SAXParser.
SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
SAXParser parser = saxParserFactory.newSAXParser();

Along with the parser (i.e SAXParser), we need a Handler class to handle the event and process it.

A Handler class would be written by extending it from DefaultHandler (see POHandler.java).

Once the handler has been created, we need to call the parser class parse() method by passing the source as XML document and
handler as the object of handler class [i.e. new POHandler()]. So, that the parser will read the XML elements and triggers a respective method call on the handler object provided.


po.xml :
========
po.xml is an XML document or input XML is passed to the POParser.parse() for parsing.


Other files:
===============
All other files/directories in this project directory are created by the JDeveloper IDE for managing this project.
