package com.ssafy.ws.java_ws_06_2;

public class Movie {
	private int id;
	private String title;
	private String genre;
	private int runningTime;

	public Movie() {

	}

	public Movie(int id, String title, String genre, int runningTime) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.runningTime = runningTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
}
