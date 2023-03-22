//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            // здесь нужно вывести результат
            System.out.println("12.09." + year);
            return;
        }

        System.out.println("13.09." + year);
//        int month = 1;
//        int day = 1;
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        String progDate = LocalDate.of(year, month, day).plusDays(255).format(formatter);

//        System.out.println(progDate);
    }

    public static boolean isLeapYear(int year) {
        // здесь нужно определить, является ли переданный год високосным
        if(year % 400 == 0){
            return true;
        } else return year % 4 == 0;
    }
} 