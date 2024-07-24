package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@MappedSuperclass
@Data//toString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseModel {
    @Column(name = "created_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updatedAt;

    @PrePersist// tự động cập nhật
    protected void onCreate(){
        createAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }
    @PreUpdate// tự động cập nhật
    protected void onUpdate(){
        updatedAt = LocalDateTime.now();
    }
}
