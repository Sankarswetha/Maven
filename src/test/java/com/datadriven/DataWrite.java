package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrite {
	public static void write_Data() throws IOException {
		File f = new File("C:\\Users\\sweth\\OneDrive\\Documents\\Maven_project\\Excell\\dataWrite.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet createSheet = w.createSheet("Data");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Name");
		w.getSheet("Data").getRow(0).createCell(1).setCellValue("roll no");
		w.getSheet("Data").getRow(0).createCell(2).setCellValue("class");
		w.getSheet("Data").createRow(1).createCell(0).setCellValue("swetha s");
		w.getSheet("Data").getRow(1).createCell(1).setCellValue(3124);
		w.getSheet("Data").getRow(1).createCell(2).setCellValue("11th");
		
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		}
	public static void main(String[] args) throws IOException {
		write_Data();
		
	}

}
