public class Address
{
    private String country;
    private String city;
    private String street;

    public Address(String country, String city, String street)
    {
        this.withCountry(country).withCity(city).withStreet(street);
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public Address withCountry(String country)
    {
        setCountry(country);
        return this;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public Address withCity(String city)
    {
        setCity(city);
        return this;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public Address withStreet(String street)
    {
        setStreet(street);
        return this;
    }
}
