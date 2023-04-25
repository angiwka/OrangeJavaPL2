package pl.sda.OrangeJavaPL2.entity;

import javax.persistence.Embeddable;

@Embeddable //pola beda przemappowane na nazwe kolumn w bazie danych
public class Owner {

    String firstName;
    String lastName;
    int age;
}
