public class RAM {
    String name;
    String volume;

    RAM(){}

    RAM(String name, String volume){
        this.name = name;
        this.volume = volume;
    }

    String getName(){
        return name;
    }

    String getVolume(){
        return volume;
    }

    void rraamm(){
        System.out.println(this.name);
        System.out.println(this.volume);
    }
}
