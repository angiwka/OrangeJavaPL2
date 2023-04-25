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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @Enumerated(EnumType.STRING)
    BreadType breadType;
    @Column(name = "price_in_pln")
    BigDecimal price;

    public Bread(String name, BreadType breadType, BigDecimal price) {
        this.name = name;
        this.breadType = breadType;
        this.price = price;
    }
}
