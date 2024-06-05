public class APBN {
    static double totalDana = 0;
    static double totalPajak = 0;

    public static void tambahDana(double jumlah) {
        totalDana += jumlah;
    }

    public static void kurangiDana(double jumlah) {
        if (totalDana >= jumlah) {
            totalDana -= jumlah;
        } else {
            System.out.println("Dana APBN tidak mencukupi.");
        }
    }

    public static void tambahPajak(double jumlah) {
        totalPajak += jumlah;
    }

    public static double getDana() {
        return totalDana;
    }

    public static double getPajak() {
        return totalPajak;
    }

    public static double getTotalDana() {
        return totalDana;
    }

    public static void setTotalDana(double totalDana) {
        APBN.totalDana = totalDana;
    }

    public static double getTotalPajak() {
        return totalPajak;
    }

    public static void setTotalPajak(double totalPajak) {
        APBN.totalPajak = totalPajak;
    }
}
