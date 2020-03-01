package B6_CTDuLieu_ThuatToanCB.BaiTap.ImplementMethodInLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList1 ll = new MyLinkedList1(10);
        ll.addFirst("My");
        ll.addFirst("Tinh");
        ll.addFirst("Tho");
        ll.printList();
        ll.contains("My");
        ll.IndexOf(1);
        ll.size();
    }

}
