package pl.sda.OrangeJavaPL2.dataInitializer;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.OrangeJavaPL2.entity.Art;
import pl.sda.OrangeJavaPL2.entity.Bread;
import pl.sda.OrangeJavaPL2.repository.ArtRepository;
import pl.sda.OrangeJavaPL2.repository.BreadRepository;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class ArtInitializer {

    private final ArtRepository artRepository;
    @PostConstruct
    public void initArt(){
        Art art = new Art("Sloneczniki", "Van Gogh", 500000.00);
        Art art1 = new Art("Mona Lisa", "DaVinci", 1000000.00);


        artRepository.addArt(art);
        artRepository.addArt(art1);

    }
}
