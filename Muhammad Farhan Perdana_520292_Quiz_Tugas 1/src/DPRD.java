public class DPRD extends Pegawai{
    private int jumlahKunjungan;

    public DPRD(String NIP, double gajiPokok, String daerahKekuasaan) {
        super(NIP, gajiPokok, daerahKekuasaan);
    }

    public int getJumlahKunjungan() {
        return jumlahKunjungan;
    }

    public void setJumlahKunjungan(int jumlahKunjungan) {
        this.jumlahKunjungan = jumlahKunjungan;
    }

    public void tambahKunjungan() {
        jumlahKunjungan++;
    }

    @Override
    public double getTunjangan() {
        return gajiPokok + (jumlahKunjungan * 1000000);
    }
}
