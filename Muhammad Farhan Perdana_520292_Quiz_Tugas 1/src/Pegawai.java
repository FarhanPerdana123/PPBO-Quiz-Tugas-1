public abstract class Pegawai {
    String NIP;
    double gajiPokok;
    String daerahKekuasaan;

    public Pegawai(String NIP, double gajiPokok, String daerahKekuasaan) {
        this.NIP = NIP;
        this.gajiPokok = gajiPokok;
        this.daerahKekuasaan = daerahKekuasaan;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public String getDaerahKekuasaan() {
        return daerahKekuasaan;
    }

    public void setDaerahKekuasaan(String daerahKekuasaan) {
        this.daerahKekuasaan = daerahKekuasaan;
    }

    public abstract double getTunjangan();

    public void bayarPajak() {
        APBN.tambahPajak(gajiPokok * 0.1); // Contoh tarif pajak 10%
    }
}
