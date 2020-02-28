package B6_CTDuLieu_ThuatToanCB.BaiTap.ImplementMethodInArrayList;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> arr = new MyArrayList<>();
        arr.add(0,"a");
        arr.add(1,"d");
        arr.add(2,"e");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        MyArrayList<String> newArray = arr.clone();
        for (int i = 0; i < newArray.size(); i++) {
            System.out.println(newArray.get(i));
        }
    }
}
