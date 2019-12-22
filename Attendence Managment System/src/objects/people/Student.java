package objects.people;

import java.util.ArrayList;

import objects.varTypes.*;

public class Student extends Person implements Iterable<Student>{

    private ArrayList <Course> takesCourses = new ArrayList<Course>();

    protected Student(final Name name, final ID id, final Email email, final PhoneNum phoneNum, final Department department) {
        super(name, id, email, phoneNum, department, "Student");
    }
    

    /**
     * @return ArrayList<Course> return the takesCourses
     */
    public ArrayList<Course> getTakesCourses() {
        return takesCourses;
    }

    /**
     * @param takesCourses the takesCourses to set
     */
    public void setTakesCourses(ArrayList<Course> takesCourses) {
        this.takesCourses = takesCourses;
    }

}