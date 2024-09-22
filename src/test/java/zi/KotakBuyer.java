package zi;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class KotakBuyer {


    public static void main(String[] args) {
        // Path to the sample file
      String path = "C:\\Users\\AnuragExternal\\KotakSampleFile.xlsx";

        // Number of invoices to generate
        int numInvoices = 25000;  // You can modify this number as needed

        try {
            // Load the existing workbook and sheet
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new File(path));
            XSSFSheet sheet = xssfWorkbook.getSheetAt(0);

            // Create header row if needed (comment this out if headers are already in the template)
//            String[] headers = {
//                    "Vendor Category", "Vendor Code", "Vendor Name",
//                    "Invoice Number", "Invoice Date", "Invoice Acceptance Date",
//                    "Gross Invoice Value (In Rs)", "Accepted Invoice Amount (In Rs)", "Due Date"
//            };
          /*  Row headerRow = sheet.createRow(0);
            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
            }*/

            // Populate the sheet with invoice data
            for (int i = 0; i < numInvoices; i++) {
                int rowNumber = i+3;
                Row row = sheet.createRow(rowNumber); // Adjust the starting row index as needed
                row.createCell(0).setCellValue("MSME");
                row.createCell(1).setCellValue("FRONT2");
                row.createCell(2).setCellValue("Front 6");
                row.createCell(3).setCellValue(String.format("NBY1_03_AUG20-%05d", i + 8));
                row.createCell(4).setCellValue("08.20.2024");
                row.createCell(5).setCellValue("08.20.2024");
                row.createCell(7).setCellValue(100);
                row.createCell(8).setCellValue(100);
                row.createCell(9).setCellValue("08.31.2024");
            }

            // Save the generated data to a new Excel file
            try (FileOutputStream fileOutputStream = new FileOutputStream("CRED_AAK_INVOICE_20082024_03.xlsx")) {
                xssfWorkbook.write(fileOutputStream);
            }

            // Close the workbook
          //  xssfWorkbook.close();

            System.out.println("Excel file created successfully with " + numInvoices + " invoices!");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        }
    }
}