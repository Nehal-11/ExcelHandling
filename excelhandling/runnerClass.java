package Automation.excelhandling;
import java.io.IOException;
import java.util.ArrayList;

public class runnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		excelWriter object = new excelWriter();
    try {
		object.writeToXlsxFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
