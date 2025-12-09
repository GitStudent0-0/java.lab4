package org.example;

public class Person
{
    private int id;
    private String name;
    private String gender;
    private Division division;
    private double salary;
    private String birthDate;

    public Person(int id, String name, String gender, Division division, double salary, String birthDate)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.division = division;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getGender()
    {
        return gender;
    }

    public Division getDivision()
    {
        return division;
    }

    public double getSalary()
    {
        return salary;
    }

    public String getBirthDate()
    {
        return birthDate;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", division=" + division +
                ", salary=" + salary +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
