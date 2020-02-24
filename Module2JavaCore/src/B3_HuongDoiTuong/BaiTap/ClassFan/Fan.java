package B3_HuongDoiTuong.BaiTap.ClassFan;

public class Fan {
    final int slow = 1;
    final int media = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(){

    }

    public Fan(int speed){
        this.speed = speed;
    }

    public String toString() {
        if ( this.isOn() ) {
            return "Speed: " + this.getSpeed() + " ,Color: "+this.getColor() + " ,Radius: " +  this.getRadius() +" fan is on";
        } else {
            return "Speed: " + this.getSpeed() + " ,Color: "+this.getColor() + " ,Radius: " +  this.getRadius() +" fan is off";
        }
    }

    public static void main(String[] args) {
        System.out.println("FAN 1:");
        Fan fan1 = new Fan();
        int speed1 = fan1.fast;
        double radius1 = 10;
        String color1 = "yellow";
        fan1.setSpeed(speed1);
        fan1.setRadius(radius1);
        fan1.setColor(color1);
        fan1.setOn(true);
        System.out.println(fan1.toString());

        System.out.println("FAN 2:");
        Fan fan2 = new Fan();
        int speed2 = fan1.media;
        double radius2 = 5;
        fan2.setSpeed(speed2);
        fan2.setRadius(radius2);
        fan2.getColor();
        fan2.setOn(false);
        System.out.println(fan2.toString());

    }
}

