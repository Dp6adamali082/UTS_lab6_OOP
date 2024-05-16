class Kendaraan {
    private String jenis;
    private int tahun;

    // Constructor untuk inisialisasi objek Kendaraan
    public Kendaraan(String jenis, int tahun) {
        this.jenis = jenis;
        this.tahun = tahun;
    }

    // Method overloading untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Jenis Kendaraan: " + jenis);
        System.out.println("Tahun Pembuatan: " + tahun);
    }

    // Method setter untuk mengubah jenis kendaraan
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Method getter untuk mendapatkan tahun pembuatan kendaraan
    public int getTahun() {
        return tahun;
    }

    // Method overriding untuk menampilkan pesan
    @Override
    public String toString() {
        return "Ini adalah objek Kendaraan";
    }

}
