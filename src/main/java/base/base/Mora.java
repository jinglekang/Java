/**
 * 功能：猜拳游戏
 */

package base.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Mora {
    public static void main(String[] args) throws IOException {
        System.out.println("开始猜拳，请输入数字开始：\n0：查询战绩\n\n1：代表石头\n2：代表剪刀\n3：代表布\n4：结束游戏");
        for (int a = 1; a == 1; a = a) {
            Guess guess = new Guess();
            BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in));
            int manNum = Integer.parseInt(buf1.readLine());
            int computerNum = (int) guess.Num();
            String strComNum = guess.strNum(computerNum);
            String strManNum = guess.strNum(manNum);
            guess.strNum(manNum);
            if (manNum>=1&&manNum<=3&&computerNum - manNum == 0) {
                System.out.println("平局");
                System.out.println("电脑出了：" + strComNum + "\n" + "你出了：" + strManNum);

            } else if (manNum>=1&&manNum<=3&&computerNum - manNum == 2) {
                System.out.println("你输了");
                System.out.println("电脑出了：" + strComNum + "\n" + "你出了：" + strManNum);
                guess.comWin++;

            } else if (manNum>=1&&manNum<=3&&computerNum - manNum == 1) {
                System.out.println("你赢了");
                System.out.println("电脑出了：" + strComNum + "\n" + "你出了：" + strManNum);
                guess.manWin++;

            } else if (manNum>=1&&manNum<=3&&computerNum - manNum == -1) {
                System.out.println("你输了");
                System.out.println("电脑出了：" + strComNum + "\n" + "你出了：" + strManNum);
                guess.comWin++;

            } else if (manNum>=1&&manNum<=3&&computerNum - manNum == -2) {
                System.out.println("你赢了");
                System.out.println("电脑出了：" + strComNum + "\n" + "你出了：" + strManNum);
                guess.manWin++;
            }else if(manNum==0){
                System.out.println("玩家胜利次数："+guess.manWin);
                System.out.println("电脑胜利次数："+guess.comWin);

            }else if(manNum==4) {
                System.out.println("再见！");
                return;
            }else {
                System.out.println("你输入的数字有误，请重新开始！");
            }
        }


    }
}

class Guess {
    static int comWin=0;
    static int manWin=0;
    public int Num() {
        int b = (int) (Math.random() * 3 + 1);
        return b;
    }

    public String strNum(int num) {
        String strNum = "";
        switch (num) {
            case 1:
                strNum = "石头";
                break;
            case 2:
                strNum = "剪刀";
                break;

            case 3:
                strNum = "布";
                break;
    }
        return strNum;
    }
}