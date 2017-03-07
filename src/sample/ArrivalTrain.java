package sample;
import java.util.Stack;

/**
 * Created by A.A on 3/7/2017.
 */
public class ArrivalTrain {

    int Track;
    int NumberOfWagons;
    Stack<Wagon> CargoTrain;
    String Arrival;

    public ArrivalTrain(int track, int numberOfWagons, Stack<Wagon> cargoTrain) {
        Track = track;
        NumberOfWagons = numberOfWagons;
        CargoTrain = cargoTrain;
    }

    public int getTrack() {
        return Track;
    }

    public void setTrack(int track) {
        Track = track;
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
        return "ArrivalTrain{" +
                "Track=" + Track +
                ", NumberOfWagons=" + NumberOfWagons +
                ", CargoTrain=" + CargoTrain +
                ", Arrival='" + Arrival + '\'' +
                '}';
    }
}
