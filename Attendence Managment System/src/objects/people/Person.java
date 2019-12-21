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
    
    protected Person(Name name, ID id, Email email, PhoneNum phoneNum, Department department, String type){
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
        String str = this.department.toString() + this.type.toString() +'\n';
        str+= "Name : " +this.name.toString()+'\n';
        str+= this.ID.toString()+'\n';
        str+= "Email : " + this.email.toString()+'\n';
        str+= "Phone Number : "+ this.phoneNum.toString();
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
    public void setName(Name name) {
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
    public void setId(ID id) {
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
    public void setEmail(Email email) {
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
    public void setPhoneNum(PhoneNum phoneNum) {
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
    public void setDepartment(Department department) {
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
    public void setType(String type) {
        this.type = type;
    }

}