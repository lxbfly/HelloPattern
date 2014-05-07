package cn.xuebing.util;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlUtil {
	static Document doc = null;

	public static String getChartType() {
		try {
			getDocument();
			NodeList nodeList = doc.getElementsByTagName("chartType");
			Node classNode = nodeList.item(0).getFirstChild();
			return classNode.getNodeValue().trim();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Object getFactoryBean() {
		try {
			getDocument();
			NodeList nodeList = doc.getElementsByTagName("className");
			Node classNode = nodeList.item(0).getFirstChild();
			String className = classNode.getNodeValue().trim();

			Class<?> c = Class.forName(className);
			return c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static void getDocument() throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory df = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = df.newDocumentBuilder();
		String classPath = XmlUtil.class.getClassLoader().getResource(".").getPath();
		System.out.println("XmlUtil Class Path = " + classPath);
		doc = builder.parse(new File(classPath + "DemoConfigFile.xml"));
	}
}
