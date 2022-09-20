
public class Main {
    public static void main(String[] args) {
       main2();
    }
    public static void main1(){
        CreditCard a = new CreditCard("123456789", 458.46);
        CreditCard b = new CreditCard("123456788", 642.37);
        CreditCard c = new CreditCard("123456888", 1864.29);
        a.cardReplenishment();
        //почему при складывании 458,46 + 458,64 ответ мне выдаёт 917,09999999999
        b.cardReplenishment();
        c.withdrawFromTheCard();
        a.cardStatus();
        b.cardStatus();
        c.cardStatus();
    }

    public static void main2(){
        HDD hdd = new HDD("namehdd", "154", "tupehdd");
        RAM ram = new RAM("nameram", "568");
        Computer computer1 = new Computer("1597", "LG");
        Computer computer2 = new Computer("6545","Lenovo", ram, hdd);
        computer2.qwert();
    }

    public static void main3(){
        ATM atm = new ATM(45, 96, 125);
        atm.addMoney();
        atm.moneyFromATM(66500);
    }
}