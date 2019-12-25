package objects.varTypes.Building;

import java.util.List;

public class Building {
    private int numOfFloors;
    private String buildingName;
    private List<Floor> floors;

    public Building(final int num, final String name, final List<Floor> floorArray) {
        setNumOfFloors(num);
        setBuildingName(name);
        setFloors(floorArray);
    }


    @Override
    public String toString() {
        return buildingName.toString();
    }

    public String describe() {
        String str = "( " + this.buildingName + " { " + this.numOfFloors + " } < ";
        for (final Floor floor : floors) {
            str += floor.getFloorNum() + " ";
        }
        str += "> ) ";
        return str;
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
    public void setNumOfFloors(final int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    /**
     * @return String return the buildingName
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * @param buildingName the buildingName to set
     */
    public void setBuildingName(final String buildingName) {
        this.buildingName = buildingName;
    }

    /**
     * @return List<Floor> return the floors
     */
    public List<Floor> getFloors() {
        return floors;
    }

    /**
     * @param floors the floors to set
     */
    public void setFloors(final List<Floor> floors) {
        this.floors = floors;
    }

}