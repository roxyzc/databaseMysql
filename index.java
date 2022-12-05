class Parent {
    private String nama;
    private int umur;
    private int hasil;

    public Parent(String nama) {
        this.nama = nama;
    }

    public Parent(String nama, int umur) {
        this(nama);
        this.umur = umur;
    }

    public Parent(String nama, int umur, int hasil) {
        this(nama, umur);
        this.hasil = hasil;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }

    public int getHasil() {
        return hasil;
    }
}

public class index extends Parent {
    public int umur;

    public index(String nama, int umur) {
        super(nama);
        this.umur = umur;
    }

    public static void main(String[] args) {
        // Parent p = new Parent("Roxyzc");
    }
}