package com.workaccounts.utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.workaccounts.base.Base;

public class ExcelUtils extends Base {

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;


	public Object[][] getTableArray(String FilePath, String SheetName) throws Exception {

		Object[][] tabArray = null;

		FileInputStream ExcelFile = new FileInputStream(FilePath);

		ExcelWBook = new XSSFWorkbook(ExcelFile);

		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		int colCount = getColumnCount();
		int rowCount = getRowCount();
		
		tabArray = new Object[rowCount + 1][colCount];

		for (int i = 0; i < rowCount; i++) {

			for (int j = 0; j <colCount; j++) {

				String cellData = getCellValue(i, j);
				tabArray[i + 1][j] = cellData;

			}
		}
		return (tabArray);

	}

	public int getColumnCount() {
		int colCount = 0;
		try {
			colCount = ExcelWSheet.getPhysicalNumberOfRows();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return colCount;
	}

	public int getRowCount() {
		int colCount = 0;
		try {
			colCount = ExcelWSheet.getRow(0).getPhysicalNumberOfCells();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return colCount;
	}

	public String getCellValue(int rowNum, int colNum) {
		String cellValue = ExcelWSheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		return cellValue;
	}

}
