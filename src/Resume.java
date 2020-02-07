public class Resume {
//    a name,
//    an email address,

    //variables
    private String name;
    private String email;

    //constructors
    public Resume() {
    }
    public Resume(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //methods -- getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
