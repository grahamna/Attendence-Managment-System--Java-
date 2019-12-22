package objects.varTypes;

public class ID {
    private String type;
    private int ID;

    public ID(final String type, final int iD) {
        setID(iD);
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public int getID() {
        return ID;
    }

    public void setID(final int iD) {
        ID = iD;
    }

    @Override
    public String toString() {
        return this.type + " : " + this.ID;
    }
}