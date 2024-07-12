package dz3;

import java.util.Scanner;

public class Worker {
    String name;
    String lastName;
    String profession;

    public Worker(String name, String lastName, String profession) {
        this.name = name;
        this.lastName = lastName;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void goToWork(){

    }
    public void goToVocation(int days){

    }

}
