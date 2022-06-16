package Automation.excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExe {
	public static void main(String[] args) throws IOException, Exception {
		Scanner scan = new Scanner(System.in);
		String dir = System.getProperty("user.dir");
		System.out.println("enter file name: ");
		String fileName = scan.nextLine();
		String path = dir + File.separator + fileName;
		File ofile = new File(path);
		ofile.createNewFile();
	FileInputStream oInput = new FileInputStream(ofile);
		@SuppressWarnings("resource")
		XSSFWorkbook obook = new XSSFWorkbook(oInput);
		
		XSSFSheet oSheet = obook.createSheet("Sheet 9");
		XSSFRow Orow;
		for (int i = 0; i < 3; i++) {
			Orow = oSheet.createRow(i);
			for (int j = 0; j < 1; j++) {
				XSSFCell ocell = Orow.createCell(j);
				System.out.println("enter name: ");
				ocell.setCellValue(scan.next());

			}
		}
		FileOutputStream oFileOS = new FileOutputStream(ofile);
		obook.write(oFileOS);
		oFileOS.close();
	}
}
