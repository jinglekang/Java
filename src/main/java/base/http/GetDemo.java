package base.http;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GetDemo {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            try {
                // URL url = new URL("http://opd.51zhanzhuang.cn/api/dsp/dbclick.do?jsv=v1.8&pid=834033262&sid=524009337&tid=373847494&uid=1555238438957jfibeedaa7175331437&crc=&coo=1&uct=&ref=&ws=980*1742&ds=980*6033&cr=360*640&ip=&fc=0&ho=1&ct=2&bl=Win32&dsp=2&suid=&ssid=&ads=300px*400px&vtid=&whid=&_c=1&_s=1&_p=1&_mi=undefined&_i=undefined&_o=0&shs=1&sn=3386104601&_u=1555238438957jfibeedaa7175331437&_dlt=&_l=aHR0cDovL2ludGVyYWN0aW9uLmRvdW1vYmkuY24vZ2FtZUh0bWw%2FYXBwa2V5PTMzNTY4Y2E4YzJiNDY0Y2VjYzk2YzllMWYyZTViZTQzJmFkU3BhY2VLZXk9ODczM2FjOTFlNTVlMTJhYWE1MmE0YTNkZGUwYmExNjMmMT0x&_a=undefined&rnd=1150757197&fer=http%3A%2F%2Fwww.tiankong.info%2F&_rnd=923465729");
                // URL url = new URL("http://www.tiankong.info");
                URL url = new URL("http://opd.51zhanzhuang.cn/api/dsp/dbclick.do?jsv=v1.8&pid=834033262&sid=524009337&tid=373847494&uid=1555254075228fciaaeeab9848389167&crc=&coo=1&uct=&ref=&ws=980*1742&ds=980*6033&cr=360*640&ip=&fc=0&ho=1&ct=2&bl=Win32&dsp=2&suid=&ssid=&ads=300px*400px&vtid=&whid=&_c=1&_s=1&_p=1&_mi=undefined&_i=undefined&_o=0&shs=1&sn=3391229987&_u=1555254075228fciaaeeab9848389167&_dlt=&_l=aHR0cDovL2ludGVyYWN0aW9uLmRvdW1vYmkuY24vZ2FtZUh0bWw%2FYXBwa2V5PTMzNTY4Y2E4YzJiNDY0Y2VjYzk2YzllMWYyZTViZTQzJmFkU3BhY2VLZXk9ODczM2FjOTFlNTVlMTJhYWE1MmE0YTNkZGUwYmExNjMmMT0x&_a=undefined&rnd=1387727845&fer=http%3A%2F%2Fwww.tiankong.info%2F");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36");
                conn.connect();
                InputStream is = conn.getInputStream();
                BufferedReader in = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
                String line;
                StringBuilder str = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    str.append(line);
                }
                i++;
                if (i % 100 == 0) {
                    System.out.println("已执行" + i + "次，正在进行中..." + str);
                }
                if (i > 100000) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
