package by.academy.servlet.impl;

import by.academy.entity.AnimalDTO;
import by.academy.service.Service;
import by.academy.service.impl.AnimalService;
import by.academy.servlet.Command;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static by.academy.util.Constants.*;

public class UpdateCommand implements Command {

    @Override
    public String execute(HttpServletRequest request) {
        Service<AnimalDTO> service = new AnimalService();
        if (GET.equals(request.getMethod())) {
            int id= Integer.parseInt(request.getParameter(ID));
            AnimalDTO animalDTO = service.selectById(id);

            request.setAttribute(ID, id);
            request.setAttribute(NAME, animalDTO.getName());
            request.setAttribute(WEIGHT, animalDTO.getWeight());

            return UPDATE_JSP;
        } else {
            AnimalDTO animalDTO = AnimalDTO.builder()
                    .id(Integer.valueOf(request.getParameter(ID)))
                    .name(request.getParameter(NAME))
                    .weight(Double.valueOf(request.getParameter(WEIGHT)))
                    .build();
            service.update(animalDTO);

            List<AnimalDTO> list = service.read();
            request.setAttribute(ANIMALS,list);
            return ANIMALS_JSP;
        }
    }
}