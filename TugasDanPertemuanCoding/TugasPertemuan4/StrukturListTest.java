public class StrukturListTest {

    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Tambah elemen 3 di akhir list
        list.addTail(3);

        // Tambah elemen 4 di akhir list
        list.addTail(4);

        // Tambah elemen 7 di index 2 (posisi tengah)
        list.addMid(7, 2);

        // Tambah elemen 8 di index 2 (posisi tengah)
        list.addMid(8, 2);

        // Tambah elemen 5 di awal list
        list.addHead(5);

        // Tampilkan elemen list
        list.display(); // Output: 5 3 8 7 4
    }
}
