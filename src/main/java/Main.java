import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private static final String FILE_PATH = "/Users/melpomene/JsonParser/src/main/resources/persons.json";

    public static void main(String[] args)
    {
        Person pegah = new Person().withName("Fraçoise")
                .withLastName("Noé")
                .withAge(30)
                .withJob("Architect")
                .withLanguages(Arrays.asList("English", "French"))
                .withAddresses(Arrays.asList(new Address("France", "Paris", "St. Laurent"),
                        new Address("USA", "Lansig", "Maple Lane")));

        String json = new Gson().toJson(pegah);
        List<Person> newList = loadFromJson();
        newList.add(pegah);
        Persons persons = new Persons();
        persons.setPersons(newList);
        System.out.println(new Gson().toJson(persons));
        try
        {
            Files.write(Paths.get(FILE_PATH), json.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e)
        {
            //exception handling left as an exercise for the reader
        }

    }

    private static List<String> readFile()
    {
        List<String> persons = new ArrayList<>();
        try
        {
            File myObj = new File(FILE_PATH);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                persons.add(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return persons;
    }

    private static List<Person> loadFromJson()
    {
        String inputJson = String.join("", readFile());
        List<Person> persons = new Gson().fromJson(inputJson, Persons.class).getPersons();

        persons.stream()
                .filter(person -> person.getAge() == 30)
                .map(Person::getAddresses)
                .forEach(list -> list.forEach(address -> System.out.println(address.getStreet())));
        return persons;
    }
}
