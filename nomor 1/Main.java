import java.util.Scanner;

// Class untuk merepresentasikan objek Kendaraan

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jenis kendaraan
        System.out.print("Masukkan jenis kendaraan: ");
        String jenisKendaraan = scanner.nextLine();

        // Input tahun pembuatan kendaraan
        System.out.print("Masukkan tahun pembuatan: ");
        int tahunKendaraan = scanner.nextInt();

        // Membuat objek Kendaraan menggunakan constructor
        Kendaraan mobil = new Kendaraan(jenisKendaraan, tahunKendaraan);

        // Memanggil method overloading untuk menampilkan informasi kendaraan
        mobil.tampilkanInfo();

        // Menggunakan method setter untuk mengubah jenis kendaraan
        mobil.setJenis("Truk");

        // Menggunakan method getter untuk mendapatkan tahun pembuatan kendaraan
        int tahun = mobil.getTahun();
        System.out.println("Tahun Pembuatan Kendaraan: " + tahun);

        // Memanggil method overriding
        System.out.println(mobil.toString());

        scanner.close();
    }
}
