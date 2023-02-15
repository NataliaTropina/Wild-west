public class Cowboy implements Comparable<Cowboy> {

    private  String name;
    private double gunsWeight;

    public String getName() {
        return name;
    }

    public double getGunsWeight() {
        return gunsWeight;
    }

    public Cowboy(String name, double gunsWeight) {
        this.name = name;
        this.gunsWeight = gunsWeight;
    }

    @Override
    public String toString() {
        return "Cowboy" +
                "name='" + name + '\'' +
                ", gunsWeight=" + gunsWeight +
                '\n';
    }

    @Override
    public int compareTo(Cowboy o) {
        return -Double.compare(gunsWeight, o.gunsWeight);
    }
}
