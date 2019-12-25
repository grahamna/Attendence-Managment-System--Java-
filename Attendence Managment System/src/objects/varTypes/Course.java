package objects.varTypes;

import java.util.ArrayList;

import objects.people.Student;
import objects.people.Teacher;
import objects.varTypes.Building.Room;

public class Course implements Iterable<Course> {
    private Teacher teacher;
    private final ArrayList<Student> studentList = new ArrayList<Student>();
    private Department dep;
    private String courseName;
    private String courseNum;
    private String courseID;
    private Room room;

    public Course(final Teacher teacher, final Department dep, final String courseName, final String courseNum,
            final String courseID, final Room room) {
        setTeacher(teacher);
        setDep(dep);
        setCourseName(courseName);
        setCourseNum(courseNum);
        setCourseID(courseID);
        setRoom(room);
    }

    @Override
    public String toString() {
        return this.courseID + " | " + this.courseNum + " | " + this.courseName;
    }

    public String describe() {
        return this.toString() + '\n' + this.room.toString() + '\n'; 
        //may be incomplete
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(final Room room) {
        this.room = room;
    }

    /**
     * @return Teacher return the teacher
     */
    public Teacher getTeacher() {
        return teacher;
    }

    /**
     * @param teacher the teacher to set
     */
    public void setTeacher(final Teacher teacher) {
        this.teacher = teacher;
    }

    /**
     * @return ArrayList<Student> return the studentList
     */
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public void addStudent(final Student s) {
        this.studentList.add(s);
    }

    public void removeStudent(final Student s) {
            this.studentList.remove(s);
    }

    /**
     * @return Department return the dep
     */
    public Department getDep() {
        return dep;
    }

    /**
     * @param dep the dep to set
     */
    public void setDep(final Department dep) {
        this.dep = dep;
    }

    /**
     * @return String return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(final String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return String return the courseNum
     */
    public String getCourseNum() {
        return courseNum;
    }

    /**
     * @param courseNum the courseNum to set
     */
    public void setCourseNum(final String courseNum) {
        this.courseNum = courseNum;
    }

    /**
     * @return String return the courseID
     */
    public String getCourseID() {
        return courseID;
    }

    /**
     * @param courseID the courseID to set
     */
    public void setCourseID(final String courseID) {
        final String str = this.dep.getDepartmentID().getID() + courseID;
        this.courseID = str;
    }

}