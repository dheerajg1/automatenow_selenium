package com.automatenow.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.automatenow.constants.FrameworkConstants;

public final class ExcelUtils {
	
	private ExcelUtils(){}
	
	public static FileInputStream fs;
	public static List<Map<String, String>> list;
	
	public static List<Map<String, String>> getTestDetails(String sheetname){
				
		try {
			fs = new FileInputStream(FrameworkConstants.getExcelPath());
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet(sheetname);
			
			Map<String, String> map = null;
			int lastrownum = sheet.getLastRowNum();
			int lastcolnum = sheet.getRow(0).getLastCellNum();
			
		    list = new ArrayList<Map<String,String>>();
			
			for(int i=1; i<=lastrownum; i++) {
				map = new HashMap<String, String>();
				for(int j=0; j<lastcolnum; j++) {
					String key = sheet.getRow(0).getCell(j).getStringCellValue();
					String value = sheet.getRow(i).getCell(j).getStringCellValue();
					map.put(key, value);
				}
				list.add(map);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(Objects.nonNull(fs)) {
				try {
					fs.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		return list;
		
	}
	
}
