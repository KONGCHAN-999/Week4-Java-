import java.util.Scanner;
// 
// 
// Program N*N Row and Column 
// @By-Kongchan
// 
public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = sc.nextInt();

        int score[][] = new int[number][number];
        int ch = 1;
        int sum = 1;
        
        for (int row = 0; row < number; row++) {
            for (int column = 0; column < number; column++) {
                score[row][column] = sum;
                sum++;
            }
            if (ch % 2 == 0) {
                for (int x = number - 1; x >= 0; x--) {
                    System.out.print(score[row][x]);
                }
            } else {
                for (int j = 0; j < number; j++) {
                    System.out.print(score[row][j]);
                }
            }
            ch++;
            System.out.println();
        }
    }
}
