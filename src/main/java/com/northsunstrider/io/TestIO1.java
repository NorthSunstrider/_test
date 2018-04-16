package com.northsunstrider.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileInputStreamTest();
	}

	public static void fileInputStreamTest() {
		try {
			File file = new File("d://Matrix//1.txt");
			FileInputStream fis = new FileInputStream(file);
			byte[] byteArray = new byte[1024];
			int flag = 0;
			do {
				flag = fis.read(byteArray);
				String str = new String(byteArray, 0, flag);
				System.out.println(str);

			} while (flag > 0);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
