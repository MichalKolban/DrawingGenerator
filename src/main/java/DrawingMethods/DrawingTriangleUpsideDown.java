package DrawingMethods;

public class DrawingTriangleUpsideDown {

    public void triangleUpside(int size){
        for(int i = size; i >= 0; i--){
            for(int j = i; j>= 0; j--)

                System.out.print("* ");
            System.out.println(" ");
        }

    }
}
