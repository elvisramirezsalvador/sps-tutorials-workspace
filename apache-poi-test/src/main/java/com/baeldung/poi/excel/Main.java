package com.baeldung.poi.excel;

import java.io.File;
import java.io.IOException;

public class Main {

	private static String FILE_NAME = "temp.xlsx";

	public static void generateExcelFile() throws IOException {

		File currDir = new File(".");
		String path = currDir.getAbsolutePath();
		String fileLocation = path.substring(0, path.length() - 1) + FILE_NAME;

		ExcelPOIHelper excelPOIHelper = new ExcelPOIHelper();
		excelPOIHelper.writeExcel();
	}

	public static void main(String[] args) throws IOException {
		generateExcelFile();
	}

}
