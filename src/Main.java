import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country country = new Country("Russian", 1430000000, 17100000, "Русский язык");
        Country country1 = new Country("USA", 331000000, 9834000, "English");
        Country country2 = new Country("China", 15000000, 9597000, "Путунхуа");
        Country country3 = new Country("Kyrgyzstan", 7000000, 198000, "Кыргызский");
        Country country4 = new Country("Kazakstan", 19000000, 2725000, "Казакский");
        Country country5 = new Country("Canada", 38000000, 9985000, "French and English");

        Country[] array = {country, country1, country2, country3, country4, country5};

        while (true) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 1. Max and Min. 2.Find country by name. 3.Show all countries.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" Enter a number :");
            int number = new Scanner(System.in).nextInt();
            if (number == 1) {
                getMaxMinArea(array);
            } else if (number == 2) {
                System.out.println(" Country name : ");
                findByName(scanner.nextLine(), array);
            } else if (number == 3) {
                findOll(array);
            } else {
                System.out.println("");
            }
        }
    }

    public static void getMaxMinArea(Country[] array) {
        long max = array[0].getArea();
        long min = array[0].getArea();
        for (Country country : array) {
            if (max < country.getArea()) {
                max = country.getArea();
            } else if (min > country.getArea()) {
                min = country.getArea();
            }
        }
        for (Country country : array) {
            if (max == country.getArea()){
                System.out.println("max = " + country);
                System.out.println("-----------------------------------------------------------------");
            }

            else if (min == country.getArea()) {
                System.out.println("min =" + country);
                System.out.println( );
            }
        }

    }

    public static void findByName(String name, Country[] array) {
        for (Country country : array) {
            if (Objects.equals(name, country.getName())) {
                System.out.println(country);
            }
        }
    }

    public static void findOll(Country[] array) {
        for (Country country : array) {
            System.out.println(country);
        }
    }
}