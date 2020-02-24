package B4_KeThua.ThucHanh.EpKieu.ExplicitCasting;

public class Child extends Parent {
    public void disp()
    {
        System.out.println("Child disp called");
    }
    public static void main(String args[])
    {
        Parent p = new Child();
        p.disp();
        Child c = (Child) p;
        c.disp();
    }
}
