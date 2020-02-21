package B3_HuongDoiTuong.BaiTap;

public class SubFan extends Fan{
    private float cost;

    public SubFan(int speed, float cost) {
        super(speed);
        this.cost = cost;
    }

    public static void main(String[] args) {
        SubFan subFan = new SubFan(20,100);
        System.out.println(subFan.getSpeed());
    }
}
