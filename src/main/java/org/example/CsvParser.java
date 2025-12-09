package org.example;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvParser
{
    public List<Person> parse(String fileName)
    {
        List<Person> people = new ArrayList<>();
        Map<String, Division> divisionsCache = new HashMap<>();

        try (InputStream in = getClass().getClassLoader().getResourceAsStream(fileName))
        {
            if (in == null)
            {
                System.out.println("Файл не найден: " + fileName);
                return people;
            }

            CSVReader reader = new CSVReaderBuilder(new InputStreamReader(in))
                    .withCSVParser(new CSVParserBuilder().withSeparator(';').build())
                    .build();

            String[] nextLine;
            while ((nextLine = reader.readNext()) != null)
            {
                int id = Integer.parseInt(nextLine[0]);
                String name = nextLine[1];
                String gender = nextLine[2];
                String birthDate = nextLine[3];
                String divisionName = nextLine[4];
                double salary = Double.parseDouble(nextLine[5]);

                if (!divisionsCache.containsKey(divisionName))
                {
                    divisionsCache.put(divisionName, new Division(divisionName));
                }
                Division division = divisionsCache.get(divisionName);

                Person person = new Person(id, name, gender, division, salary, birthDate);
                people.add(person);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return people;
    }
}
