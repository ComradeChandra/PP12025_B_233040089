public class StrukturListTugas {
    public static void main(String[] args) {
        StrukturListDouble listA = new StrukturListDouble();
        listA.addTail(2.1);
        listA.addTail(3.4);
        listA.addTail(4.5);
        System.out.println("Deret A:");
        listA.display();

        StrukturListDouble listB = new StrukturListDouble();
        listB.addHead(5.5);
        listB.addHead(4.5);
        listB.addHead(1.1);
        listB.addHead(2.1);
        listB.addHead(3.4);
        System.out.println("\nDeret B:");
        listB.display();
    }
}
