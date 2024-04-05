package model.course;

import model.course.CourseComponent;

public class NumericCourseComponent extends CourseComponent {
    private Double grade;

    public NumericCourseComponent() {
        super();
        this.grade = 0.0;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

}
