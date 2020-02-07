public class Resume {
//    a name,
//    an email address,

    //variables
    private String name;
    private String email;
    private String phone;

    //constructors
    public Resume() {
    }
    public Resume(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
