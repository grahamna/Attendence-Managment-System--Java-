package objects.varTypes.Building;

import java.util.ArrayList;

public class Building {
    private int numOfFloors;
    private String buildingName;
    private final ArrayList<Floor> floors = new ArrayList<Floor>();

    public Building(){
        
    }

    public Building(final int num, final String name) {
        setNumOfFloors(num);
        setBuildingName(name);
    }


    @Override
    public String toString() {
        return this.buildingName;
    }

    public String output() {
        String str = "B( " + this.buildingName + " { " + this.numOfFloors + " } < ";
        for (final Floor floor : floors) {
            str += floor.getRoomNum() + " ";
        }
        str += "> )";
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
    public ArrayList<Floor> getFloors() {
        return floors;
    }
    public void addFloor(final Floor floor) {
        this.floors.add(floor);
    }
    public void removeFloor(final Floor floor){
        this.floors.remove(floor);
    }

}