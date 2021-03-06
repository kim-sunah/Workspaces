package com.test01;

public class MTest01 {
	public static void main(String[] args) {
		// prn01();
		// prn02();
		prn03();
		prn04();
	}

	public static void prn01() { // 1부터 10까지
		int i = 1;

		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("i" + i);
	}

	public static void prn02() { // 1부터 10까지
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
		System.out.println("i:" + i);
	}

	public static void prn03() {
		int i = 1;

		while (true) {
			System.out.println(i);
			i++;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void prn04() { // 1 2 3
		int i = 1;

		while (true) {
			System.out.println(i);
			i++;

			if (i == 4) {
				break;
			}
		}
	}

}
