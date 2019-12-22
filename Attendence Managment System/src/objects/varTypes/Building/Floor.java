package objects.varTypes.Building;

import java.util.List;

public class Floor implements Iterable <Floor> {
    private Building building;
    private List <Room> rooms;
    private int floorNum;

    public Floor(final Building building, final List<Room> rooms, final int floorNum) {
        setBuilding(building);
        setRooms(rooms);
        setFloorNum(floorNum);
    }
    
    @Override
    public String toString() {
        return "Floor "+this.floorNum+" of "+this.building.toString();
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
     * @return List<Room> return the rooms
     */
    public List<Room> getRooms() {
        return rooms;
    }

    /**
     * @param rooms the rooms to set
     */
    public void setRooms(final List<Room> rooms) {
        this.rooms = rooms;
    }

    /**
     * @return int return the floorNum
     */
    public int getFloorNum() {
        return floorNum;
    }

    /**
     * @param floorNum the floorNum to set
     */
    public void setFloorNum(final int floorNum) {
        this.floorNum = floorNum;
    }

}