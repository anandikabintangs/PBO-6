import java.util.Scanner;
public class Tugas_P6F_2021071018{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int presensi, tugas, uts, uas;
        char ket = ' ';
        String nama, nim, jurusan, angkatan;
        double Nilai;

        System.out.println("-----------------------------------------------------");
        System.out.println("Input Data");
        System.out.println("-----------------------------------------------------");
        System.out.println("Nama :");
        nama = in.nextLine();
        System.out.println("NIM :");
        nim = in.nextLine();
        System.out.println("Jurusan :");
        jurusan = in.nextLine();
        System.out.println("Angkatan :");
        angkatan = in.nextLine();


        System.out.print("Nilai Presensi :");
        presensi = in.nextInt();
        System.out.print("Nilai Tugas :");
        tugas = in.nextInt();
        System.out.print("Nilai UTS :");
        uts = in.nextInt();
        System.out.print("Nilai UAS :");
        uas = in.nextInt();


        Nilai = (0.1 * presensi) + (0.2 * tugas) + (0.3 * uts) + (0.4 * uas);

        if (Nilai >= 80 && Nilai <= 100) {
            ket = 'A';
        } else if (Nilai >= 70 && Nilai <= 79) {
            ket = 'B';
        } else if (Nilai >= 60 && Nilai <= 69) {
            ket = 'C';
        } else if (Nilai >= 50 && Nilai <= 59) {
            ket = 'D';
        } else if (Nilai < 50) {
            ket = 'E';
        } else {
            System.out.println("Maaf input yang Anda masukkan Salah");
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Nilai Mata Kuliah Pemrograman Berorientasi Object");
        System.out.println("-----------------------------------------------------");
        System.out.println("Nama :" + nama);
        System.out.println("NIM :" + nim);
        System.out.println("Jurusan :" + jurusan);
        System.out.println("Angkatan :" + angkatan);
        System.out.println("Nilai Anda Adalah :" + ket);
    }
}
