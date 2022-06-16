package Automation.excelhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class excel11 {
	Scanner scan = new Scanner(System.in);
	List arrayList = new ArrayList();

	List fileReader(String stOne, String stTwo, String stThree) {
		FileReader file1, file2, file3;
		String line;
		try {
			file1 = new FileReader(stOne);
			BufferedReader buffer1 = new BufferedReader(file1);

			while ((line = buffer1.readLine()) != null) {

				String words[] = line.split(" ");
				System.out.println(Arrays.toString(words));
				arrayList.add(Arrays.toString(words));

			}
			buffer1.close();
			file2 = new FileReader(stTwo);
			BufferedReader buffer2 = new BufferedReader(file2);

			while ((line = buffer2.readLine()) != null) {

				String words[] = line.split(" ");
				System.out.println(Arrays.toString(words));
				arrayList.add(Arrays.toString(words));

			}
			buffer2.close();
			file3 = new FileReader(stThree);
			BufferedReader buffer3 = new BufferedReader(file3);

			while ((line = buffer3.readLine()) != null) {

				String words[] = line.split(" ");
				System.out.println(Arrays.toString(words));
				arrayList.add(Arrays.toString(words));

			}
			buffer3.close();
			System.out.println(arrayList);
		} catch (IOException exe) {
			// TODO Auto-generated catch block
			exe.printStackTrace();
		}
		return arrayList;

	}
}
