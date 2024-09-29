package management;

import java.util.ArrayList;

public class management {
    private final ArrayList<Artist> daftarArtis = new ArrayList<>();

    // Static variabel untuk menghitung jumlah artist
    private static int jumlahArtis = 0;

    // Menambahkan artist ke dalam list
    public void addArtist(Artist artist) {
        daftarArtis.add(artist);
        jumlahArtis++;
    }

    // Menampilkan semua artist
    public void displayAllArtists() {
        System.out.println("Daftar Artis:");
        for (Artist artist : daftarArtis) {
            artist.displayInfo();
            System.out.println("------------------");
        }
    }

    // Menghapus artist berdasarkan nama
    public void deleteArtist(String nama) {
        boolean ditemukan = false;
        for (Artist artist : daftarArtis) {
            if (artist.getName().equalsIgnoreCase(nama)) {
                daftarArtis.remove(artist);
                jumlahArtis--;
                System.out.println(nama + " telah dihapus.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Artis tidak ditemukan!");
        }
    }

    // Update data artist berdasarkan nama
    public void updateArtist(String nama, int umurBaru, String grupBaru) {
        boolean ditemukan = false;
        for (Artist artist : daftarArtis) {
            if (artist.getName().equalsIgnoreCase(nama)) {
                daftarArtis.remove(artist);  // Hapus artis lama
                daftarArtis.add(new Artist(nama, umurBaru, grupBaru));  // Tambahkan artis dengan data baru
                System.out.println("Data artis " + nama + " telah diperbarui.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Artis tidak ditemukan!");
        }
    }

    // Method untuk mendapatkan jumlah artist
    public static int getJumlahArtis() {
        return jumlahArtis;
    }
}
