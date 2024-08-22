package com.string;

public class Main {

	public static void main(String[] args) {

		String cat = "고양이";
		String cat2 = "고양이";

		if (cat == cat2) {

			System.out.println("같음");
		}

		String dog = new String("개");
		String dog2 = new String("개");

		if (dog == dog2) {

			System.out.println("같음");

		} else {

			System.out.println("다름");
		}

		if (dog.equals(dog2)) {

			System.out.println("문자열 같음");
		} else {

			System.out.println("문자열 다름");
		}

	}
}
