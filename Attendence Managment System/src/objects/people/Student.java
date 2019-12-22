package objects.people;

import java.util.List;

import objects.varTypes.*;

public class Student extends Person implements Iterable<Student>{

    protected Student(final Name name, final ID id, final Email email, final PhoneNum phoneNum, final Department department) {
        super(name, id, email, phoneNum, department, "Student");
    }
    
}