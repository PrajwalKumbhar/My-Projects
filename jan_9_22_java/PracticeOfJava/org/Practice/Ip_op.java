package org.Practice;

public class Ip_op {

	public static void main(String[] args) {

		String in = "245jhhsaj";

		String op = "";

		for (int i = 0; i < in.length(); i++) {
			for (int j = 0; j < 9; j++) {
				if (in.charAt(i) == j) {
					int temp = in.charAt(i);
					op = op + temp;
				}
			}
		}
		System.out.println(op+"++++++++++");
	}
}
