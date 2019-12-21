package objects.varTypes;

public class Name {
    private String fName;
    private char mInitial;
    private String lName;
    private boolean hasMiddleInit = false;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public char getmInitial() {
        return mInitial;
    }

    public void setmInitial(char mInitial) {
        this.mInitial = mInitial;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public boolean isHasMiddleInit() {
        return hasMiddleInit;
    }

    public void setHasMiddleInit(boolean hasMiddleInit) {
        this.hasMiddleInit = hasMiddleInit;
    }

    @Override
    public String toString() {
        String str = this.lName + ", ";
        if (this.hasMiddleInit){
            str+= this.mInitial+", ";
        }
        str+= this.lName;
        return str;
    }

    
}