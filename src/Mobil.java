public class Mobil extends Kendaraan {
    public Mobil(int kapasitasTangki) {
        super(kapasitasTangki);
    }

    @Override
    public void isiBensin(int liter) {
        System.out.println("Mobil:");
        super.isiBensin(liter);
    }
}
