# Attendence Managment System (Java)

OUTLINE/Planning

Objects within system//

Brainstorm outline
Name
ID
    type?
    student
    faculty?
email
phone num

Teachers (inherit from person?)
    Name
    ID num
    List of classes they teach
    list of classes they previously tought?
    email
    phone num
    department
    Office room


Students
    Name
    email
    list of classes they attend
    major
    phone num
    ID num
    previously attended classes?
    Year? based on credits?


Classes
    room id
    class id
    class name
    class time
    department offering class?

Rooms
    room id      (XYY) - X=floor, Y=room num
    building
    room type
        Office (prof office)
        Classroom
            Lab classroom
            Lecture classroom
-------------------------------------------------------------------
final? objects made

People
    person
        teacher
        student
Variables
    parts of a Building
        Building
        Floor
        Room
    Course
    Department
    Email
    ID
    Name
    PhoneNumber
    Office

----People objects Have----
Person
    A name
    ID
    Email
    PhoneNum
    Department (Major or department)
    Array of Courses (that they teach or take)
    A string type identifier (Teacher or Student)

    Students extend Person
        no unique class objects

    Teachers extend Person
        uniquely have Office object

==========Building Objects==============

public class Building
    private int numOfFloors;
    private String buildingName;
    private List<Floor> floors;

public class Floor implements Iterable <Floor> {
    private Building building;
    private List <Room> rooms;
    private int floorNum;
    private int roomNum;

public class Room implements Iterable<Room>{
    private Building building;
    private Floor floor;
    private int roomNum;

=============Base componet objects============

public class Course implements Iterable<Course> {
    private Teacher teacher;
    private final ArrayList<Student> studentList = new ArrayList<Student>();
    private Department dep;
    private String courseName;
    private String courseNum;
    private String courseID;
    private Room room;

public class Department implements Iterable<Department>{
    private ID departmentID;
    private String departementName;
    private Building building;
    private final ArrayList<Teacher> departmentTeachers = new ArrayList<Teacher>();
    private final ArrayList<Student> departmentStudents = new ArrayList<Student>();

public class Email {
    private String email;

public class ID {
    private String type;
    private String ID;

public class Name {
    private String fName;
    private char mInitial;
    private String lName;
    private boolean hasMiddleInit = /*default*/ false;

public class Office {
    private Room room;
    private PhoneNum phoneNum;

public class PhoneNum {
    private String phoneNum;
