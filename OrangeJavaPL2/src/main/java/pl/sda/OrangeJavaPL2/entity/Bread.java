package pl.sda.OrangeJavaPL2.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "breads")
// @Data (ma w sobie gettery, settery itp)
public class Bread {

    @Id // Required for entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement id with every single object
    Long id;
    String name;
    @Enumerated(EnumType.STRING)
    BreadType breadType;
    @Column(name = "price_in_pln") // Change default name to custom one
    BigDecimal price;

    public Bread(String name, BreadType breadType, BigDecimal price) {
        this.name = name;
        this.breadType = breadType;
        this.price = price;
    }

    public Bread(Long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Bread(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
