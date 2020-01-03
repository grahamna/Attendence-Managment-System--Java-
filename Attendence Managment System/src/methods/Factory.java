package methods;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import objects.varTypes.*;
import objects.people.*;
import objects.varTypes.Building.*;


public class Factory {

    public Scanner input;
    
    public Factory() throws Exception{
        input = new Scanner(System.in);
    }

    public void useSchematic(File fin, ArrayList<Building> b) throws Exception {
        input.close();
        input = new Scanner(fin);
        while (input.hasNext()) {
            String str = input.nextLine();
            char c = str.charAt(0);
            if (c == 'B'){
                Scanner temp = new Scanner(str.substring(1));
                String name = temp.findInLine(" ([A-z]+) ");
                name = name.trim();
                int floorNum = Integer.parseInt(temp.findInLine("([0-9]+)"));
                int[] rooms = new int [3];
                for (int x=0; x<floorNum; x++){
                    rooms[x] = Integer.parseInt(temp.findInLine("([0-9]+)"));;
                }
                temp.close();
                //Building e = 
                //b.add(e);
            }
            else if (c == 'C'){

            }
            else if (c == 'S'){

            }
            else if (c == 'T') {

            }
            else if (c == 'D'){
                
            }
        }
        input.close();
    }

    public Building createBuilding() {
        boolean fact = true;
        String name;
        int floorNum;
        Building b;

        System.out.println("Building Builder\n");
        do {
            try {
                System.out.println("What's the building's Name?");
                name = input.nextLine();
                name.trim();
                System.out.println("How many floors?");
                floorNum = input.nextInt();
                b = new Building(floorNum, name);
                if (floorNum<1) throw new IllegalArgumentException();
                for (int x = 0; x<floorNum;x++){
                    Floor f = createFloor(x+1,b);
                    b.addFloor(f);
                }
                return b;
            } catch (final Exception e) {
                System.out.println("Bad input - Building");
                input.nextLine();
            }

        } while (fact);
        return null;
    }

    public Floor createFloor(int floorNum, Building b) {
        boolean fact = true;
        int fNum = floorNum;
        int roomNum;
        Floor f;

        System.out.println("Floor Builder\n");
        do {
            try {
                System.out.println("Floor "+fNum+"\nHow many rooms on this floor?");
                roomNum = input.nextInt();
                if(roomNum<1) throw new IllegalArgumentException();
                f = new Floor(floorNum, roomNum, b);
                for(int x=0; x<roomNum; x++) {
                    Room r = new Room(x+1, f, b);
                    f.addRoom(r);
                }
                return f;
            } catch (Exception e) {
                System.out.println("Bad input - Floor");
                input.nextLine();
            }
        } while (fact);
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