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
    //Prosedur untuk add middle//
    
    public void addMid(int data, int position) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            if (position == 1) {
                //Jika posisi adalah 1, panggil addHead karena posisi pertama adalah kepala//
                newNode.setNext(curNode);
                HEAD = newNode;
            } else {
                Node posNode = null;
                int i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                //Setelah mencapai posisi yang diinginkan, tambahkan node baru di antaranya//
                if (posNode != null) {
                    posNode.setNext(newNode);
                    newNode.setNext(curNode);
                }
            }
        }
    }
    

    //Prosedur untuk add tail//
    
    public void addTail(int data){
    Node posNode=null, curNode=null;
        Node newNode = new Node(data);
     if (isEmpty()){
        HEAD = newNode;
    }else{
        curNode = HEAD;
        while  (curNode != null){
            posNode = curNode;
            curNode = curNode.getNext();
        }
    posNode.setNext(newNode);
    }
}

    

}
