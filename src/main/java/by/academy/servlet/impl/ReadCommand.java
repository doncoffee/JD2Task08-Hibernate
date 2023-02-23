package by.academy.servlet.impl;

import by.academy.entity.AnimalDTO;
import by.academy.service.Service;
import by.academy.service.impl.AnimalService;
import by.academy.servlet.Command;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static by.academy.util.Constants.ANIMALS;
import static by.academy.util.Constants.ANIMALS_JSP;

public class ReadCommand implements Command {

    @Override
    public String execute(HttpServletRequest req) {
        Service<AnimalDTO> service = new AnimalService();

        List<AnimalDTO> animals = service.read();
        req.setAttribute(ANIMALS, animals);

        return ANIMALS_JSP;
    }
}