public class Computer {

    String price;
    String model;
    RAM RAM;
    HDD HDD;

    Computer(){}

    Computer(String price, String model){
        this.price = price;
        this.model = model;
    }

    Computer(String price, String model, RAM RAM, HDD HDD){
        this(price, model);
        this.RAM = RAM;
        this.HDD = HDD;
    }

    void qwert(){
        System.out.println(this.price);
        System.out.println(this.model);
        this.RAM.rraamm();
        this.HDD.hhdddd();
    }
}
