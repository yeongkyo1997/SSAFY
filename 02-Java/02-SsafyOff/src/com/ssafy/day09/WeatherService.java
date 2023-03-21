package com.ssafy.day09;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class WeatherService {
	public WeatherService() throws Exception {
		getWeatherInfo("https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=3020052600");
		domProcess();
		System.out.println("==============================================================");
		saxProcess();
	}

	private void saxProcess() {
		WeaterSax handler = new WeaterSax();

		List<Weather> list = handler.getWeatherData();
		for (Weather boxOffice : list) {
			System.out.println(boxOffice);
		}
	}

	private void domProcess() {
		WeatherDom parser = new WeatherDom();
		List<Weather> list = parser.getWeatherData();

		for (Weather info : list) {
			System.out.println(info);
		}
	}

	private void getWeatherInfo(String uri) throws Exception {
		URL url = new URL(uri);
		// 방법 1 - 헤더 값 조정이 가능해서 많이 씀
		// 요청 방식 중에 POST 방식을 이용하거나 요청시 헤더 정보를 추가하는 경우 등에 사용된다.
		HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
		InputStream in1 = urlConn.getInputStream();
		// 방법 2 - 단순한 url 호출시
		InputStream in = url.openStream();

		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		StringBuffer xml = new StringBuffer();
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;

			xml.append(line);
		}
		System.out.println(xml);

		createXMLFile(xml);
	}

	private void createXMLFile(StringBuffer xml) throws Exception {
		FileWriter fw = new FileWriter("weather.xml");
		fw.write(xml.toString());
		fw.close();
		System.out.println("날씨 정보가 저장되었습니다.");
	}
}
