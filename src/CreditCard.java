import java.util.Scanner;

public class CreditCard {

    String accountnumber;
    double sum;


    CreditCard(){}

    CreditCard(String accountnumber, double sum){
        this.accountnumber = accountnumber;
        this.sum = sum;
    }


    void cardReplenishment( ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму которую хотите положить: ");
        double n = scanner.nextDouble();
        System.out.println("Сумма пополнения вашей карты: " + n);
        sum = sum + n;
        System.out.println("Баланс карты составляет: " + sum);
    }

    void withdrawFromTheCard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму которую хотите снять: ");
        double n = scanner.nextDouble();
        System.out.println("Снятие: " + n + " успешно!");
        sum = sum - n;
        System.out.println("Остаток составляет: " + sum);
    }

    void cardStatus(){
        System.out.println("Номер вашего счёта: " + accountnumber);
        System.out.println("Баланс вашей карты: " + sum);
    }
}
