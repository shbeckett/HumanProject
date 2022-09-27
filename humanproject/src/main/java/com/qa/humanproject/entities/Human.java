package com.qa.humanproject.entities;

import org.springframework.stereotype.Component;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Component
public class Human {

    @Size(min = 2, max = 30)
    @NotNull
    private String firstName;

    @Size(min=2, max=30)
    private String lastName;

    @Min(18)
    @Max(75)
    private int age; 

    public Human()
    {
    }

    public Human(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}

