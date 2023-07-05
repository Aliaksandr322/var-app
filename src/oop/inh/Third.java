package oop.inh;

public class Third extends Child{
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long id;

    public void run(){
        System.out.println(getName() + " is running...");
    }
}
