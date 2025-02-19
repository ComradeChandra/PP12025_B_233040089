public class Node {
    private int data;
    private node next;

    //  Inisialisasi atribut node //
    public Node(int data) {
        this.data = data;
    }

  

    // Setter & Getter //
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }   

}