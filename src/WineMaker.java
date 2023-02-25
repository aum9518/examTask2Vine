import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class WineMaker  implements AddUpable{
    private String wineType;
    private int experience;
    private String address;
    private Wine[] wines;

    public String getWineType() {
        return wineType;
    }

    public void setWineType(String wineType) {
        this.wineType = wineType;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Wine[] getWines() {
        return wines;
    }

    public void setWines(Wine[] wines) {
        this.wines = wines;
    }

    public WineMaker(String wineType, int experience, String address, Wine[] wines) {
        this.wineType = wineType;
        this.experience = experience;
        this.address = address;
        this.wines = wines;
    }

    public WineMaker() {
    }

    @Override
    public Wine addUp( ) {
      /*  Wine wine7 = new Wine("Old wine","Red wine",Country.French,LocalDate.of(1998,1,1));
        wine7.setName("Old wine");
        wine7.setBrand("Red wine");
        wine7.setCountry(Country.French);
        wine7.setDateOfMade(LocalDate.of(1998,1,1));
        Wine[] wines = {wine7};

        return wine7;*/
        return null;
    }

    @Override
    public int countYear() {
        return 0;
    }

    @Override
    public String toString() {
        return "WineMaker{" +
                "wineType='" + wineType + '\'' +
                ", experience=" + experience +
                ", address='" + address + '\'' +
                ", wines=" + Arrays.toString(wines) +
                '}';
    }
}
