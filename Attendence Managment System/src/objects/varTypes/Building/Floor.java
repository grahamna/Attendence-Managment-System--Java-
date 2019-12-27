package objects.varTypes.Building;

import java.util.Iterator;
import java.util.ArrayList;

public class Floor implements Iterable<Floor> {
    private Building building;
    private ArrayList<Room> rooms = new ArrayList<Room>();
    private int floorNum;
    private int roomNum;

    public Floor(final int floorNum, final int roomNum, Building building) {
        setFloorNum(floorNum);
        setRoomNum(roomNum);
        setBuilding(building);
    }

    @Override
    public String toString() {
        return "Floor " + this.floorNum + " of " + this.building.toString();
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
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public void addRoom(Room r){
        this.rooms.add(r);
    }
    public void removeRoom(Room r){
        this.rooms.remove(r);
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

    /**
     * @return int return the roomNum
     */
    public int getRoomNum() {
        return roomNum;
    }

    /**
     * @param roomNum the roomNum to set
     */
    public void setRoomNum(final int roomNum) {
        this.roomNum = roomNum;
    }

    @Override
    public Iterator<Floor> iterator() {
        return null;
    }

}