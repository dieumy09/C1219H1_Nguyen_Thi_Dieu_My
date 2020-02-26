package B5_AdvancedObjectOrientedDesign.BaiTap.Colorable;

import B4_KeThua.ThucHanh.ClassShape.Square;

public class SquareColor extends Square implements Colorable {
    public SquareColor() {
    }

    public SquareColor(double side) {
        super(side);
    }
    @Override
    public void howToColor(){
        System.out.println("Color all four sides. ");
    }
}
