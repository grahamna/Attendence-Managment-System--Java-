package objects.people;

import java.util.ArrayList;

import objects.varTypes.*;

protected abstract class Person {
    private Name name;
    private ID id;
    private Email email;
    private PhoneNum phoneNum;
    private Department department;
    private String type;
    private final ArrayList<Course> hasCourses = new ArrayList<Course>();

    protected Person(final Name name, final ID id, final Email email, final PhoneNum phoneNum,
            final Department department, final String type) {
        setName(name);
        setId(id);
        setEmail(email);
        setPhoneNum(phoneNum);
        setDepartment(department);
        setType(type);
    }

    @Override
    public String toString() {
        String str = this.department.toString() + this.type.toString() + '\n';
        str += "Name : " + this.name.toString() + '\n';
        str += this.ID.toString() + '\n';
        str += "Email : " + this.email.toString() + '\n';
        str += "Phone Number : " + this.phoneNum.toString();
        return str;
    }

    public String printMyCourses() {
        String str = "";
        for (final Course course : takesCourses) {
            str += course.toString() + '\n';
        }
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

    public ArrayList<Course> getHasCourses() {
        return hasCourses;
    }
    public void addHasCourses(final Course s) {
        this.hasCourses.add(s);
    }
    public void removeHasCourses(final Course s) {
        this.hasCourses.remove(s);
    }
}