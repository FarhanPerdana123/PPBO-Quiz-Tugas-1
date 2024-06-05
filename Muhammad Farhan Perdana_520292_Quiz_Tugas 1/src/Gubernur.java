import java.util.ArrayList;
import java.util.List;

public class Gubernur extends Pegawai{
    List<PNS> daftarPNS = new ArrayList<>();

    public Gubernur(String NIP, double gajiPokok, String daerahKekuasaan) {
        super(NIP, gajiPokok, daerahKekuasaan);
    }

    public List<PNS> getDaftarPNS() {
        return daftarPNS;
    }

    public void setDaftarPNS(List<PNS> daftarPNS) {
        this.daftarPNS = daftarPNS;
    }

    public void mendataPNS(PNS pns) {
        if (!pns.daerahKekuasaan.equals(daerahKekuasaan)) {
            System.out.println("Error: Alamat PNS tidak sesuai dengan daerah kekuasaan.");
        } else {
            daftarPNS.add(pns);
        }
    }

    public void tambahDanaAPBN(double jumlah) {
        APBN.tambahDana(jumlah);
    }

    @Override
    public double getTunjangan() {
        return gajiPokok + (daftarPNS.size() * 100000);
    }
}
