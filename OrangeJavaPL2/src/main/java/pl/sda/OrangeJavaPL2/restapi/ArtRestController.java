package pl.sda.OrangeJavaPL2.restapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.sda.OrangeJavaPL2.entity.Address;
import pl.sda.OrangeJavaPL2.entity.Art;
import pl.sda.OrangeJavaPL2.repository.ArtRepository;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@RequiredArgsConstructor
public class ArtRestController {
    private final ArtRepository artRepository;
    @GetMapping(path ="/arts")
    public List<Art> getAllArt()
    {
        return artRepository.getAllArt();
    }
}

