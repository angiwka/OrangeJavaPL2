package pl.sda.OrangeJavaPL2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor // encja zawsze wymaga bezargumentowego konstruktora
@AllArgsConstructor
@Table(name = "art")
public class Art {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String author;
    Double price;

    public Art(String name, String author, Double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}
