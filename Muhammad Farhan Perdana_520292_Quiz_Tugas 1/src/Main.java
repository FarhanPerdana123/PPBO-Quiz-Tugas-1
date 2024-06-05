//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gubernur gubernur = new Gubernur("002", 10000000, "Konoha");
        DPRD dprd1 = new DPRD("003", 5000000, "Konoha");
        PNS pns1 = new PNS("001", 5000000, "Konoha", 3);
        RakyatJelata rakyat1 = new RakyatJelata("Konoha", 50000000);

        pns1.mendataRakyat(rakyat1);
        pns1.getDaftarRakyat();
        System.out.println("Jumlah kekayaan rakyat1: " + rakyat1.getJumlahKekayaan());
        pns1.menyalurkanBantuan();
        rakyat1.terimaBantuan(1000000);
        System.out.println("Jumlah kekayaan rakyat1 setelah menerima bantuan: " + rakyat1.getJumlahKekayaan());
        pns1.bayarPajak();
        System.out.println("Dana APBN: " + APBN.getDana());
        System.out.println("Jumlah tunjangan dprd: " + dprd1.getTunjangan());
        System.out.println(" ");
        gubernur.mendataPNS(pns1);
        gubernur.tambahDanaAPBN(5000000);
        System.out.println("Dana APBN setelah ditambah Gubernur: " + APBN.getTotalDana());
        System.out.println("Tunjangan Gubernur: " + gubernur.getTunjangan());
        gubernur.bayarPajak();
    }
}