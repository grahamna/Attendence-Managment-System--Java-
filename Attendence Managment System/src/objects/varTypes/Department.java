package objects.varTypes;

public class Department {
    private ID departmentID;
    private String departementName;
    private Building building;

    public ID getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(ID departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartementName() {
        return departementName;
    }

    public void setDepartementName(String departementName) {
        this.departementName = departementName;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    } 

    @Override
    public String toString() {
        return this.departementName;
    }


}