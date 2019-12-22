package objects.people;

import java.util.List;

import objects.varTypes.*;

protected abstract class Person {
    private Name name;
    private ID id;
    private Email email;
    private PhoneNum phoneNum;
    private Department department;
    private String type;
    
    protected Person(final Name name, final ID id, final Email email, final PhoneNum phoneNum, final Department department, final String type) {
        setName(name);
        setId(id);
        setEmail(email);
        setPhoneNum(phoneNum);
        setDepartment(department);
        setType(type);
    }

    abstract boolean isValid();

    @Override
    public String toString() {
        String str = this.department.toString() + this.type.toString() + '\n';
        str += "Name : " + this.name.toString() + '\n';
        str += this.ID.toString() + '\n';
        str += "Email : " + this.email.toString() + '\n';
        str += "Phone Number : " + this.phoneNum.toString();
        return str;
    }

    /**
     * @return Name return the name
     */
    public Name getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(final Name name) {
        this.name = name;
    }

    /**
     * @return ID return the id
     */
    public ID getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(final ID id) {
        this.id = id;
    }

    /**
     * @return Email return the email
     */
    public Email getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(final Email email) {
        this.email = email;
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

    /**
     * @return Department return the department
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(final Department department) {
        this.department = department;
    }

    /**
     * @return String return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(final String type) {
        this.type = type;
    }

}