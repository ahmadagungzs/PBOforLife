import java.util.Scanner;

public class Player {
    public String name;
    public int speed;
    public int healthPoint;
    public int time;
    public int playing;

    void run() {
        System.out.println(this.name + " sekarang bermain ");
    }

    void checkStrength() {
        if (this.healthPoint <= 30) {
            System.out.println(this.name + " memiliki kemampuan yang sangat lemah");
        } else if (this.healthPoint > 30 && this.healthPoint <= 60) {
            System.out.println(this.name + " memiliki kemampuan yang lumayan kuat");
        } else {
            System.out.println(this.name + " memiliki kemampuan yang sangat kuat");
        }
    }

    void whatToPlay(){
        Scanner masukan = new Scanner(System.in);
        System.out.println("Kegiatan apa yang ingin dilakukan?");
        System.out.println("1. Lari " + "2. Terbang " + "3. Berantem ");
        playing = masukan.nextInt();
        if (this.playing == 1) {
            speed = speed - 10;
            System.out.println("Berhasil Lari. Karena kelelahan, kecepatan menurun 10km/h menjadi " + speed + " km/h. Nanti kita lihat siapa yang terkuat.");
        } else if (this.playing == 2) {
            time -= 10;
            System.out.println("Berhasil Terbang. Karena kecapean, waktu terpakai 10 menit dan tersisa " + time + " menit. Nanti kita lihat siapa yang terkuat.");
        } else if (this.playing == 3) {
            healthPoint -= 10;
            System.out.println("Berhasil Berantem. Karena kesakitan, kekuatan berkurang 10 angka dan tersisa " + healthPoint + " kekuatan. Nanti kita lihat siapa yang terkuat.");
        }
       }
    }