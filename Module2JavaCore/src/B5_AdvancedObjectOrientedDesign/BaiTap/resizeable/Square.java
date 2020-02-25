package B5_AdvancedObjectOrientedDesign.BaiTap.resizeable;

public class Square implements Resizeable {
    private double edge = 1.0;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public void resize (double percent) {
        this.edge += this.edge * percent;
    }
}
