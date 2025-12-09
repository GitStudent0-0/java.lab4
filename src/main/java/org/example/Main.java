package org.example;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        CsvParser parser = new CsvParser();
        List<Person> people = parser.parse("foreign_names.csv");

        System.out.println("Всего загружено людей: " + people.size());
        System.out.println("\nПервые 10 записей:");

        for (int i = 0; i < Math.min(10, people.size()); i++)
            System.out.println(people.get(i));

    }
}
