package main;

import management.Artist;
import management.management;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        management management = new management();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean berjalan = true;
            
            while (berjalan) {
                System.out.println("\n===== Menu Manajemen KPOP =====");
                System.out.println("1. Tambah Artis");
                System.out.println("2. Lihat Semua Artis");
                System.out.println("3. Hapus Artis");
                System.out.println("4. Update Data Artis");
                System.out.println("5. Keluar");
                System.out.print("Pilih opsi: ");
                int opsi = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline
                
                switch (opsi) {
                    case 1 -> {
                        System.out.print("Masukkan nama artis: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan umur artis: ");
                        int umur = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan newline
                        System.out.print("Masukkan grup artis: ");
                        String grup = scanner.nextLine();
                        Artist artisBaru = new Artist(nama, umur, grup);
                        management.addArtist(artisBaru);
                        System.out.println(nama + " telah ditambahkan.");
                    }
                        
                    case 2 -> management.displayAllArtists();
                        
                    case 3 -> {
                        System.out.print("Masukkan nama artis yang ingin dihapus: ");
                        String namaArtis = scanner.nextLine();
                        management.deleteArtist(namaArtis);
                    }
                        
                    case 4 -> {
                        System.out.print("Masukkan nama artis yang ingin diupdate: ");
                        String namaUpdate = scanner.nextLine();
                        System.out.print("Masukkan umur baru: ");
                        int umurBaru = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan newline
                        System.out.print("Masukkan grup baru: ");
                        String grupBaru = scanner.nextLine();
                        management.updateArtist(namaUpdate, umurBaru, grupBaru);
                    }
                        
                    case 5 -> {
                        berjalan = false;
                        System.out.println("Keluar dari program...");
                    }
                        
                    default -> System.out.println("Opsi tidak valid. Silakan pilih lagi.");
                }
            }
        }
    }
}
