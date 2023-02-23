package by.academy.service;

import java.util.List;

public interface Service<T> {
    T create(T object);
    List<T> read();
    T update(T object);
    void delete(int id);
    T selectById(int id);
}
