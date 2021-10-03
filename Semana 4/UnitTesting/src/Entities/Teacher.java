package Entities;

public class Teacher extends Person{
    private int rate = 0;
    public Teacher(){
        this.setType(new Type(this.getClass().toString()));
    }
    public void setRate(final int value){this.rate = value;}
    public int getRate(){return this.rate;}
}
