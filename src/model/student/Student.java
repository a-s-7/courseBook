package model.student;

import model.stats.Statistics;
import model.time.AcademicYear;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private StudentPersonalInfo personalInfo;
    /*Academic Information*/
    private StudentAcademicInfo academicInfo;
    private List<AcademicYear> yearList;
    private Statistics cumulativeStats;

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
