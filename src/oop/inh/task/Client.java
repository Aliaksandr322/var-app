package oop.inh.task;

public class Client {
    private int id;
    private String name;
    private String userRole;
    private String password;
    private String secondPassword;
    private String email;

    public Client(int id, String name, String userRole, String password, String secondPassword, String email) {
        this.id = id;
        this.name = name;
        this.userRole = userRole;
        this.password = password;
        this.secondPassword = secondPassword;
        this.email = email;
    }

    public Client(int id, String name, String userRole) {
        this(id,name,userRole, null, null,null);
        this.id = id;
        this.name = name;
        this.userRole = userRole;
    }

    public Client() {
        this(0,null,"Default user", null, null,null);

    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userRole='" + userRole + '\'' +
                ", password='" + "*****" + '\'' +
                ", secondPassword='" + "*****" + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecondPassword() {
        return secondPassword;
    }

    public void setSecondPassword(String secondPassword) {
        this.secondPassword = secondPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

