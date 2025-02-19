public class Tes4 {
    public static void main(String[] args) {
    //membuat urutan node dengan urutan 5, 7, 9, 8
       node n1 = new node(5);
       node n2 = new node(7);
       node n3 = new node(9);
       node n4 = new node(8);
      
    //membuat relasi node n1 & n2
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
 
    
    //menampilkan node n1 & n2 dengan pointer 
   node p = n1;
    while (p != null) {
        System.out.printf(" %d " , p.getNilai());
        p = p.getNext();
        }


System.out.println();  
        // Membuat urutan node dengan urutan 2, 3, 5, 7, 9
        node n5 = new node(2);
        node n6 = new node(3);
        node n7 = new node(5);
        node n8 = new node(7);
        node n9 = new node(9);
        n5.setNext(n6);
        n6.setNext(n7);
        n7.setNext(n8);
        n8.setNext(n9);
        
        //Buat Menampilkan Node dengan urutan 2, 3, 5, 7, 9
        p = n5;
        while (p != null) {
            System.out.printf(" %d ", p.getNilai());
            p = p.getNext();
        }
        System.out.println();
        }
    }