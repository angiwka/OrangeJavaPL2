package pl.sda.OrangeJavaPL2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.OrangeJavaPL2.entity.Art;


public interface IArtRepository extends JpaRepository<Art, Long> {
    Art findByName(String name);
}

