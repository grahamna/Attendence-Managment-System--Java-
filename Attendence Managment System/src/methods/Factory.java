package methods;

import objects.varTypes.*;

import java.io.PrintStream;
import java.util.Scanner;

import objects.objects.people.*;
import objects.varTypes.Building.*;

public class Factory {

    Scanner input;
    
    public Factory() throws Exception{
        input = new Scanner(System.in);
    }
    public Factory(PrintStream in) throws Exception {
        input = new Scanner(in);
    }

    public Building createBuilding() {
        boolean fact = true;
        String name;
        int floorNum;
        do {
            try {
                System.out.println("What's the building's Name?\n-->");
                name = input.nextLine();
                System.out.println("How many floors?\n-->");
                floorNum = input.nextInt();
            } catch (Exception e) {
                System.out.println("Bad input");
            }
             
        } while (fact);
        


        Building b = new Building(num, name, floorArray);
        return null;
    }

    public Course createCourse() {

        return null;
    }

    public Student createStudent() {
        return null;
    }

    public Teacher createTeacher() {
        return null;
    }

    public Department createDepartment() {
        return null;
    }

    public Email createEmail() {
        return null;
    }

    public ID createID() {
        return null;
    }

    public Name createName() {
        return null;
    }

    public Office createOffice() {
        return null;
    }

    public PhoneNum createPhoneNum() {
        return null;
    }
    
}