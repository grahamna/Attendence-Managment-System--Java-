package objects.varTypes;



public class Room {
    private Building building;
    private String roomNum;
    
    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    @Override
    public String toString() {
        return this.building.toString() + " : " + this.roomNum;
    }
}