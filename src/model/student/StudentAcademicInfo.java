package model.student;

import java.time.Year;
import java.util.List;

public class StudentAcademicInfo {
    private String major;
    private String university;
    private java.time.Year enrollmentYear;
    private Integer currentYearLevel;

    public StudentAcademicInfo(String major, String university, Year enrollmentYear, Integer currentYearLevel) {
        this.major = major;
        this.university = university;
        this.enrollmentYear = enrollmentYear;
        this.currentYearLevel = currentYearLevel;
    }

    public String getMajor() {
        return major;
    }

    public String getUniversity() {
        return university;
    }

    public Year getEnrollmentYear() {
        return enrollmentYear;
    }

    public Integer getCurrentYearLevel() {
        return currentYearLevel;
    }
}
