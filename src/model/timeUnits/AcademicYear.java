package model.timeUnits;

import model.course.CourseStats;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class AcademicYear {
    private Year calendarYear;
    private Integer yearLevel;
    private List<Term> terms;
    private CourseStats yearStats;


    public AcademicYear(int calendarYear, Integer yearLevel) {
        Year year = Year.of(calendarYear);
        this.calendarYear = year;
        this.yearLevel = yearLevel;

        this.terms = new ArrayList<>(2);
        this.yearStats = new CourseStats();
    }

    public int getCalendarYearValue() {
        return calendarYear.getValue();
    }

    public int getYearLevel() {
        return yearLevel;
    }

}
