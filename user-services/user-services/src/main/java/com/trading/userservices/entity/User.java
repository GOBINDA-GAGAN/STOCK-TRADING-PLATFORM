package com.trading.userservices.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false,unique = true)
    private  String email;

    private String password;

    @Column(nullable = false)
    private String   FirstName;

    @Column(nullable = false)
    private String  lastname;

    @Column (nullable = false,precision = 15,scale = 2)
    private BigDecimal walletBalance=BigDecimal.ZERO;

    @Enumerated(EnumType.STRING)
    private  UserStatus status=UserStatus.ACTIVE;

    @CreationTimestamp
    private LocalDateTime createAt;

}
