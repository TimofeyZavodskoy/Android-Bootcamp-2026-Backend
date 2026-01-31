package ru.sicampus.bootcamp2026.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false,unique = true)
    private String hash_password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String position;

    @Column
    private String photoUrl;

    @OneToMany(mappedBy = "user")
    private List<Invitation>  invitations;

    @OneToMany(mappedBy = "organizer")
    private List<Meeting> organizedMeetings;
}
