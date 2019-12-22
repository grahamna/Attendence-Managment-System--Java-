package objects.varTypes.Building;

public class Room implements Iterable<Room>{
    private Building building;
    private Floor floor;
    private int roomNum;

    public Room(final Building building, final Floor floor, final int roomNum) {
        setBuilding(building);
        setFloorNum(floor);
        setRoomNum(roomNum);
    }

    @Override
    public String toString() {
        return this.building.toString() + " - " + floor.getFloorNum() + this.roomNum;
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
}