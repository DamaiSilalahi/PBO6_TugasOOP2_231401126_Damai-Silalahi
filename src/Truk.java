public class Truk extends Kendaraan {
    public Truk(int kapasitasTangki) {
        super(kapasitasTangki);
    }

    @Override
    public void isiBensin(int liter) {
        System.out.println("Truk:");
        super.isiBensin(liter);
    }
}
