package base.io;

import java.io.File;

class FileUtils {
    /**
     * 列出指定路径的所有文件（包含子目录）
     *
     * @param dir
     */
    static void listFile(File dir) {
        if (!dir.exists()) {
            throw new IllegalArgumentException("目录" + dir + "不存在");
        }
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException(dir + "不是目录");
        }
        // String[] str = dir.list();
        // for (String s : str){
        //     System.out.println(dir+"\\"+s);
        // }
        File[] files = dir.listFiles();
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isDirectory()) {
                    listFile(file);
                } else {
                    System.out.println(file);
                }
            }
        }


        // for (File file : files) {
        //     System.out.println(file);
        // }
    }
}
