# Attendence Managment System (Java)

OUTLINE/Planning
-------------------------------------------------------------------
Currently Working on:
Make an "output" method for all classes?
Then will have to make regex for all strings, probably in a class named obtain_info, for creation of new objects (dynamic)


Will have to make a method to read in a schematic of school stuff to initialize a base of buildings, floors, rooms, dep... all objects

This will facilitate testing of methods and objects, and create an ability to easilly save/transfer schematics
Will main() hold an "array" of buildings? Should I make a School class? which hold buildings? 

Order for creation of objects
    1. Buildings --> Floors --> Rooms (one statement?)
    2. Departments


Formatted output order

    Buildings

    Departments
        Courses

    Teachers

    Students

ex: 



//End current thoughts
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

==========Building Objects==============          ! = info needed @ creation

public class Building
!    private int numOfFloors;
!    private String buildingName;
!    private List<Floor> floors;  |  1 = first floor building, 1 is two floor building (part of object creation?)

public class Floor implements Iterable <Floor> {
!    private Building building;
!    private List <Room> rooms;
!    private int floorNum;
!    private int roomNum;

public class Room implements Iterable<Room>{
!    private Building building;
!    private Floor floor;
!    private int roomNum;

nested creation statement required Building(Floor(Room()))

=============Base componet objects============

public class Course implements Iterable<Course> {
    private Teacher teacher;  |  is teacher (DYNAMICLLY ASSIGNED) - same department req?
    private final ArrayList<Student> studentList = new ArrayList<Student>();  |  students taking course (DYNAMICLLY ASSIGNED)
!    private Department dep;  |  dep offering course (PRE EXIST!)
!    private String courseName;  |  course name, such as Calculus II
!    private String courseNum;  |  num for course, such as 302 maybe for calc 2?
!    private String courseID;  |  is department's id num, then the course num, (if MATH dep id num is 01, then id for Calc II would be 01302)
    private Room room;  |  room where lectures are hosted (DYNAM Assigned)

public class Department implements Iterable<Department>{
!    private ID departmentID;
!    private String departementName;  |  EX. biology, physics, english, history...
    private Building building;  |  where offices are located, what building (Science building)
    private final ArrayList<Teacher> departmentTeachers = new ArrayList<Teacher>();  |  list of profs for this department
    private final ArrayList<Student> departmentStudents = new ArrayList<Student>();  |  list of students majoring in dep
    private final ArrayList<Course> departmentCourses = new ArrayList<Course>();  |  list of courses offered by dep

public class Email {
!    private String email;

public class ID {
!    private String type;
!    private String ID;

public class Name {
!    private String fName;
!    private char mInitial;
!    private String lName;
?    private boolean hasMiddleInit = /*default*/ false;

public class Office {
!    private Room room;
?    private PhoneNum phoneNum;  nested creation?

public class PhoneNum {
!    private String phoneNum;
