package objects.varTypes;

import java.util.List;

public class Building {
    private int numOfFloors;
    private String building;
    private List<List <Room>> floors;
    
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * @return int return the numOfFloors
     */
    public int getNumOfFloors() {
        return numOfFloors;
    }

    /**
     * @param numOfFloors the numOfFloors to set
     */
    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    /**
     * @return String return the building
     */
    public String getBuilding() {
        return building;
    }

    /**
     * @param building the building to set
     */
    public void setBuilding(String building) {
        this.building = building;
    }

    /**
     * @return List<List<Room>> return the floors
     */
    public List<List<Room>> getFloors() {
        return floors;
    }

    /**
     * @param floors the floors to set
     */
    public void setFloors(List<List<Room>> floors) {
        this.floors = floors;
    }

}