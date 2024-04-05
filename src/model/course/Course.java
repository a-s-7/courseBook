package model.course;

import model.timeUnits.AcademicYear;

public class Course {
    private String courseDepartment;
    private Integer courseNumber;
    private String courseName;
    private String courseSession;
    private Integer termTaken;
    private AcademicYear academicYearTaken;
    private Integer credits;
    private String format;
    private Integer progress;
    private Integer finalGrade;

    private CourseSheet sheet;
}
