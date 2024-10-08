// 12S24051 - GERALDA NATALI GULTOM
// 12S24044 - DIANITA LORENSIA BR GINTING

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;
        String judul;
        String penulis;
        String tahunTerbit;
        String penerbit;
        String formatBukuElektronik;
        double hargaPembelian;
        double minimumMargin;
        int stok;
        double rating;
        String kategori, bestPick, mustRead, recommended, average, low, kualitasBuku;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunTerbit = input.nextLine();
        penerbit = input.nextLine();
        formatBukuElektronik = input.nextLine();
        hargaPembelian = Double.parseDouble(input.nextLine());
        minimumMargin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7 && rating <= 5.0) {
            kategori = "Best Pick";
        } else {
            if (rating >= 4.5 && rating <= 4.69) {
                kategori = "Must Read";
            } else {
                if (rating >= 4.0 && rating <= 4.49) {
                    kategori = "Recommended";
                } else {
                    if (rating >= 3.0 && rating <= 3.99) {
                        kategori = "Average";
                    } else {
                        if (rating < 3.0 && rating <= 5.0) {
                            kategori = "Low";
                        } else {
                            kategori = "Error";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektronik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kategori);
    }
}
