package by.academy.dao.impl;

import by.academy.entity.Animal;

public abstract class AnimalDAO extends DAOImpl<Animal>{

    public AnimalDAO() {
        super(Animal.class);
    }
}
