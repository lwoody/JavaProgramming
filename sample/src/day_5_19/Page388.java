package day_5_19;

interface Parseable {
	public abstract void parse(String fileName);
}

class XmlParser implements Parseable {
	@Override
	public void parse(String fileName) {
		System.out.println(fileName + " - Xml Parsing");
	}
}

class HtmlParser implements Parseable {
	@Override
	public void parse(String fileName) {
		System.out.println(fileName + " - Html Parsing");
	}
}

class ParserMgr {
	public static Parseable getParser(String type) {
		if (type.equals("xml")) {
			return new XmlParser();
		} else {
			return new HtmlParser();
		}
	}
}

public class Page388 {

	public static void main(String[] args) {
		
		String filename = args[0];
		Parseable parser1 = ParserMgr.getParser("xml");
		Parseable parser2 = ParserMgr.getParser("html");
		Parseable parser3 = ParserMgr.getParser("ahtml");
		
		int index = filename.indexOf('.');
		String ext = filename.substring(index+1);
		Parseable parser4 = ParserMgr.getParser(filename.substring(filename.length()-3));
		Parseable parser5 = ParserMgr.getParser(ext);

		parser1.parse("document.xml");
		parser2.parse("document.html");
		parser3.parse("adocument.html");
		parser4.parse(filename);
		parser5.parse(filename);

	}

}
