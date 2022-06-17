package com.workaccounts.utilities;

public class Waits {

	public static void waitFor100Millis() {
		sleep(100);
	}

	public static void waitFor200Millis() {
		sleep(200);
	}

	public static void waitFor300Millis() {
		sleep(300);
	}

	public static void waitFor500Millis() {
		sleep(500);
	}

	public static void waitFor1Sec() {
		sleep(1000);
	}

	public static void waitFor2Sec() {
		sleep(2000);
	}

	public static void waitFor3Sec() {
		sleep(3000);
	}

	public static void waitFor5Sec() {
		sleep(5000);
	}

	public static void waitFor10Sec() {
		sleep(10000);
	}

	public static void waitFor30Sec() {
		sleep(30000);
	}

	public static void waitFor60Sec() {
		sleep(60000);
	}

	public static void waitFor5Min() {
		sleep(300000);
	}

	public static void waitFor10Min() {
		sleep(600000);
	}

	private static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
