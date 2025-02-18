public class nodemain {
    public static void main(String[] args) {
    //membuat 2 buatnode n1 & n2
       node n1 = new node(5);
       node n2 = new node(7);


    //membuat relasinode n1 & n2
        n1.setNext(n2);
    
    //menampilkannode n1 & n2 dengan pointer 
   node p = n1;
    while (p != null) {
        System.out.printf(" %d " , p.getNilai());
        p = p.getNext();

    }
    }
}