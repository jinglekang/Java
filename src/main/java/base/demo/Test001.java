package base.demo;

public class Test001 {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        i++;
        ++j;
        System.out.println(i);
        System.out.println(j);


        // String a="abc";
        // String b="abc";
        String a =new String("abc") ;
        String b =new String("Abc") ;
        if(a==b){
            System.out.println("地址相等");
        }else {
            System.out.println("地址不相等");
        }
        if(a.equals(b)){
            System.out.println("字符串相等");
        }else {
            System.out.println("字符串不相等");
        }
        if(a.equalsIgnoreCase(b)){
            System.out.println("字符串相等（不区分大小写）");

        } else {
            System.out.println("字符串不相等（不区分大小写）");
        }   }
}
