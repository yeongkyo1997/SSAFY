/*
 * public
 * protected
 * default
 * private
 */
package com.ssafy.board.step01;

import java.util.Arrays;
import java.util.Scanner;

class BoardUI {
	Scanner sc = new Scanner(System.in);
	Board[] list = new Board[2];
	static int pos = 0;

	void start() {

		System.out.println("게시판 관리 프로그램 V1\r\n");
		outer: while (true) {
			switch (menu()) {
				case 1:
					list();
					break;
				case 2:
					write();
					break;
				case 0:
					quit();
					return;
			}
		}
	}

	private void quit() {
		System.out.println("종료 메뉴 선택");
	}

	private void write() {
		if (list.length == pos) {
			list = Arrays.copyOf(list, pos * 2);
			/*
			 * Board[] tmp = new Board[pos * 2]; System.arraycopy(list, 0, tmp, 0, pos);
			 * 
			 * list = tmp;
			 */
		}
		System.out.print("글쓴이: ");
		String writer = sc.nextLine();
		System.out.print("제목: ");
		String title = sc.nextLine();
		System.out.print("내용: ");
		String content = sc.nextLine();

		Board b = new Board(writer, title, content);
		b.no = Sequence.nextVal();
		list[pos++] = b;

		System.out.println("등록되었습니다.");
	}

	private void list() {
		System.out.println("-------------------\r");
		System.out.println("글번호\t제목\t글쓴이");
		System.out.println("-------------------\r");
		if (pos == 0) {
			System.out.println("등록된 게시글이 존재하지 않습니다.");
		}

		for (int i = pos - 1; i >= 0; i--) {
			Board b = list[i];
			System.out.println(b.no + "\t" + b.title + "\t" + b.writer);
		}
		System.out.println("-------------------\r");
	}

	private int menu() {
		System.out.println("-------------------\r");
		System.out.print("1. 목록\r\n2. 등록\r\n0. 종료\r\n-------------------\r\n메뉴(번호) : ");
		return Integer.parseInt(sc.nextLine());
	}
}