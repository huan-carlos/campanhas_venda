package com.campanha_de_vendas.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "campanha")
public class Campanha {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private String nome;

    private LocalDate inicio;

    private LocalDate fim;

    @OneToMany(mappedBy = "campanha")
    private List<Meta> metaList;
}
