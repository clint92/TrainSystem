package sample;
import java.util.Random;

public class Wagon {
    private int light = 1;
    private  int medium =3;
    private int heavy = 5;
    private String destination = "";
    private String cargoType = "";
    private int weight = 0;

    public Wagon() {
        this.destination = destination();
        this.cargoType = cargoType();
        this.weight = weight();
    }

    public int weight() {
        // light =1, medium =3,  heavy = 5
        Random r = new Random();

        int[] weight = {light, medium, heavy};

        return weight [r.nextInt(2)]; // return light or medium or heavy
    }

    public String cargoType() {
        Random ranCargoType =  new Random();
        String[] cargoType = {"Wood","Steel","Oil","Gas Oil","Food","Cars","General Goods"};

        return cargoType[ranCargoType.nextInt(6)];
        //arraylist add wood ect. Math.ran return
    }

    public String destination (){
        Random ranDestination =  new Random();
        String[] destination = {"Hamburg Harbour","Scandinavia","Duisburg","Hannover","Berlin","Köln","Kassel","Leipzig","Frankfurt","Nürnberg","Munich"};

        return destination[ranDestination.nextInt(11)];
    }

    public String getDestination() {
        return destination;
    }

    public String getCargoType() {
        return cargoType;
    }

    public int getWeight() {
        return weight;
    }
}
