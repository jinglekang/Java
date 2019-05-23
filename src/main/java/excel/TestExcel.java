package excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestExcel {
    public static void main(String[] args) throws Exception {
        Map<String, String> item = new HashMap<>();
        item.put("field0001", "张三");
        item.put("field0002", "财务部");
        item.put("field0003", "财务经理");
        item.put("field0004", "自定义控件替换测试");
        item.put("field0005", "测试字段替换测试");
        replaceModel(item, "excel/easy.xlsx", "easyOut.xlsx");
    }

    private static void replaceModel(Map<String, String> item, String inPath, String outPath) throws Exception {
        Workbook wb = new XSSFWorkbook(FileUtil.getResourcesFileInputStream(inPath));
        Sheet sheet = wb.getSheetAt(0);
        Iterator rows = sheet.rowIterator();
        while (rows.hasNext()) {
            XSSFRow row = (XSSFRow) rows.next();
            if (row != null) {
                int num = row.getLastCellNum();
                for (int i = 0; i < num; i++) {
                    XSSFCell cell = row.getCell(i);
                    if (cell != null) {
                        cell.setCellType(CellType.STRING);
                        if (cell.getStringCellValue() != null) {
                            String value = cell.getStringCellValue();
                            if (!"".equals(value)) {
                                Set<String> keySet = item.keySet();
                                for (String text : keySet) {
                                    if (value.equalsIgnoreCase(text)) {
                                        cell.setCellValue(item.get(text));
                                        break;
                                    }
                                }
                            } else {
                                cell.setCellValue("");
                            }
                        }

                    }
                }
            }
        }
        // 输出文件
        FileOutputStream fileOut = new FileOutputStream(outPath);
        wb.write(fileOut);
        fileOut.close();
    }
}