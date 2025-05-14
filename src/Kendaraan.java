public class Kendaraan {
    private String bahanBakar;
    private int kapasitasTangki;
    private int isiTangki;

    public Kendaraan(int kapasitasTangki) {
        this.kapasitasTangki = kapasitasTangki;
        this.isiTangki = 0;
    }

    public void setBahanBakar(String jenis) {
        if (jenis.equalsIgnoreCase("Pertalite") ||
                jenis.equalsIgnoreCase("Pertamax") ||
                jenis.equalsIgnoreCase("Solar")) {
            this.bahanBakar = jenis;
        } else {
            System.out.println("Jenis bahan bakar tidak valid.");
        }
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setIsiTangki(int liter) {
        if (liter >= 0 && liter <= kapasitasTangki) {
            this.isiTangki = liter;
        } else {
            System.out.println("Isi tangki melebihi kapasitas!");
        }
    }

    public int getIsiTangki() {
        return isiTangki;
    }

    public void isiBensin(int liter) {
        if (isiTangki + liter > kapasitasTangki) {
            System.out.println("Tangki tidak cukup! Kapasitas maksimum: " + kapasitasTangki + " liter.");
        } else {
            isiTangki += liter;
            System.out.println("Mengisi " + liter + " liter " + bahanBakar + ". Total isi: " + isiTangki + " liter.");
        }
    }
}
