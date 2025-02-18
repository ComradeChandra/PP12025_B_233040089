public class node {
   private int nilai;
   private node next;

   
   //inisialisasi node
    public node(int nilai) {
        this.nilai = nilai;
        
    }
     //setter & getter


    public int getNilai() {
        return nilai;
    }


    public void setNilai(int nilai) {
        this.nilai = nilai;
    }


    public node getNext() {
        return next;
    }


    public void setNext(node next) {
        this.next = next;
    }
     
}