public class StrukturList {
    
    Node HEAD;
    
    public boolean isEmpty(){
        return (HEAD == null);
    }

    //Menampilkan List//
    public void display(){
        Node curNode = HEAD;
        while (curNode != null){
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }
    

    //Prosedur untuk add head//
    public void addHead(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            HEAD = newNode;
        }else{
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    

    // Prosedur untuk add mid berdasarkan algoritma
public void addMid(int data, int position) {
    Node newNode = new Node(data);

    if (HEAD == null) {
        // Jika list kosong, tambahkan node baru sebagai HEAD
        HEAD = newNode;
    } else {
        Node curNode = HEAD;
        if (position == 1) {
            // Tambahkan di awal
            newNode.setNext(curNode);
            HEAD = newNode;
        } else {
            Node posNode = null;
            int i = 1;

            // Iterasi hingga posisi yang diinginkan
            while (curNode != null && i < position) {
                posNode = curNode;
                curNode = curNode.getNext();
                i++;
            }

            // Sisipkan node baru di posisi yang ditentukan
            posNode.setNext(newNode);
            newNode.setNext(curNode);
        }
    }
 }

    //Prosedur untuk add tail//
    public void addTail(int data){
        Node posNode = null, curNode = null;
        Node newNode = new Node(data);
        if (isEmpty()){
            HEAD = newNode;
        }else{
            curNode = HEAD;
            while (curNode != null){
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

}

//tugas
// Tambahan struktur list untuk tipe double
class StrukturListDouble {
    NodeDouble HEAD;

    public boolean isEmpty() {
        return (HEAD == null);
    }

    public void display() {
        NodeDouble curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }

    public void addHead(double data) {
        NodeDouble newNode = new NodeDouble(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addTail(double data) {
        NodeDouble newNode = new NodeDouble(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            NodeDouble curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    public void addMid(double data, int position) {
        NodeDouble newNode = new NodeDouble(data);
        if (HEAD == null || position == 1) {
            newNode.setNext(HEAD);
            HEAD = newNode;
        } else {
            NodeDouble curNode = HEAD;
            int i = 1;
            while (curNode != null && i < position - 1) {
                curNode = curNode.getNext();
                i++;
            }
            if (curNode != null) {
                newNode.setNext(curNode.getNext());
                curNode.setNext(newNode);
            }
        }
    }
}
