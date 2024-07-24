package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data//toString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tokens")
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// tăng id
    private Long id;

    @Column(name = "token", length = 255)
    private String token;
    @Column(name = "token_type", length = 50)
    private String tokenType;
    @Column(name = "expiration_date")
    private LocalDateTime expirationDate;
    private boolean revoked;// đã bị hủy chưa
    private boolean expired;// đã hết hạn chưa
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
