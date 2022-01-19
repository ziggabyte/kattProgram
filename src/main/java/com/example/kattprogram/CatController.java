package com.example.kattprogram;

import com.example.kattprogram.entities.Cat;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/")
@CrossOrigin("*")
@AllArgsConstructor
public class CatController {
    CatService catService;

    @GetMapping
    public List<CatDTO> all() {
        return catService.all().stream()
                .map(cat -> toDTO(cat))
                .collect(Collectors.toList());
    }

    @PostMapping
    public CatDTO create(@RequestBody CreateCat createCat) {
        return toDTO(catService.createCat(
                createCat.getCatName(),
                createCat.getHumanName())
        );
    }

    private CatDTO toDTO(Cat cat) {
        return new CatDTO(
                cat.getId(),
                cat.getName()
        );
    }

    @Value
    @AllArgsConstructor
    static class CreateCat {
        String catName;
        String humanName;
    }

    @Value
    @AllArgsConstructor
    static class CatDTO {
        String id;
        String name;
    }
}
