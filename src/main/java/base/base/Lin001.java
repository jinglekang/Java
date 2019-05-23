package base.base;

public class Lin001 {
	public static void main(String[] args) {
		print99();
	} 
    {  
        for(int i = 1; i <= 9; i++)  
        {  
            for(int j = 1; j <= i; j++)  
            {  
                System.out.print(j + "X" + i + "=" + i*j + "\t");  
            }  
              
            System.out.println();  
        }  
    }  
	public static void print99() {
		for (int i = 1, j = 1; j <= 9; i++) {
			System.out.print(i + "*" + j + "=" + i * j + " ");
			if (i == j) {
				i = 0;
				j++;
				System.out.println();
			}
		}
	}
}