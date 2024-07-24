package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data//toString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// tăng id
    private Long id;

    @Column(name = "name", nullable = false) // name trong csdl ko đc null
    private String name;
}
