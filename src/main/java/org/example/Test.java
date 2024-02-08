package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        int nomineeAge = 22;
        LocalDate birthdate = currentDate.minusYears(nomineeAge);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedBirthdate = birthdate.format(formatter);
        System.out.println("Nominee's birthdate: " + formattedBirthdate);
    }
}
