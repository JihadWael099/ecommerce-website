package com.ecommerce.ecommerce.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class VerificationCode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String otp;

    private String email;

    @OneToOne
    private Seller seller;

    @OneToOne
    private  User user;
}
