package numbers;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class secretNumber {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int secretnumber;
    String name;
    secretnumber=random.nextInt(100);
    int a = 0;
    int n = 0;
    int[] inputarray = new int[100];
    System.out.println("Let the game begin!");
    System.out.println("Please enter your name: ");
    name = scanner.next();
    do {
      System.out.print("Guess the number: ");
      a = scanner.nextInt();

      inputarray[n] = a;
      n++;
      System.out.println(secretnumber);
      if (a > secretnumber) System.out.println("Entered number is bigger than hidden number. Try again");
      else if (a < secretnumber) System.out.println("Entered number is less than hidden number. Try again");

    } while (a != secretnumber);
    int counter=0;
    for (int number:  inputarray) {
      if (inputarray[counter] !=0) counter++;
    };
    //  System.out.println("Array size " + counter);
    Arrays.sort(inputarray);
    int[] sortedarray = new int[counter];
    int j = inputarray.length-1;
    for (int i = 0; i <= counter; i++) {
      if (inputarray[j] != 0) {sortedarray[i] = inputarray[j];
        j--;
      }
    }
    System.out.println("Congratulations you won " + name + "!");
    //       System.out.println("Your wrong inputs are these: " + Arrays.toString(inputarray));
    System.out.println("All your input is sorted from larger to smaller" + Arrays.toString(sortedarray));
  }
}
