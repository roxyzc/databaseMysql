public class BelajarT {
    public String nama;
    public int umur;

    public BelajarT(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // CTRL + .

    @Override
    public String toString() {
        return "nama: " + nama + ", umur: " + umur;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nama == null) ? 0 : nama.hashCode());
        result = prime * result + umur;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BelajarT other = (BelajarT) obj;
        if (nama == null) {
            if (other.nama != null)
                return false;
        } else if (!nama.equals(other.nama))
            return false;
        if (umur != other.umur)
            return false;
        return true;
    }

    public static void main(String[] args) {
        BelajarT p = new BelajarT("roxyzc", 10);
        BelajarT q = new BelajarT("roxyzc", 10);

        System.out.println(p);

        // String nama = "ridho pikri";
        // String nama1 = "ridho";
        // String nama2 = nama1 + " pikri";
        // nama => 1x diisi biar jadi ridho pikri
        // nama2 => 2x diisi biar jadi ridho pikri
        // System.out.println(nama == nama2);
        // System.out.println(nama.equals(nama2));

        System.out.println(p.equals(q));
        System.out.println(p.hashCode() == q.hashCode());
    }
}
