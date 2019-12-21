package objects.people;

import objects.varTypes.*;

public class Faculty extends Person{
    Department occupation;

    @Override
    public String toString() {
        String str = this.department.toString() + " Faculty\n";
        return str + super.toString();
    }
}