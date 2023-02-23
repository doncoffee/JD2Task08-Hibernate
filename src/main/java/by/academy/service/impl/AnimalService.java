package by.academy.service.impl;

import by.academy.dao.DAO;
import by.academy.dao.impl.AnimalDAOImpl;
import by.academy.entity.Animal;
import by.academy.entity.AnimalDTO;
import by.academy.service.Service;
import by.academy.util.Mapper;
import by.academy.util.impl.AnimalMapper;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalService implements Service<AnimalDTO> {
    private Mapper<Animal, AnimalDTO> mapper = new AnimalMapper();
    private final DAO<Animal> dao = new AnimalDAOImpl();
    @Override
    public AnimalDTO create(AnimalDTO animalDTO) {
        Animal animal = dao.create(mapper.mapToEntity(animalDTO));
        return mapper.mapToDTO(animal);
    }

    @Override
    public List<AnimalDTO> read() {
        return dao.read()
                .stream()
                .map(map ->mapper.mapToDTO(map))
                .collect(Collectors.toList());
    }

    @Override
    public AnimalDTO update(AnimalDTO animalDTO) {
        Animal animal = dao.update(mapper.mapToEntity(animalDTO));
        return mapper.mapToDTO(animal);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public AnimalDTO selectById(int id) {
        Animal animal = dao.selectById(id);
        return mapper.mapToDTO(animal);
    }
}
