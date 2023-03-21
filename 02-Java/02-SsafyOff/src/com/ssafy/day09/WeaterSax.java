package com.ssafy.day09;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class WeaterSax extends DefaultHandler {
    private final File xml = new File("weather.xml");
    private List<Weather> list = new ArrayList<>();
    private Weather cur;
    private String content;

    public List<Weather> getWeatherData() {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser;
            parser = factory.newSAXParser();
            parser.parse(xml, this);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        // END:
        return list;
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("문서 파싱 시작");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("문서 파싱 종료");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("data")) {
            cur = new Weather();
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        this.content = new String(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("data")) {
            list.add(cur);
            cur = null;
        } else if (qName.equals("hour")) {
            cur.setHour(this.content);
        } else if (qName.equals("day")) {
            cur.setDay(this.content);
        } else if (qName.equals("temp")) {
            cur.setTemp(this.content);
        } else if (qName.equals("wfKor")) {
            cur.setWfKor(this.content);

        }
    }
}
