public class RakyatJelata {
    private String alamat;
    private double kekayaan;

    public RakyatJelata(String alamat, double kekayaan) {
        this.alamat = alamat;
        this.kekayaan = kekayaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getJumlahKekayaan() {
        return kekayaan;
    }

    public void tambahKekayaan(double jumlah) {
        kekayaan += jumlah;
    }

    public void terimaBantuan(double jumlah) {
        tambahKekayaan(jumlah);
    }

    public void bayarPajak() {
        APBN.tambahPajak(kekayaan * 0.01); // Contoh tarif pajak 1%
    }
}
