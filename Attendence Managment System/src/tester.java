import objects.varTypes.*;
import objects.varTypes.Building.*;

import java.io.File;
import java.io.PrintStream;

import methods.*;


public class tester {
    public static void main(String[] args) throws Exception {
        Factory f = new Factory();
        Building b = f.createBuilding();
        File fn = new File("test.txt");
        if (b!=null){
            System.out.println("YAY");
            PrintStream ps = new PrintStream(fn);
            ps.println(b.describe());
            ps.close();
        }
        Factory read = new Factory(new File("test.txt"));
        Building a = read.createBuilding();
        f.input.close();
    }
}