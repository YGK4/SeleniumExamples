package com.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingdetafromExcelfile {

	public ArrayList<String> readExcel(String excelSheet) {

		ArrayList<String> excelValue = new ArrayList<String>();
		String filePath = excelSheet;
		// "C:\\Users\\GOPAL\\OneDrive\\Desktop\\sample.xlsx"; // Path to your Excel
		// file

		try (FileInputStream fis = new FileInputStream(new File(filePath)); Workbook workbook = new XSSFWorkbook(fis)) {

			// Get the first sheet
			Sheet sheet = workbook.getSheetAt(0);

			// Iterate through rows
			for (Row row : sheet) {
				// Iterate through cells in the row
				for (Cell cell : row) {
					switch (cell.getCellType()) {
					case STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						excelValue.add(cell.getStringCellValue());
						break;
					case NUMERIC:
						if (DateUtil.isCellDateFormatted(cell)) {
							System.out.print(cell.getDateCellValue() + "\t");
							excelValue.add(cell.getStringCellValue());

						} else {
							System.out.print(cell.getNumericCellValue() + "\t");
							excelValue.add(cell.getStringCellValue());

						}
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue() + "\t");
						excelValue.add(cell.getStringCellValue());

						break;
					default:
						System.out.print("UNKNOWN\t");
						break;
					}
				}
				System.out.println(); // New line after each row
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return excelValue;
	}

	public static void main(String[] args) {
		
			}
	       	}
