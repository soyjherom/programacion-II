package Entities;

import java.util.List;
import java.util.ArrayList;

public class Student extends Person{
    private List<Course> courses = new ArrayList<Course>();
    public Student(){
        this.setType(new Type(this.getClass().toString()));
    }
    public Student(List<Course> courses){
        this.setType(new Type(this.getClass().toString()));
        this.courses = courses;
    }
    public List<Course> getCourses(){return this.courses;}
    public void addCourse(final Course course){
        this.courses.add(course);
    }
    public Course getCourse(final String courseName){
        for(Course course : this.courses){
            if(course.getName().equals(courseName)){
                return course;
            }
        }
        return null;
    }
    public void setGrade(final Course course){
        for(Course myCourse : this.courses){
            if(course.getName().equals(course.getName())){
                course.setGrade(course.getGrade());
            }
        }
    }
}
