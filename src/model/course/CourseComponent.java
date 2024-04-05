package model.course;

public class CourseComponent {
    private String name;
    private String description;
    private Double weight;
    private Double weightedSum;

    public CourseComponent() {
        this.name = "";
        this.description = "";
        this.weight = 0.0;
        this.weightedSum = 0.0;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public Double getWeight() {
        return weight;
    }

    public Double getWeightedSum() {
        return weightedSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setWeightedSum(Double weightedSum) {
        this.weightedSum = weightedSum;
    }

}
