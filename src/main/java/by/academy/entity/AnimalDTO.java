package by.academy.entity;

import lombok.*;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AnimalDTO implements Serializable {
    private Integer id;
    private String name;
    private Double weight;
}

