package objects.varTypes;

import objects.varTypes.Building.Room;

public class Office {
    private Room room;
    private PhoneNum phoneNum;

    public Office(final Room room, final PhoneNum phoneNum) {
        setRoom(room);
        setPhoneNum(phoneNum);
    }
    
    @Override
    public String toString() {
        return "Office: "+ this.getRoom().toString() + '\n' + this.getPhoneNum().toString();
    }

    /**
     * @return Room return the room
     */
    public Room getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(final Room room) {
        this.room = room;
    }

    /**
     * @return PhoneNum return the phoneNum
     */
    public PhoneNum getPhoneNum() {
        return phoneNum;
    }

    /**
     * @param phoneNum the phoneNum to set
     */
    public void setPhoneNum(final PhoneNum phoneNum) {
        this.phoneNum = phoneNum;
    }

}