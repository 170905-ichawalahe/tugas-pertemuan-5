public class PerhitunganSaldoTabungan {
    public static void main(String[] args) {
        // Input data
        double saldoAwal = 1000000; // Saldo awal dalam rupiah
        double bunga = 10;         // Bunga dalam persen
        int lamaBulan = 5;         // Lama tabungan dalam bulan

        // Konversi bunga ke desimal
        double bungaDesimal = bunga / 100;

        // Perhitungan dan output
        double saldo = saldoAwal;
        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            saldo += saldo * bungaDesimal;
            System.out.printf("Saldo di bulan ke-%d : Rp. %,d%n", bulan, (int) saldo);
        }
    }
}
