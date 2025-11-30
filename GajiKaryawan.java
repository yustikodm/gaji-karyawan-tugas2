import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String golongan;
        int jamLembur;
        double gajiPokok = 0;
        double gajiLembur = 0;
        double totalGaji;

        // Input
        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        golongan = input.nextLine().toUpperCase();
        
        System.out.print("Masukkan Jumlah Jam Lembur: ");
        jamLembur = input.nextInt();
        
        // Menentukan gaji pokok berdasarkan golongan
        if (golongan.equals("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equals("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equals("C")) {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid!");
            System.exit(0);
        }

        // Menentukan gaji lembur berdasarkan jam lembur
        if (jamLembur == 1) {
            gajiLembur = 0.30 * gajiPokok;
        } else if (jamLembur == 2) {
            gajiLembur = 0.32 * gajiPokok;
        } else if (jamLembur == 3) {
            gajiLembur = 0.34 * gajiPokok;
        } else if (jamLembur == 4) {
            gajiLembur = 0.36 * gajiPokok;
        } else if (jamLembur >= 5) {
            gajiLembur = 0.38 * gajiPokok;
        } else {
            gajiLembur = 0;
        }

        // Menghitung total penghasilan
        totalGaji = gajiPokok + gajiLembur;
        
        // Output hasil
        System.out.println("\n=== Hasil Perhitungan Gaji Karyawan ===");
        System.out.println("Golongan          : " + golongan);
        System.out.println("Gaji Pokok        : Rp " + String.format("%,.0f", gajiPokok));
        System.out.println("Gaji Lembur       : Rp " + String.format("%,.0f", gajiLembur));
        System.out.println("Total Penghasilan : Rp " + String.format("%,.0f", totalGaji));
        
        input.close();
    }
}