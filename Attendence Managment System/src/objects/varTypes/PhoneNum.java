package objects.varTypes;

public class PhoneNum {
    private String phoneNum;

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(final String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return this.phoneNum;
    }
}