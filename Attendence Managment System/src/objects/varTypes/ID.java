package objects.varTypes;

public class ID {
    private String type;
    private int ID;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    @Override
    public String toString() {
        return this.type + " : " + this.ID;
    }
}