import java.io.FilterOutputStream;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


    /*Ооп принциптерин колдонуп, Вино классын Сүрөттөңүз
    Класс кандай поля жана методдорду талап кылат:
            1. Вино түрү жөнүндө маалыматты сактоо: аталышы, бренди, өлкөсү, төгүлгөн датасы (класс убакыт классын тузуу) виного канча жыл болгонун  эсептөө
    Жана Винодел классын тузунуз, ал жөнүндө маалымат- ал кандай вино  кылат, эмгек стажы, жумуш дареги
2. Консолдон жаңы вино кошуу методун тузунуз (интерфейс)
3.Сиздин класстын натыйжалуулугун көрсөткөн жардамчы классты өзүнчө иштеп чыгыңыз.Main class
    Анда керектүү объектилерди түзүп, виноделге вино массивин дайындаңыз, массив ага ошол винолордун таандык экендигин билдирет
                    Кошуу методун колдонуп жаны вино кошуп, вино тизмесине (массивине)кошуңуз*/
        Wine wine1 = new Wine("Legend","Merlo",Country.French, LocalDate.of(1940,1,1));
        Wine wine2 = new Wine("White","Bordeaux",Country.USA, LocalDate.of(1970,1,1));
        Wine wine3 = new Wine("Black","Marchesi Antinori ",Country.Germany, LocalDate.of(1900,1,1));
        Wine wine4 = new Wine("life","Screaming Eagle",Country.Russia, LocalDate.of(1990,1,1));
        Wine wine5 = new Wine("Extra","Penfolds",Country.French, LocalDate.of(2000,1,1));
        //Wine wine7 = new Wine();
        Wine[] wines = {wine1,wine2,wine3,wine4,wine5,new Wine().addUp()};

       // System.out.println( new Wine().addUp());

        WineMaker wineMaker1 = new WineMaker("White",5,"st River",wines);
        System.out.println(wineMaker1);

    }
}