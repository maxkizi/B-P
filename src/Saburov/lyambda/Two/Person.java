package Saburov.lyambda.Two;

import java.util.Date;

public class Person {
    private String name;
    private Date dateOfBirth;
    private Double grade;

    public Person(String name, Date dateOfBirth, Double grade) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.grade = grade;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
