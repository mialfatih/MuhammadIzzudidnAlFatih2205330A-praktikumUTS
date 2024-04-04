class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    public Balok() {
        this.panjang = 1;
        this.lebar = 1;
        this.tinggi = 1;
    }

    public Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        this.tinggi = tinggiBaru;
    }

    public int getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    public int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }

    public int getVolume() {
        return panjang * lebar * tinggi;
    }

    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }

    public void setTinggi(int tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
}

public class uts4 {
    public static void main(String[] args) {
        Balok balok1 = new Balok();
        Balok balok2 = new Balok(30, 40, 50);
        Balok balok3 = new Balok(25, 35, 45);

        System.out.println("balok 1");
        System.out.println("luas Permukaan : " + balok1.getLuas());
        System.out.println("keliling : " + balok1.getKeliling());
        System.out.println("volume : " + balok1.getVolume());

        System.out.println("\nbalok 2");
        System.out.println("luas Permukaan : " + balok2.getLuas());
        System.out.println("keliling : " + balok2.getKeliling());
        System.out.println("volume : " + balok2.getVolume());

        System.out.println("\nbalok 3");
        System.out.println("luas Permukaan : " + balok3.getLuas());
        System.out.println("keliling : " + balok3.getKeliling());
        System.out.println("volume : " + balok3.getVolume());
    }
}