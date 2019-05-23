package base.base;

public class Peach {
    public static void main(String[] args) {
        int peach = new Peach().eatPeach(1,10);
        System.out.println(peach);
    }

    public int eatPeach(int peach,int day) {
        peach = (peach + 1) * 2;
        day -= 1;
        if (day == 1) {
            return peach;
        }
        return eatPeach(peach,day);
    }

}
