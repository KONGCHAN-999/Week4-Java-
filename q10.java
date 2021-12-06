import java.util.Scanner;
// 
// 
// Program N*N Row and Column 
// @By-Kongchan
// 
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < number; i++) {
            for (int a = 0; a <number; a++) {
                sum +=1; 
                System.out.print(" "+sum);
            }
            System.out.println();
        }
    }
}
