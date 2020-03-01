package B6_CTDuLieu_ThuatToanCB.BaiTap.ImplementMethodInArrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<E> {
    private int size = 0;
    private static final int Default_Capacity = 10;
    private Object elements[];

    public MyArrayList() {
        elements = new Object[Default_Capacity];

    }

    public MyArrayList(int size) {
        this.size = size;
    }

    public void add(int index, E e) {
        elements[size++] = e;
    }

    public E remove(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("No value remove");
        } else{
            E temp = (E) elements[index];
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            return temp;
        }



    }

    public int size() {
        return size;
    }

    public MyArrayList<E> clone() {
        MyArrayList<E> array = new MyArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add(i, (E)elements[i]);
        }
        return array;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E o) {
        if (size > elements.length) {
            return false;
        } else
            return true;
    }

    public E get (int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
}
