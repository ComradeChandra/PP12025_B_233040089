public class Test1 {
    
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(3);
        list.addTail(2);
        list.addTail(1);


        System.out.println("Elemen :");
        list.display();
        
        System.out.println();

        StrukturList list2 = new StrukturList();
        list2.addTail(1);
        list2.addTail(4);
        list2.addTail(5);
        list2.addTail(7);


        System.out.println("Elemen :");
        list2.display();
        }
    }

