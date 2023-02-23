package by.academy.servlet.impl;



import by.academy.entity.AnimalDTO;
import by.academy.service.Service;
import by.academy.service.impl.AnimalService;
import by.academy.servlet.Command;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static by.academy.util.Constants.*;

public class CreateCommand implements Command {

    @Override
    public String execute(HttpServletRequest request) {
        Service<AnimalDTO> service = new AnimalService();
        if (GET.equals(request.getMethod())) {
            return CREATE_JSP;
        } else {
            AnimalDTO animalDTO = AnimalDTO.builder()
                    .id(null)
                    .name(request.getParameter(NAME))
                    .weight(Double.valueOf(request.getParameter(WEIGHT)))
                    .build();
            service.create(animalDTO);

            List<AnimalDTO> list = service.read();
            request.setAttribute(ANIMALS,list);
            return ANIMALS_JSP;
        }
    }
}