public class Node {
    private int data;
    private Node next;

    //  Inisialisasi Atribut Node //
    public Node(int data) {
        this.data = data;

    }
    // Setter&Getter //

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    

}