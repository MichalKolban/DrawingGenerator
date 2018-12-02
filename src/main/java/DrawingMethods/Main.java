package DrawingMethods;

public class Main {

    public static void main(String[] args) {

        DrawingSquere squere = new DrawingSquere();

        squere.squere(4);

        System.out.println("===========");

        DrawingRactangle ractangle = new DrawingRactangle();

        ractangle.ractangle(2,3);

        System.out.println("===========");

        DrawingTriangle triangle = new DrawingTriangle();

        triangle.triangle(5);

        System.out.println("===========");

        DrawingTriangleUpsideDown triangleUpsideDown = new DrawingTriangleUpsideDown();

        triangleUpsideDown.triangleUpside(4);

        System.out.println("===========");

        triangle.triangle(10);
        triangleUpsideDown.triangleUpside(10);

        System.out.println("===========");

        DrawingEquialaterialTriangle drawingEquialaterialTriangle = new DrawingEquialaterialTriangle();

        drawingEquialaterialTriangle.triangleEqu(8);

    }
}
