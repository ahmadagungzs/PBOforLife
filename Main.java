import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n -----    WELCOME TO THE SIMPLEST ADVENTURE GAME EVER    -----");
        System.out.println(" -----  Game ini hanya bisa dimainkan oleh 2 player saja   -----");

        Player satu = new Player();
        Player dua = new Player();

        System.out.print("\n Masukkan nama player pertama : ");
        initialize(satu, "Berapa kekuatan yang dimiliki player? (dalam angka 1-100) ");

        System.out.println("\n ----- Sekarang giliran player kedua untuk bermain ----- \n");

        System.out.print("Masukkan nama player kedua : ");
        initialize(dua, "Berapa kekuatan yang dimiliki player? (dalam rasio 1-10) ");

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

    private static void initialize(Player player, String s) {
        Scanner input = new Scanner(System.in);
        player.setName(input.nextLine());
        player.run();
        System.out.print("Berapa cepatkah player dapat berlari? (dalam km/h) ");
        player.speed = input.nextInt();
        System.out.print("Berapa lama player bisa menghabisi lawan? (dalam menit) ");
        player.time = input.nextInt();
        System.out.print(s);
        player.healthPoint = input.nextInt();
        player.checkStrength();
        player.whatToPlay();
    }
}