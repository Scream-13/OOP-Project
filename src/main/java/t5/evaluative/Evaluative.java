package t5.evaluative;

public class Evaluative {
    private String name;
    private double weightage;

    public Evaluative(String name, double weightage) {
        this.name = name;
        this.weightage = weightage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeightage() {
        return weightage;
    }

    public void setWeightage(double weightage) {
        this.weightage = weightage;
    }

}
