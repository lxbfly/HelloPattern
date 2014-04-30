package cn.xuebing.util;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlUtil {

	public static String getChartType() {
		try {
			DocumentBuilderFactory df = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = df.newDocumentBuilder();
			Document doc = null;
			String classPath = XmlUtil.class.getClassLoader().getResource(".").getPath();
			System.out.println("XmlUtil Class Path = " + classPath);
			doc = builder.parse(new File(classPath + "ChartTypeConfig.xml"));

			NodeList nodeList = doc.getElementsByTagName("chartType");
			Node classNode = nodeList.item(0).getFirstChild();
			return classNode.getNodeValue().trim();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
