package weekPlanner;

import java.util.Scanner;

public class weekPlanner {
    public static void main(String[] args) {
        // Creation and collecting data
        String [][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do homework";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to cinema";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "do workout";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "Play football";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "do homework1";
        schedule[5][0] = "Friday";
        schedule[5][1] = "go to cinema with Friends";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "do homework 2";

        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Please input the day of the week: ");
            input = scanner.next();
            String regx = "^[a-zA-Z]*";
            if (input.matches(regx)) {
                input = input.toLowerCase();
                //System.out.println(input);
                switch (input) {
                    case "sunday":
                        System.out.println(schedule[0][1]);
                        break;
                    case "monday":
                        System.out.println(schedule[1][1]);
                        break;
                    case "tuesday":
                        System.out.println(schedule[2][1]);
                        break;
                    case "wednesday":
                        System.out.println(schedule[3][1]);
                        break;
                    case "thursday":
                        System.out.println(schedule[4][1]);
                        break;
                    case "friday":
                        System.out.println(schedule[5][1]);
                        break;
                    case "saturday":
                        System.out.println(schedule[6][1]);
                    default:
                        System.out.println("Please input valid day name like (Monday, Sunday e.g)");

                }
            } else System.out.println("Sorry I don't understand what you entered: ");


        } while (!input.equals("exit"));

    }
}
