package objects.people;

import objects.varTypes.*;

public class Teacher extends Person implements Iterable <Teacher> {

    private ArrayList <Course> teachesCourses = new ArrayList<Course>();

    protected Teacher(final Name name, final ID id, final Email email, final PhoneNum phoneNum, final Department department) {
        super(name, id, email, phoneNum, department, "Teacher");
    }
    

    /**
     * @return ArrayList<Course> return the teachesCourses
     */
    public ArrayList<Course> getTeachesCourses() {
        return teachesCourses;
    }

    /**
     * @param teachesCourses the teachesCourses to set
     */
    public void setTeachesCourses(ArrayList<Course> teachesCourses) {
        this.teachesCourses = teachesCourses;
    }

}