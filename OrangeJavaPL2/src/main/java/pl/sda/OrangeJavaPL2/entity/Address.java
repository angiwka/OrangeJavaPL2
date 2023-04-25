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
    @Transient // umieszcza sie nad polem; to pole jest potrzebne do kodu ale nie jest potrzebne zeby zapisywac to w bazie danych
    Long number;
    String postalCode;
    String country;

    public Address(String name, Long number, String postalCode, String country) {
        this.name = name;
        this.number = number;
        this.postalCode = postalCode;
        this.country = country;
    }
}