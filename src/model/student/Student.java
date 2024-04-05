package model.student;

import model.course.CourseStats;
import model.timeUnits.AcademicYear;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private StudentPersonalInfo personalInfo;
    /*Academic Information*/
    private StudentAcademicInfo academicInfo;
    private List<AcademicYear> yearList;
    private CourseStats cumulativeStats;

    public Student(StudentPersonalInfo personalInfo, StudentAcademicInfo academicInfo) {
        this.personalInfo = personalInfo;
        this.academicInfo = academicInfo;
        this.yearList = new ArrayList<>();
    }

    public void addYear(int calYear, Integer yearLevel) {
        AcademicYear year = new AcademicYear(calYear, yearLevel);
        this.yearList.add(year);
    }
}
