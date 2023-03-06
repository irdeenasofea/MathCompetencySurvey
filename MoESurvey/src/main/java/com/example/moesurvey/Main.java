package com.example.moesurvey;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of data: ");
        int numdata = scanner.nextInt();

        Marks marks = new Marks(numdata);
        marks.createData();
        PrincipalName principalName = new PrincipalName("Ahmad", "Kamal");
        Address address = new Address("No 744, Jalan Kemboja,", "09000", "Kulim,", "Kedah");
        School school = new School("Sk Convent",address,principalName,marks);

        school.setNumberParticipants();
        System.out.println(school.toString());
        System.out.printf("Average Score     : %.2f",marks.average());
        System.out.printf("\nStandard Deviation: %.2f",marks.stanDev(marks.average()));
    }
}