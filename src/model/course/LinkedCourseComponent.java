package model.course;

import model.course.CourseComponent;

import java.util.ArrayList;
import java.util.List;

public class LinkedCourseComponent extends CourseComponent {
    private List<CourseComponent> linkedComponents;

    public LinkedCourseComponent() {
        super();
        this.linkedComponents = new ArrayList<>();
    }

    public List<CourseComponent> getLinkedComponents() {
        return linkedComponents;
    }

    public void setLinkedComponents(List<CourseComponent> linkedComponents) {
        this.linkedComponents = linkedComponents;
    }

}
