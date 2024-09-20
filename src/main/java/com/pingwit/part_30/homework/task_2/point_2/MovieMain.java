package com.pingwit.part_30.homework.task_2.point_2;

import com.pingwit.part_30.homework.task_2.point_2.Title;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MovieMain {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();

        InputStream resource = ClassLoader.getSystemResourceAsStream("part_30/homework/task_2/KinoGo.biz.html");
        Document document = documentBuilder.parse(resource);

        List<Title> titles = new ArrayList<>();

        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node instanceof Element) {
                Title title = new Title();

                if (node.getAttributes().getNamedItem("id") != null) {
                    String id = node.getAttributes().getNamedItem("id").getNodeValue();
                    title.setId(Long.valueOf(id));
                }

                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node cNode = childNodes.item(j);

                    if (cNode instanceof Element) {

                        String content = cNode.getTextContent().trim();

                        switch (cNode.getNodeName()) {
                            case "h2" -> title.setH2(content);
                        }
                    }
                }
                titles.add(title);
            }
        }

        titles.forEach(System.out::println);
    }
}