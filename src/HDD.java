public class HDD {
    String name;
    String volume;
    String type;

    HDD(){}

    HDD(String name, String volume, String type){
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    String getName(){
        return name;
    }

    String getVolume(){
        return volume;
    }

    String getType(){
        return type;
    }

    void hhdddd(){
        System.out.println(this.name);
        System.out.println(this.volume);
        System.out.println(this.type);
    }
}
