import java.util.Scanner;

public class ATM {

    int nominal20;
    int nominal50;
    int nominal100;
    int sum;

    ATM(){};

    ATM(int nominal20, int nominal50, int nominal100){
        this.nominal20 = nominal20;
        this.nominal50 = nominal50;
        this.nominal100 = nominal100;
    }

    ATM(int sum){
        this.sum = sum;
    }


    void addMoney(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во 20: ");
        int n = scanner.nextInt();
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите кол-во 50: ");
        int m = scann.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во 100: ");
        int k = scan.nextInt();
        int sum = 20 * n + 50 * m + 100 * k;
        System.out.println("Сумма пополнения: " + sum);
    }

    void moneyFromATM(int sum) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму которуе хотите снять: ");
        int s = scanner.nextInt();
        if (s < sum) {
            System.out.println("true");
            int a = s / 100;
            int b = (s - a * 100) / 50;
            int c = (s - a * 100 - b * 50) / 20;
            System.out.println("Кол-во 100: " + a);
            System.out.println("Кол-во 50: " + b);
            System.out.println("Кол-во 20" + c);
        } else System.out.println("false");
    }
}
