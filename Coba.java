
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// // class Orang {
// // public Mahasiswa mahasiswa;

// // public Orang() {
// // mahasiswa = new Mahasiswa(this);
// // }

// // public void tampil() {
// // System.out.println(mahasiswa.nama);
// // }

// // public void setNama(String nama) {
// // mahasiswa.nama = nama;
// // }
// // }

// // class Mahasiswa {
// // public String nama;
// // Orang orang;

// // public Mahasiswa(Orang orang) {
// // this.orang = orang;
// // }
// // }

// // class Hewan {
// // public String nama;

// // public Hewan(String nama) {
// // this.nama = nama;
// // }
// // }

// // class Kucing {
// // Hewan hewan;

// // public Kucing(Hewan hewan) {
// // this.hewan = hewan;
// // }
// // }

// // class Manusia {
// // public String nama;

// // public Manusia(String nama) {
// // this.nama = nama;
// // }
// // }

// // class Arya {
// // private List<Manusia> coba;

// // public void getCoba() {
// // Iterator<Manusia> it = coba.iterator();
// // while (it.hasNext()) {
// // Manusia coba123 = it.next();
// // System.out.println(coba123);
// // }
// // ;
// // }

// // public void setCoba(List<Manusia> coba) {
// // this.coba = coba;
// // }
// // }

// public class Coba {
// public static void main(String[] args) {
// // Orang orang = new Orang();
// // Kucing kucing = new Kucing(new Hewan("botem"));
// // ArrayList<Manusia> manusia = new ArrayList<Manusia>();
// // manusia.add(new Manusia("roxyzc"));
// // Arya arya = new Arya();
// // arya.setCoba(manusia);
// // arya.getCoba();
// // orang.setNama("roxyzc");

// // orang.tampil();

// // LocalDateTime myDateObj = LocalDateTime.now();
// // System.out.println("Before formatting: " + myDateObj);
// // DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd:MM:yyyy
// // HH:mm:ss");

// // String formattedDate = myDateObj.format(myFormatObj);
// // String[] s = formattedDate.split(":");
// // System.out.println(Integer.parseInt(s[0]));
// // System.out.println("After formatting: " + formattedDate);

// int jam = 2;
// int menit = 30;
// int detik = 40;
// jam = (jam * 60 * 60) - (menit * 60 + detik);
// jam /= 3600;
// System.out.println(jam);
// }
// }