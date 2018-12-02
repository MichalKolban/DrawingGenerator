package DrawingMethods;

public class DrawingEquialaterialTriangle {

    public void triangleEqu(int size){
        for(int i =1;i<=size;i++){
            for(int j=i; j<=size;j++)
                System.out.print(" ");
            for(int z=1;z<(i*2);z++)
                System.out.print("*");
            System.out.println();
    }
}}
