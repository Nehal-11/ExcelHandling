package Automation.excelhandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class pathFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String dir = System.getProperty("user.dir"); //in which folder 
System.out.println(dir);
Scanner scan = new Scanner(System.in);
System.out.println("enter file name: ");
String fileName = scan.nextLine();
String filePath = dir + File.separator + fileName ;
System.out.println(filePath);
File oFile = new File(filePath);
oFile.createNewFile();
	}

}
