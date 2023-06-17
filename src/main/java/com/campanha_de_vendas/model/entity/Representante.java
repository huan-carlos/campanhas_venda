package com.campanha_de_vendas.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "campanha")
public class Representante {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @OneToMany(mappedBy = "representante")
    private List<Meta> metaList;
}
