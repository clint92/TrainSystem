package sample;
import java.util.Stack;

/**
 * Created by A.A on 3/7/2017.
 */
public class Train {

    int Track;
    int NumberOfWagons;
    Stack<Vogn> CargoTrain;
    String Arrival;

    public Train(int track) {
        Track = track;
        CargoTrain = new Stack<Vogn>();


    }

    public int getTrack() {
        return Track;
    }

    public void setTrack(int track) {
        Track = track;
    }

     public void addWagon(Vogn vogn)
     {
         CargoTrain.push(vogn);
         NumberOfWagons ++;
     }

    public int getNumberOfWagons() {
        return NumberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        NumberOfWagons = numberOfWagons;
    }

    public Stack<Vogn> getCargoTrain() {
        return CargoTrain;
    }

    public void setCargoTrain(Stack<Vogn> cargoTrain) {
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
