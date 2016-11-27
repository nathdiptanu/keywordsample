package keyword_sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.File;

public class ReadExcel {

	Workbook wbWorkbook;
	Sheet shSheet;
    static WritableWorkbook wwbCopy;
    

	
	public void openSheet(String filePath) {
		FileInputStream fs;
		try {
			fs = new FileInputStream(filePath);
			wbWorkbook = Workbook.getWorkbook(fs);
			shSheet = wbWorkbook.getSheet(0);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getValueFromCell(int iColNumber, int iRowNumber) {
		return shSheet.getCell(iColNumber, iRowNumber).getContents();
	}

	public int getRowCount() {
		return shSheet.getRows();
	}

	public int getColumnCount() {
		return shSheet.getColumns();
	}
	
}