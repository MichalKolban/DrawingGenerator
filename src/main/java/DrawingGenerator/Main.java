package DrawingGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {

        boolean iscorrectInput = false;

        do{
        System.out.println("Hello, welcome to drawing generator!");
        System.out.println("Choose an opction :");
        System.out.println();
        System.out.println("1 - Make square");
        System.out.println("2 - Make ractangle");
        System.out.println("3 - Make equilateral triangle");
        System.out.println("0 - to shout down the program");


            try {

                Scanner scanner = new Scanner(System.in);

                int choose = scanner.nextInt();


                switch (choose) {
                    case 1:

                        if (choose == 1) {
                            System.out.println("Tell me how big :");
                            int big = scanner.nextInt();
                            {
                                for (int i = 1; i <= big; i++) {
                                    for (int j = 1; j <= big; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println(" ");
                                }
                            }
                        }
                    case 2:
                        if (choose == 2) {
                            System.out.println("Tell me how big :");
                            System.out.println("First side how big ?");
                            int first = scanner.nextInt();
                            System.out.println("second side how long ?");
                            int second = scanner.nextInt();
                            for (int i = 1; i <= second; i++) {
                                for (int j = 1; j <= first; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println(" ");
                            }
                        }
                    case 3:
                        if (choose == 3) {
                            System.out.println("Tell me how tall:");
                            int tall = scanner.nextInt();
                            for (int i = 1; i <= tall; i++) {
                                for (int j = i; j <= tall; j++)
                                    System.out.print(" ");
                                for (int k = 1; k < (i * 2); k++)
                                    System.out.print("*");
                                System.out.println();
                            }
                        }
                    case 0:
                        if(choose == 0){
                            System.out.println("Program is shutting down...");

                        }break;
                    default:

                        iscorrectInput = false;
                }
            } catch (InputMismatchException e) {
                iscorrectInput = true;
                System.out.println("This is not a number, try again");
            }
        }while (iscorrectInput);
    }
}
