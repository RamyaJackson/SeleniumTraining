package org.Base;

import java.io.IOException;
public class Inmakes extends BaseClass {
	public static void main(String[] args) throws IOException {
		createNewExcelFile(0, 0, "Java");
		createCell(0, 1, "Cucumber");
		createCell(0, 2, "Framework");
		createCell(0, 3, "WebDriver");
		//2. row 
		createRow(0, 0, "Maven");
		createRow(0, 1, "Pom");
		createRow(0, 2, "Xlsx");
		createRow(0, 3, "File");
		
	}
}






