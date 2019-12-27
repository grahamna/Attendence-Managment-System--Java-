package objects.people;

import java.util.Iterator;

import objects.varTypes.*;

public class Student extends Person implements Iterable<Student> {

    protected Student(final Name name, final ID id, final Email email, final PhoneNum phoneNum,
            final Department department) {
        super(name, id, email, phoneNum, department, "Student");
    }

    @Override
    public Iterator<Student> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
    

}