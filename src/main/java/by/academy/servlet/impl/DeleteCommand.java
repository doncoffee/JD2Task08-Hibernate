package by.academy.servlet.impl;

import by.academy.entity.AnimalDTO;
import by.academy.service.Service;
import by.academy.service.impl.AnimalService;
import by.academy.servlet.Command;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static by.academy.util.Constants.*;

public class DeleteCommand implements Command {

    @Override
    public String execute(HttpServletRequest request) {
        Service<AnimalDTO> service = new AnimalService();
        int id = Integer.parseInt(request.getParameter(ID));
        service.delete(id);

        List<AnimalDTO> list = service.read();
        request.setAttribute(ANIMALS,list);
        return ANIMALS_JSP;
    }
}