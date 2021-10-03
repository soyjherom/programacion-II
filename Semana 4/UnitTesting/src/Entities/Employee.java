package Entities;

import java.util.List;
import java.util.ArrayList;

public class Employee extends Person{
    private List<Type> roles = new ArrayList<Type>();
    public Employee(){
        this.setType(new Type(this.getClass().toString()));
    }
    public Employee(final List<Type> roles){
        this.setType(new Type(this.getClass().toString()));
        this.roles = roles;
    }
    public void addRole(final Type value){
        for(Type role : this.roles){
            if(!role.getName().equals(value.getName())){
                this.roles.add(value);
            }
        }
    }
    public List<Type> getRoles(){
        return this.roles;
    }
}
