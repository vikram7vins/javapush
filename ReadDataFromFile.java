package com.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadDataFromFile {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Sudheer\\SOH\\KT\\File.txt");
		StringBuffer sb = new StringBuffer();
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				// String str=sc.nextLine();
				sb.append(" " + sc.nextLine());

			}
			System.out.println("Display file content :" + sb);
		} catch (Exception e) {

			e.printStackTrace();
		}

		BufferedReader bf = new BufferedReader(new FileReader(file));
		StringBuffer stb = new StringBuffer();
		String texting;
		while ((texting = bf.readLine()) != null) {

			stb.append(texting);

		}
		System.out.println("Another approch to read data from file :" + stb);
	}

}
