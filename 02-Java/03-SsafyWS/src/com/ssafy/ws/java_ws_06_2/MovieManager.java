package com.ssafy.ws.java_ws_06_2;

import java.util.Arrays;

public class MovieManager {
	private final int MAX_SIZE = 100;
	private Movie[] movieList = new Movie[MAX_SIZE];
	private int size;

	public void add(Movie movie) {
		if (size > MAX_SIZE) {
			System.out.println("등록에 실패했습니다.");
		} else {
			movieList[size++] = movie;
		}
	}

	public Movie[] getList() {
		return Arrays.copyOf(movieList, size);
	}

	public Movie[] getMovies() {
		Movie[] res = new Movie[size];

		return res;
	}

	public SeriesMovie[] getSeriesMovies() {
		return getSeriesMovies();
	}

	public Movie[] searchByTitle(String title) {
		Movie[] res;
		int cnt = 0;
		int idx = 0;

		for (int i = 0; i < size; i++) {
			if (movieList[i].getTitle().contains(title)) {
				cnt++;
			}
		}

		res = new Movie[cnt];
		for (int i = 0; i < size; i++) {
			if (movieList[i].getTitle().contains(title)) {
				res[idx++] = movieList[i];
			}
		}
		return res;
	}

	public double getRunningTimeAvg() {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += movieList[i].getRunningTime();
		}

		return sum / (double) size;
	}

}
