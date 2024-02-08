package com.example.construindoprimeiroservico;

import org.pedro.dto.FuncionarioDTO;
import org.pedro.entity.Animal;
import org.pedro.entity.Funcionario;
import org.pedro.repository.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    private AnimalRepository animalRepository;

    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping
    private List<Animal> findAll() {
        return animalRepository.findAll();
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted() {
        return animalRepository.findNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdopted() {
        return animalRepository.findAdopted();
    }

    @GetMapping("/animais-funcionarios")
    private List<FuncionarioDTO> findAnimaisPorFuncionario() {
        return animalRepository.obterFuncionariosComQuantidadeDeAnimais();
    }
}