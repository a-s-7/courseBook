package model.stats;

public class Statistics {
    private Integer courseCount;
    private Integer creditCount;
    private Integer average;

    public Statistics() {
        this.courseCount = 0;
        this.creditCount = 0;
        this.average = 0;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public int getCreditCount() {
        return creditCount;
    }

    public int getAverage() {
        return average;
    }

    public void incrementCourseCount() {
        this.courseCount += 1;
    }

    public void incrementCreditCount(int cred) {
        this.creditCount += cred;
    }

    public void setAverage(int average) {
        this.average = average;
    }
}
