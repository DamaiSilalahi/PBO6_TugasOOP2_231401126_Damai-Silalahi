public class Motor extends Kendaraan {
    public Motor(int kapasitasTangki) {
        super(kapasitasTangki);
    }

    @Override
    public void isiBensin(int liter) {
        System.out.println("Motor:");
        super.isiBensin(liter);
    }
}
