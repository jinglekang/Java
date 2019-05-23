package base.base;

public class StringBufferDemo {
    public static void main(String[] args) {
        String sb = ("<forms>\n" +
                "    <formExport>\n" +
                "        <summary/>\n" +
                "        <values>\n" +
                "            <column name=\"时间\">\n" +
                "                <value>field0001</value>\n" +
                "            </column>\n" +
                "            <column name=\"单据号\">\n" +
                "                <value>field0002</value>\n" +
                "            </column>\n" +
                "            <column name=\"日志\">\n" +
                "                <value>field0003</value>\n" +
                "            </column>\n" +
                "        </values>\n" +
                "    </formExport>\n" +
                "</forms>");
        sb = sb.replace("field0001","2018.15.58");
        sb = sb.replace("field0002","GT454613");
        sb = sb.replace("field0003","我是一个好人么？");
        System.out.println(sb);
    }
}
