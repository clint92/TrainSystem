package sample;
public class Wagon {


    String Destination;
    String Priorty;
    String cargotype;
    double weight;

    public Wagon(String destination, String priorty, String cargotype, double weight) {
        Destination = destination;
        Priorty = priorty;
        this.cargotype = cargotype;
        this.weight = weight;
    }


    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getPriorty() {
        return Priorty;
    }

    public void setPriorty(String priorty) {
        Priorty = priorty;
    }

    public String getCargotype() {
        return cargotype;
    }

    public void setCargotype(String cargotype) {
        this.cargotype = cargotype;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "Destination='" + Destination + '\'' +
                ", Priorty='" + Priorty + '\'' +
                ", cargotype='" + cargotype + '\'' +
                ", weight=" + weight +
                '}';
    }
}
