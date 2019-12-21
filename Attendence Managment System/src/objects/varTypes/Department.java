package objects.varTypes;

public class Department {
    private int departmentID;
    private String departementName;

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartementName() {
        return departementName;
    }

    public void setDepartementName(String departementName) {
        this.departementName = departementName;
    }

    @Override
    public String toString() {
        return this.departementName;
    }

}