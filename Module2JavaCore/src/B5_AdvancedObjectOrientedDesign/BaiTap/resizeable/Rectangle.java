package B5_AdvancedObjectOrientedDesign.BaiTap.resizeable;

public class Rectangle implements Resizeable{
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void resize (double percent){
        this.width += this.width * percent;
        this.height += this.height * percent;
    }
}
