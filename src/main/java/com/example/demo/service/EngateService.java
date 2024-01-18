package com.example.demo.service;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Engate;
import com.example.demo.repository.EngateRepository;

@Service
public class EngateService {

    @Autowired
    private EngateRepository engateRepository;

    public void processExcel(String excelFilePath) {
        try (FileInputStream fileInputStream = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            Sheet sheet = workbook.getSheetAt(0); 

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);

                Engate Engate = new Engate();
                Engate.setColumn1(getStringCellValue(row.getCell(0)));
                Engate.setColumn2(getNumericCellValue(row.getCell(1)));
         

                engateRepository.save(Engate);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("deprecation")
	private String getStringCellValue(Cell cell) {
        if (cell == null) {
            return null;
        }
        cell.setCellType(CellType.STRING);
        return cell.getStringCellValue();
    }

    @SuppressWarnings("deprecation")
	private Double getNumericCellValue(Cell cell) {
        if (cell == null) {
            return null;
        }
        cell.setCellType(CellType.NUMERIC);
        return cell.getNumericCellValue();
    }


	public Object getAllExcelData() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}


}