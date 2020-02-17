package shootingAtTheSquare;

import java.util.Random;
import java.util.Scanner;

public class shootingGame {
    public static void main(String[] args) {

        // Creation Part
        System.out.println("All set. Get ready to rumble!");
        int [][] square = new int[6][6];
        Random random = new Random();
        int a=random.nextInt(5) +1;
        int b=random.nextInt(5) +1;
        int userrow=0;
        int usercol=0;

        // Process
        // System.out.println(a + " " + b);

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input line number: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please input integer");
                continue;
            }
            userrow = scanner.nextInt();
            //square[userrow][0] = 1;

            System.out.println("Please input row number: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please Input integer");
                continue;
            }
            usercol = scanner.nextInt();
            square[userrow][usercol] = 1;
            if (userrow==a && usercol==b) square[a][b]=2;

            // Printing Part
            for (int x = 0;  x < 6;  x++) {
                for (int y = 0; y < 6 ; y++) {
                    if (x==0) {
                        System.out.print(y + "|");
                    }
                    else if (y==0) {
                        System.out.print(x + "|");
                    }
                    else if (square[x][y]==1) {
                        System.out.print("*|");
                    }
                    else if (square[x][y]==2) {
                        System.out.print("x|");
                    }
                    else {
                        System.out.print("-" + "|");
                    }

                }
                System.out.println();
            }

        } while (userrow!=a && usercol!=b);

        System.out.println("Congratulations you hit target");

        //Printing




    }
}
