package B6_CTDuLieu_ThuatToanCB.BaiTap.ImplementMethodInLinkedList;

public class MyLinkedList1<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList1(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public MyLinkedList1() {
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void remove(int index) {
        Node temp = head;

        if (index == 1) {
            head = head.next;
        } else {
            for (int i = 0; i < index - 2; i++) {

                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        numNodes--;
    }

    public int IndexOf(Object data) {
        Node temp = head;

        for (int i = 0; i < numNodes; i++) {
            if ( temp.getData().equals(data)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void remove(Object data) {
        Node temp = head;
        if (head.getData().equals(data)) {
            head = head.next;
        } else {
            while (!temp.next.getData().equals(data) && temp != null) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            numNodes--;
        }
    }

    public boolean contains(Object data) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData().equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    public MyLinkedList1<E> clone() {

        MyLinkedList1<E> MyListClone = new MyLinkedList1();
        Node temp = head;
        while (temp != null) {
            MyListClone.addFirst(temp.data);
            temp = temp.next;
        }
        return MyListClone;
    }

    public int size() {
       return numNodes;
    }
}
