import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Please enter the lenght of the triangle: ");
        int len = take.nextInt();
        for (int i = 1; i <=len;i++)
        {
            for (int j = 0; j<i;j++)
            {
                System.out.print(" ");
            }
            for (int e = 0; e <((2*len+1)-i*2); e++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
