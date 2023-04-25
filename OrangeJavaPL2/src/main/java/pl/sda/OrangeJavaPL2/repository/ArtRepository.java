package pl.sda.OrangeJavaPL2.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.sda.OrangeJavaPL2.entity.Art;
import pl.sda.OrangeJavaPL2.entity.Bread;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ArtRepository {

    private final IArtRepository artRepository;

    public List<Art> getAllArt() {
        return artRepository.findAll();
    }

    public void addArt(Art art) {
        artRepository.save(art);
    }

    public Art getArtByName(String name) {
        return artRepository.findByName(name);
    }
}
