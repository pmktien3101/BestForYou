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
@Table(name = "social_accounts")
public class SocialAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// tăng id
    private Long id;

    @Column(name = "provider", nullable = false, length = 20)
    private String provider;
    @Column(name = "provider_id", length = 50)
    private String providerId;
    @Column(name = "name", length = 100)
    private String name;
    @Column(name = "email", length = 150)
    private String email;
    @ManyToOne
    @JoinColumn(name = "user_id" )
    private User user;
}
