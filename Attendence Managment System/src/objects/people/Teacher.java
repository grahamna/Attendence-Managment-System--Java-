package objects.people;

import objects.varTypes.*;

public class Teacher extends Person {
    Department department;

    @Override
    public String toString() {
        String str = this.department.toString() + " Teacher\n";
        return str + super.toString();
    }
}