import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n -----    WELCOME TO THE SIMPLEST ADVENTURE GAME EVER    -----");
        System.out.println(" -----  Game ini hanya bisa dimainkan oleh 2 player saja   -----");

        Player satu = new Player();
        Player dua = new Player();

        System.out.print("\n Masukkan nama player pertama : ");
        satu.name = input.nextLine();
        satu.run();
        System.out.print("Berapa cepatkah player dapat berlari? (dalam km/h) ");
        satu.speed = input.nextInt();
        System.out.print("Berapa lama player bisa menghabisi lawan? (dalam menit) ");
        satu.time = input.nextInt();
        System.out.print("Berapa kekuatan yang dimiliki player? (dalam angka 1-100) ");
        satu.healthPoint = input.nextInt();
        satu.checkStrength();
        satu.whatToPlay();

        System.out.println("\n ----- Sekarang giliran player kedua untuk bermain ----- \n");

        System.out.print("Masukkan nama player kedua : ");
        dua.name = input.nextLine();
        dua.run();
        System.out.print("Berapa cepatkah player dapat berlari? (dalam km/h) ");
        dua.speed = input.nextInt();
        System.out.print("Berapa lama player bisa menghabisi lawan? (dalam menit) ");
        dua.time = input.nextInt();
        System.out.print("Berapa kekuatan yang dimiliki player? (dalam rasio 1-10) ");
        dua.healthPoint = input.nextInt();
        dua.checkStrength();
        dua.whatToPlay();

        System.out.println("\n PENGUMUMAN PEMENANG \n");

        if (satu.time > dua.time) {
            System.out.println("Player paling tangkas adalah " + satu.name);
        } else if (satu.time < dua.time) {
            System.out.println("Player paling tangkas adalah " + dua.name);
        }
        if (satu.healthPoint > dua.healthPoint) {
            System.out.println("Player terkuat adalah " + satu.name);
        } else if (satu.healthPoint < dua.healthPoint) {
            System.out.println("Player terkuat adalah " + dua.name);
        }
        if (satu.speed > dua.speed) {
            System.out.println("Player tercepat adalah " + satu.name);
        } else if (satu.speed < dua.speed) {
            System.out.println("Player tercepat adalah " + dua.name);
        }

        System.out.println("\n ----- TERIMA KASIH TELAH BERMAIN DI PROGRAM INI -----");
        System.out.println(" -----              HAVE A NICE DAY!            -----");
    }
}