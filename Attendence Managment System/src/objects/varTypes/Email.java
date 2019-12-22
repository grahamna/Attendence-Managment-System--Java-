package objects.varTypes;

public class Email {
    private String email;

    public Email(final String email) {
        setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return this.email;
    }
}