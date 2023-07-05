package oop.inh.task;

public class SuperUser extends Client{
    private String functions;

    public String getFunctions() {
        return functions;
    }

    public void setFunctions(String functions) {
        this.functions = functions;
    }

    public SuperUser() {
        this.setUserRole("Admin");
    }
}
