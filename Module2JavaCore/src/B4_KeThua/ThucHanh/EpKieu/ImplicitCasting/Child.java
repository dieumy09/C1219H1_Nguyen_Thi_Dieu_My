package B4_KeThua.ThucHanh.EpKieu.ImplicitCasting;

public class Child extends Parent {
    public void add() {
    }

    public static void main(String args[]) {
        //Implicit Casting of a Class Type
        //We all know that when we are assigning smaller type to a larger typ
        Parent p = new Child();
        p.disp();
        ((Child)p).add();
    }
}
