import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Wine implements AddUpable{
    private String name;
    private String brand;
    private Country country;
    private LocalDate dateOfMade;

    public Wine(Wine addUp) {
    }

    public Wine(Wine[] addUp) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(LocalDate dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public Wine(String name, String brand, Country country, LocalDate dateOfMade) {
        this.name = name;
        this.brand = brand;
        this.country = country;
        this.dateOfMade = dateOfMade;
    }

    public Wine() {
    }

    @Override
    public Wine addUp() {
        Wine wine7 = new Wine(new Scanner(System.in).nextLine(),new Scanner(System.in).nextLine(),Country.French,LocalDate.of(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt()));
        return wine7;
    }

    @Override
    public int countYear() {
        int year = Period.between(dateOfMade,LocalDate.now()).getYears();
        return year;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", country=" + country +
                ", dateOfMade=" + dateOfMade +
               " Since: "+ countYear()+
                '}';
    }
}
