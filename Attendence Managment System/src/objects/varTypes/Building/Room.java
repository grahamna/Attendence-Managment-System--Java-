package objects.varTypes.Building;

import java.util.Iterator;

public class Room implements Iterable<Room> {
    private Building building;
    private Floor floor;
    private int roomNum;

    public Room(final int roomNum,final Floor floor, final Building building) {
        setRoomNum(roomNum);
        setFloorNum(floor);
        setBuilding(building);
    }

    @Override
    public String toString() {
        if(this.roomNum<10) {
            return this.building.toString() + " - " + floor.getFloorNum() +"0" +this.roomNum;
        }
        else{
            return this.building.toString() + " - " + floor.getFloorNum() +this.roomNum;
        }
    }

    public Building getBuilding() {
        return building;
    }

    public Floor getFloorNum() {
        return floor;
    }

    public void setFloorNum(final Floor floor) {
        this.floor = floor;
    }

    public void setBuilding(final Building building) {
        this.building = building;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(final int roomNum) {
        this.roomNum = roomNum;
    }

    @Override
    public Iterator<Room> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
}