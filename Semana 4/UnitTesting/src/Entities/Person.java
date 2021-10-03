package Entities;

public class Person extends Entity{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private char gender;
    private int age;
    private Type type;
    public Person(){}
    public Person(final Type type){
        this.type = type;
    } 
    public void setFirstName(final String value){this.firstName = value;}
    public String getFirstName(){return this.firstName;}
    public void setLastName(final String value){this.lastName = value;}
    public String getLastName(){return this.lastName;}
    public void setPhoneNumber(final String value){this.phoneNumber = value;}
    public String getPhoneNumber(){return this.phoneNumber;}
    public void setEmail(final String value){this.email = value;}
    public String getEmail(){return this.email;}
    public void setGender(final char value){this.gender = value;}
    public char getGender(){return this.gender;}
    public void setAge(final int value){this.age = value;}
    public int getAge(){return this.age;}
    public void setType(final Type value){this.type = value;}
    public Type getType(){return this.type;}
}