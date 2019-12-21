package objects.people;

import objects.varTypes.*;

protected abstract class Person {
    Name name;
    ID ID;
    Email email;
    PhoneNum phoneNum;

    abstract boolean isValid();

    @Override
    public String toString() {
        String str = "Name : " +this.name.toString()+'\n';
        str+= this.ID.toString()+'\n';
        str+= "Email : " + this.email.toString()+'\n';
        str+= "Phone Number : "+ this.phoneNum.toString();
    }
}