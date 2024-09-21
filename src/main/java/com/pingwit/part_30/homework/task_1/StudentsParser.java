package com.pingwit.part_30.homework.task_1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentsParser {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();

        InputStream resource = ClassLoader.getSystemResourceAsStream("part_30/homework/task_1/students.xml");
        Document document = documentBuilder.parse(resource);
        List<Student> studentsList = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node instanceof Element) {
                Student students = new Student();

                NodeList childNodes = node.getChildNodes();

                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node cNode = childNodes.item(j);

                    if (cNode instanceof Element) {
                        String content = cNode.getLastChild().getTextContent().trim();

                        switch (cNode.getNodeName()) {
                            case "name" -> students.setName(content);
                            case "surname" -> students.setSurname(content);
                            case "faculty" -> students.setFaculty(content);
                        }

                    }
                }studentsList.add(students);
            }
        }
        studentsList.forEach(System.out::println);
        System.out.println("====");


        XmlMapper xmlMapper = new XmlMapper();
        InputStream resource2  = ClassLoader.getSystemResourceAsStream("part_30/homework/task_1/students.xml");

        List<Student> student = xmlMapper.readValue(resource2, new TypeReference<>() {
        });
        student.forEach(System.out::println);


    }
}
