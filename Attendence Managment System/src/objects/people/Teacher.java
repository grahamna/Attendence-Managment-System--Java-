package objects.people;

import objects.varTypes.*;

public class Teacher extends Person implements Iterable <Teacher> {

    protected Teacher(final Name name, final ID id, final Email email, final PhoneNum phoneNum, final Department department) {
        super(name, id, email, phoneNum, department, "Teacher");
    }
    
}