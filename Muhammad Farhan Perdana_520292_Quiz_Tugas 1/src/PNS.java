import java.util.ArrayList;
import java.util.List;

public class PNS extends Pegawai{
    int golongan;
    List<RakyatJelata> daftarRakyat = new ArrayList<>();

    public PNS(String NIP, double gajiPokok, String daerahKekuasaan, int golongan) {
        super(NIP, gajiPokok, daerahKekuasaan);
        this.golongan = golongan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public void setDaftarRakyat(List<RakyatJelata> daftarRakyat) {
        this.daftarRakyat = daftarRakyat;
    }

    public void mendataRakyat(RakyatJelata rakyat) {
        if (!rakyat.getAlamat().equals(daerahKekuasaan)) {
            System.out.println("Error: Alamat rakyat jelata tidak sesuai dengan daerah kekuasaan.");
        } else {
            daftarRakyat.add(rakyat);
        }
    }

    public void getDaftarRakyat() {
        System.out.println("Daftar Rakyat di Daerah Kekuasaan PNS:");
        for (RakyatJelata rakyat : daftarRakyat) {
            System.out.println("Alamat: " + rakyat.getAlamat() + ", Kekayaan: " + rakyat.getJumlahKekayaan());
        }
    }

    public void menyalurkanBantuan() {
        for (RakyatJelata rakyat : daftarRakyat) {
            if (rakyat.getJumlahKekayaan() < 100000000) {
                APBN.kurangiDana(1000000);
                rakyat.tambahKekayaan(1000000);
            }
        }
    }

    @Override
    public double getTunjangan() {
        return gajiPokok + (golongan * 100000);
    }
}
