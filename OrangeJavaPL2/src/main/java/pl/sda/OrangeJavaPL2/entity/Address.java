package pl.sda.OrangeJavaPL2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @Transient // to not include this field in DB schema
    String number;
    String postalCode;
    String country;

    public Address(String name, String number, String postalCode, String country) {
        this.name = name;
        this.number = number;
        this.postalCode = postalCode;
        this.country = country;
    }
}