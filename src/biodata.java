public class biodata{ 
// Atribut
    private final String nama;
    private final int umur;
    private final String alamat;
    private final String hobi;

    // Konstruktor
    public biodata(String nama, int umur, String alamat, String hobi) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.hobi = hobi;
    }

    // Metode untuk menampilkan informasi biodata
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Alamat: " + alamat);
        System.out.println("Hobi: " + hobi);
    }
}
