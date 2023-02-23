package by.academy.util.impl;

import by.academy.entity.Animal;
import by.academy.entity.AnimalDTO;
import by.academy.util.Mapper;

public class AnimalMapper implements Mapper<Animal, AnimalDTO> {
    @Override
    public Animal mapToEntity(AnimalDTO animalDTO) {
        return Animal.builder().id(animalDTO.getId())
                .name(animalDTO.getName())
                .weight(animalDTO.getWeight())
                .build();
    }

    @Override
    public AnimalDTO mapToDTO(Animal animal) {
        return AnimalDTO.builder().id(animal.getId())
                .name(animal.getName())
                .weight(animal.getWeight())
                .build();
    }
}
