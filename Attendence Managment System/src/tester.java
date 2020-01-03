import objects.varTypes.*;
import objects.varTypes.Building.*;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;

import methods.*;


public class tester {
    public static void main(String[] args) throws Exception {
        ArrayList <Building> buildings = new ArrayList<Building>();
        Factory f = new Factory();
        buildings.add(f.createBuilding());
        File fn = new File("test.txt");
        if (true){
            PrintStream ps = new PrintStream(fn);
            for (Building building : buildings) {
                ps.println(building.output());
            }
            ps.close();
        }
        if (fn.canRead()&&fn.canWrite()){
            f.useSchematic(fn, buildings);
        }
    }
}