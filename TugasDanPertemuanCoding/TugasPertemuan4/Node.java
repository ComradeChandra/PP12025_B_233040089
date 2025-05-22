public class Node {

    private int data;
    private Node next;



    // Inisialisasi attribut node //
    public Node(int data){
        this.data = data;
     
    }


    // Getter dan Setter //
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

//tugas
// Tambahan node untuk data bertipe double
class NodeDouble {
    private double data;
    private NodeDouble next;

    public NodeDouble(double data) {
        this.data = data;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public NodeDouble getNext() {
        return next;
    }

    public void setNext(NodeDouble next) {
        this.next = next;
    }
}
