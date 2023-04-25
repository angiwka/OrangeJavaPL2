package pl.sda.OrangeJavaPL2;

import org.assertj.core.util.Sets;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.sda.OrangeJavaPL2.entity.Bread;
import pl.sda.OrangeJavaPL2.entity.BreadType;

import java.math.BigDecimal;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootTest
class OrangeJavaPl2ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testTest() {
        Set<Bread> breads = Sets.set(
                new Bread("Bułka z budyniem", BreadType.SLODKIE, BigDecimal.valueOf(4.50),
                new Bread("Buła z budyniem", BreadType.SLODKIE, BigDecimal.valueOf(2.50),
                new Bread("Buła z budyniem", BreadType.SLODKIE, BigDecimal.valueOf(1.50),
                new Bread("Buła z budyniem", BreadType.SLODKIE, BigDecimal.valueOf(5.50),
                new Bread("Buła z budyniem", BreadType.SLODKIE, BigDecimal.valueOf(199.50),
                new Bread("Buła z budyniem", BreadType.SLODKIE, BigDecimal.valueOf(41.50),
                new Bread("Buła z budyniem", BreadType.SLODKIE, BigDecimal.valueOf(4.50),
                new Bread("Buła z budyniem", BreadType.SLODKIE, BigDecimal.valueOf(43.50),
                new Bread("Buła z budyniem", BreadType.SLODKIE, BigDecimal.valueOf(46.50),
                new Bread("Buła z budyniem", BreadType.SLODKIE, BigDecimal.valueOf(42.50),
                new Bread("Buła z budyniem", BreadType.SLODKIE, BigDecimal.valueOf(43.50)
        );

        Set<Bread> expensiveBreads = breads
                .stream()
                .map(p -> p.getPrice())
                .filter(p -> p > BigDecimal.valueOf(50))



                .collect(Collectors.toSet());

        System.out.println(expensiveBreads);
    }

    @Test
    void bigDecimalTest() {

        BigDecimal decimal = new BigDecimal(19.122344555);
        BigDecimal bigDecimal = BigDecimal.valueOf(19.122344555);

        System.out.println("---------------new------------");
        System.out.println(decimal);
        System.out.println("--------------valueOf----------");
        System.out.println(bigDecimal);
    }

}


