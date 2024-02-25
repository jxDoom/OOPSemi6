package lsp1;

import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
//        square.setSide(4);
//        System.out.printf("In a shape area = %d\n", square.getArea());
        ShapeView view = new ShapeView(new Rectangle(3, 4));
        ShapeView view1 = new ShapeView(square);
        view.showArea();
        view1.showArea();
    }
}
