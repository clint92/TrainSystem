package sample;
import java.util.Stack;

/**
 * Created by A.A on 3/7/2017.
 */
public class Train {

    int Track;
    int NumberOfWagons;
    Stack<Wagon> CargoTrain;
    String Arrival;

    public Train(int track) {
        Track = track;
        CargoTrain = new Stack<Wagon>();


    }

    public int getTrack() {
        return Track;
    }

    public void setTrack(int track) {
        Track = track;
    }

     public void addWagon(Wagon wagon)
     {
         CargoTrain.push(wagon);
         NumberOfWagons ++;
     }

    public int getNumberOfWagons() {
        return NumberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        NumberOfWagons = numberOfWagons;
    }

    public Stack<Wagon> getCargoTrain() {
        return CargoTrain;
    }

    public void setCargoTrain(Stack<Wagon> cargoTrain) {
        CargoTrain = cargoTrain;
    }

    @Override
    public String toString() {
        return "Train{" +
                "Track=" + Track +
                ", NumberOfWagons=" + NumberOfWagons +
                ", CargoTrain=" + CargoTrain +
                ", Arrival='" + Arrival + '\'' +
                '}';
    }
}
