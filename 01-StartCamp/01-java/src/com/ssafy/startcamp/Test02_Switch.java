package com.ssafy.startcamp;

public class Test02_Switch {
	public static void main(String[] args) {
		/*
		 * 수식 자리에 올 수 있는 것들 1.4 버전까지 : int로 자동 형 변환 되는 것들(byte, short, char, int) 1.5 버전
		 * 추가 : enum(열거형) 1.7 버전 추가 : String
		 * 
		 * switch (수식) { case 값: 처리할일; break;(선택)
		 * 
		 * case 값: 처리할일; break;(선택) ....
		 * 
		 * default: 처리할일;
		 */

		{
			System.out.println("1.4 확인");
			int num = 3;
			int result = 0;

			switch (num) {
			case 1:
				System.out.println("case 1");
				result += 1;
				break;
			case 2:
				System.out.println("case 2");
				result += 2;
				break;
			default:
				System.out.println("default");
				result += 1;
			case 3:
				System.out.println("case 3");
				result += 3;
//			default:
//				System.out.println("default");
//				result += 1;
			}
			System.out.println(result);
		}

		{
			String result = "";
			System.out.println("1.7 String 확인");
			final String SEASON = "summer";

			switch (SEASON) {
			case "spring":
				result = "새싹이 나오기 시작한다.";
				break;
			case "summer":
				result = "2010년 이후로 사람들이 가장 싫어하는 계절로 통계가 잡힌다.";
				break;
			case "fall":
				result = "단풍...";
				break;
			case "winter":
				result = "방전이 잘되는 계절";
				break;
			default:
				result = "잘못된  입력";
			}
			System.out.println(result);
		}

		{
			String result = "";
			System.out.println("1.5 enum 확인");
			Season season = Season.SUMMER;

			switch (season) {
			case SPRING:
				result = "새싹이 나오기 시작한다.";
				break;
			case SUMMER:
				result = "2010년 이후로 사람들이 가장 싫어하는 계절로 통계가 잡힌다.";
				break;
			case FALL:
				result = "단풍...";
				break;
			case WINTER:
				result = "방전이 잘되는 계절";
				break;
			default:
				result = "잘못된  입력";
			}
			System.out.println(result);
		}
	}

	enum Season {
		SPRING, SUMMER, FALL, WINTER
	}
}