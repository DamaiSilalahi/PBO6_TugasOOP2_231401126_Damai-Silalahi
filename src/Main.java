public class Main {
    public static void main(String[] args) {
        Mobil m1 = new Mobil(50);
        m1.setBahanBakar("Pertamax");
        m1.setIsiTangki(20);
        m1.isiBensin(25);
        m1.isiBensin(10);

        System.out.println();

        Motor motor1 = new Motor(10);
        motor1.setBahanBakar("Pertalite");
        motor1.setIsiTangki(5);
        motor1.isiBensin(3);

        System.out.println();

        Truk truk1 = new Truk(100);
        truk1.setBahanBakar("Solar");
        truk1.setIsiTangki(90);
        truk1.isiBensin(5);
    }
}
