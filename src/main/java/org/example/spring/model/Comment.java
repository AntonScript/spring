package org.example.spring.model;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private Integer estimation;

    @ManyToOne
    @JoinColumn(name = "comments")
    private Place place;

}
