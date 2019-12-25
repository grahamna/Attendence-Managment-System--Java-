package objects.varTypes;

public class ID {
    private String type;
    private String ID;

    public ID(final String type, final String iD) {
        setID(iD);
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getID() {
        return ID;
    }

    public void setID(final String iD) {
        ID = iD;
    }

    @Override
    public String toString() {
        return this.type + " : " + this.ID;
    }
}