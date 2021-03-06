package objects.varTypes;

import java.util.ArrayList;
import java.util.Iterator;

import objects.people.Student;
import objects.people.Teacher;
import objects.varTypes.Building.Building;

public class Department implements Iterable<Department> {
    private ID departmentID;
    private String departementName;
    private Building building;
    private final ArrayList<Teacher> departmentTeachers = new ArrayList<Teacher>();
    private final ArrayList<Student> departmentStudents = new ArrayList<Student>();
    private final ArrayList<Course> departmentCourses = new ArrayList<Course>();

    public Department(final ID departmentID, final String departmentName, final Building building,
            final ArrayList<Teacher> departmentTeachers, final ArrayList<Student> departmentStudents) {
        setDepartmentID(departmentID);
        setDepartementName(departementName);
        setBuilding(building);
    }

    @Override
    public String toString() {
        return this.departementName;
    }

    public String describe() {
        String str = this.departementName + " | " + this.departmentID + " | " + this.building + '\n';
        str += "--Teachers--\n";
        for (Teacher teacher : departmentTeachers) {
            str += teacher.toString() + '\n';
        }
        str += "--Students--\n";
        for (Student student : departmentStudents) {
            str += student.toString() + '\n';
        }
        return str;
    }

    /**
     * @return ID return the departmentID
     */
    public ID getDepartmentID() {
        return departmentID;
    }

    /**
     * @param departmentID the departmentID to set
     */
    public void setDepartmentID(final ID departmentID) {
        this.departmentID = departmentID;
    }

    /**
     * @return String return the departementName
     */
    public String getDepartementName() {
        return departementName;
    }

    /**
     * @param departementName the departementName to set
     */
    public void setDepartementName(final String departementName) {
        this.departementName = departementName;
    }

    /**
     * @return Building return the building
     */
    public Building getBuilding() {
        return building;
    }

    /**
     * @param building the building to set
     */
    public void setBuilding(final Building building) {
        this.building = building;
    }

    /**
     * @return List<Teacher> return the departmentTeachers
     */
    public ArrayList<Teacher> getDepartmentTeachers() {
        return departmentTeachers;
    }

    public void addDepartmentTeachers(final Teacher e) {
        this.departmentTeachers.add(e);
    }

    public void removeDepartmentTeachers(final Teacher e) {
        this.departmentTeachers.remove(e);
    }

    /**
     * @return List<Student> return the departmentStudents
     */
    public ArrayList<Student> getDepartmentStudents() {
        return departmentStudents;
    }

    public void addDepartmentStudents(final Student s) {
        this.departmentStudents.add(s);
    }

    public void removeDepartmentStudents(final Student s) {
        this.departmentStudents.remove(s);
    }

    /**
     * @return List<Course> return the departmentStudents
     */
    public ArrayList<Course> getDepartmentCourses() {
        return departmentCourses;
    }

    public void addDepartmentCourses(final Course s) {
        this.departmentCourses.add(s);
    }

    public void removeDepartmentCourses(final Course s) {
        this.departmentCourses.remove(s);
    }

    @Override
    public Iterator<Department> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
}