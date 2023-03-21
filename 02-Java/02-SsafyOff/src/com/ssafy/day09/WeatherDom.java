package com.ssafy.day09;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class WeatherDom {
    private final File xml = new File("weather.xml");
    private List<Weather> list = new ArrayList<>();

    public List<Weather> getWeatherData() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xml);
            Element root = doc.getDocumentElement();
            parse(root);
        } catch (IOException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
        return list;
    }

    private void parse(Element root) {
        NodeList weatherDatas = root.getElementsByTagName("data");
        for (int i = 0; i < weatherDatas.getLength(); i++) {
            Node child = weatherDatas.item(i);
            list.add(getWeatherData(child));
        }
    }

    private static Weather getWeatherData(Node node) {
        Weather weather = new Weather();
        NodeList childs = node.getChildNodes();
        for (int j = 0; j < childs.getLength(); j++) {
            Node child = childs.item(j);
            if (child.getNodeName().equals("hour")) {
                weather.setHour(child.getTextContent());
            } else if (child.getNodeName().equals("day")) {
                weather.setHour(child.getTextContent());
            } else if (child.getNodeName().equals("temp")) {
                weather.setHour(child.getTextContent());
            } else if (child.getNodeName().equals("wfKor")) {
                weather.setWfKor(child.getTextContent());
            }
        }
        return weather;
    }
}
