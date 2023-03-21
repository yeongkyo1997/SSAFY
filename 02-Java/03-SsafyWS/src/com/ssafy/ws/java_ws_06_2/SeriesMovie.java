package com.ssafy.ws.java_ws_06_2;

public class SeriesMovie extends Movie {
	private int seriesNum;
	private String episode;

	public SeriesMovie() {

	}

	public SeriesMovie(int id, String title, String genre, int runningTime, int seriesNum, String episode) {
		super(id, title, genre, runningTime);
		this.seriesNum = seriesNum;
		this.episode = episode;
	}

	public int getSeriesNum() {
		return seriesNum;
	}

	public void setSeriesNum(int seriesNum) {
		this.seriesNum = seriesNum;
	}

	public String getEpisode() {
		return episode;
	}

	public void setEpisode(String episode) {
		this.episode = episode;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
