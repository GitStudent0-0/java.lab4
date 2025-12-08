package org.example;

import java.util.Objects;

public class Division
{
    private static int idCounter = 1;
    private int id;
    private String name;

    public Division(String name)
    {
        this.id = idCounter++;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Division{id=" + id + ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Division division = (Division) o;
        return Objects.equals(name, division.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }
}

