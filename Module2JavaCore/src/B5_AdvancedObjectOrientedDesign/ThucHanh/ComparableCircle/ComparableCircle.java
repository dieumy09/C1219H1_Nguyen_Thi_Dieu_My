package B5_AdvancedObjectOrientedDesign.ThucHanh.ComparableCircle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color) {
        super(color,radius);
    }

    @Override
    public int compareTo(ComparableCircle o){
        if (getRadius() > o.getRadius()) {
            return 1;
        } else if (getRadius() < o.getRadius()) {
            return -1;
        } else return 0;
    }


}
