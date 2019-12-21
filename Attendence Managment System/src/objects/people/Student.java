package objects.people;

import objects.varTypes.*;

public class Student extends Person{
    Department major;

    @Override
    public String toString() {
        String str = this.department.toString() + " Student\n";
        return str + super.toString();
    }
}