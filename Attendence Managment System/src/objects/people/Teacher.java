package objects.people;

import objects.varTypes.*;

public class Teacher extends Person implements Iterable <Teacher> {

    private Office office;

    protected Teacher(final Name name, final ID id, final Email email, final PhoneNum phoneNum, final Department department) {
        super(name, id, email, phoneNum, department, "Teacher");
    }
    


    /**
     * @return Room return the office
     */
    public Room getOffice() {
        return office;
    }

    /**
     * @param office the office to set
     */
    public void setOffice(Room office) {
        this.office = office;
    }

}