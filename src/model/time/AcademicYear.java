package model.time;

import model.stats.Statistics;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class AcademicYear {
    private Year calendarYear;
    private Integer yearLevel;
    private List<Term> terms;
    private Statistics yearStats;


    public AcademicYear(int calendarYear, Integer yearLevel) {
        Year year = Year.of(calendarYear);
        this.calendarYear = year;
        this.yearLevel = yearLevel;

        this.terms = new ArrayList<>(2);
        this.yearStats = new Statistics();
    }

    public int getCalendarYearValue() {
        return calendarYear.getValue();
    }

    public int getYearLevel() {
        return yearLevel;
    }

}
