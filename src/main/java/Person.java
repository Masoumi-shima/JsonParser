import java.util.List;

public class Person
{
    private String name;
    private String lastName;
    private int age;
    private String job;
    private List<String> languages;
    private List<Address> addresses;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Person withName(String name)
    {
        setName(name);
        return this;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Person withLastName(String lastName)
    {
        setLastName(lastName);
        return this;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Person withAge(int age)
    {
        setAge(age);
        return this;
    }

    public String getJob()
    {
        return job;
    }

    public void setJob(String job)
    {
        this.job = job;
    }

    public Person withJob(String job)
    {
        setJob(job);
        return this;
    }

    public List<String> getLanguages()
    {
        return languages;
    }

    public void setLanguages(List<String> languages)
    {
        this.languages = languages;
    }

    public Person withLanguages(List<String> languages)
    {
        setLanguages(languages);
        return this;
    }

    public List<Address> getAddresses()
    {
        return addresses;
    }

    public void setAddresses(List<Address> addresses)
    {
        this.addresses = addresses;
    }

    public Person withAddresses(List<Address> addresses)
    {
        setAddresses(addresses);
        return this;
    }
}
