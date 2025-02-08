package com.ecommerce.ecommerce.model;


import com.ecommerce.ecommerce.domain.PaymentMethod;
import com.ecommerce.ecommerce.domain.PaymentOrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PaymentOrder {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long amount;

    private PaymentOrderStatus status = PaymentOrderStatus.PENDING;

    private PaymentMethod paymentMethod;

    private String paymentLinkId;

    @ManyToOne
    private User user ;

    @OneToMany
    private Set<Order> orders=new HashSet<>();
}
