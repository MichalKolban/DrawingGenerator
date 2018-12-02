package DrawingTriangles;

public class Main {

    public static void main(String[] args) {

        int size = 4;
        int length = 6;

        System.out.println("=== SQUARE ===");
        System.out.println();
                                                                        // Draw SQUARE
        for(int i = 1; i<= size; i++){                                  //
            for(int j=1; j<=size; j++){                                 //  * * *
                System.out.print("* ");                                 //  * * *
            }System.out.println(" ");                                   //  * * *
        }

        System.out.println();
        System.out.println("=== RACTANGLE ===");
        System.out.println();                                           // Draw RACTANGLE
                                                                        //
        for(int i=1 ; i<= size; i++){                                   //  * * *
            for(int j=1; j<=length; j++){                               //  * * *
                System.out.print("* ");                                 //  * * *
            }                                                           //  * * *
            System.out.println(" ");
        }

        System.out.println();
        System.out.println("=== TRIANGLE ===");
        System.out.println();                                           //Draw TRIANGLE
                                                                        //
        for(int i = 1; i<=length; i++){                                 //  *
            for(int j = 1; j <= i; j++)                                 //  * *
                System.out.print("* ");                                 //  * * *
            System.out.println(" ");                                    //  * * * *
        }

        System.out.println();
        System.out.println("=== TRIANGLE UPSIDE DOWN ===");
        System.out.println();                                           // Draw TRIANGLE upside down
                                                                        //
        for(int i = length; i >= 0; i--){                               //  * * * *
            for(int j = i; j>= 0; j--)                                  //  * * *
                                                                        //  * *
                System.out.print("* ");                                 //  *
            System.out.println(" ");
        }

        System.out.println();
        System.out.println("=== EQUILATERAL TRIANGLE ===");
        System.out.println();                                           // Draw EQUILATERAL TRIANGLE
                                                                        //
                                                                        //        *
        for(int i =1;i<=10;i++){                                        //       * *
            for(int j=i; j<=10;j++)                                     //      * * *
                System.out.print(" ");                                  //    * * * * *
            for(int k=1;k<(i*2);k++)                                    //  * * * * * * *
                System.out.print("*");
            System.out.println();
        }

        System.out.println();
        System.out.println("=== RACTANGULAR TRIANGLE LEFT SIDE ===");
        System.out.println();
                                                                        // Draw RACTANGURAL TRIANGLE LEFT SIDE   (u need to erase one space in 1st sout
        for(int i =1;i<=10;i++) {                                       //
            for (int j = i; j <= 10; j++)                               //  *
                System.out.print("");                                   //  * *
            for (int k = 1; k < (i * 2); k++)                           //  * * *
                System.out.print("*");                                  //  * * * *
            System.out.println();
        }

        System.out.println();
        System.out.println("=== RACTANGULAR TRIANGLE RIGHT SIDE ===");
        System.out.println();
                                                                        // Draw RACTANGURAL TRIANGLE RIGHT SIDE   (u need to add 2 space in 1st sout
        for(int i =1;i<=10;i++) {                                       //
            for (int j = i; j <= 10; j++)                               //        *
                System.out.print("  ");                                 //      * *
            for (int k = 1; k < (i * 2); k++)                           //    * * *
                System.out.print("*");                                  //  * * * *
            System.out.println();
        }
    }



}


