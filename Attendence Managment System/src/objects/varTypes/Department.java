package objects.varTypes;

import java.util.List;

import objects.people.Teacher;

public class Department implements Iterable<Teacher>{
    private ID departmentID;
    private String departementName;
    private Building building;
    private List<Teacher> departmentTeachers;
    private List<Student> departmentStudents;

    public ID getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(final ID departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartementName() {
        return departementName;
    }

    public void setDepartementName(final String departementName) {
        this.departementName = departementName;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(final Building building) {
        this.building = building;
    } 

    @Override
    public String toString() {
        return this.departementName;
    }


}