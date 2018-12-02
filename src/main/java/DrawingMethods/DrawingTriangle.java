package DrawingMethods;

public class DrawingTriangle {

    public void triangle(int size){
        for(int i = 1; i<=size; i++){
            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println(" ");
    }
}}
