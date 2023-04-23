package pl.sda.OrangeJavaPL2.restapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.sda.OrangeJavaPL2.entity.Bread;
import pl.sda.OrangeJavaPL2.repository.BreadRepository;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@RequiredArgsConstructor
public class BreadRestController {
    private final BreadRepository breadRepository;

    // example:    localhost:<port>/api/breads
    @GetMapping
    public List<Bread> getAllBreads()
    {
        return breadRepository.getAllBreads();
    }


@PostMapping
void addBread(@RequestBody Bread bread){ //@RequestBody to map to bread
        breadRepository.addBread(bread);

}

}