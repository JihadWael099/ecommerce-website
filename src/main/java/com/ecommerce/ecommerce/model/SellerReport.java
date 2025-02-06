package com.ecommerce.ecommerce.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SellerReport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    private Seller seller;
    private long totalEarnings=0L;
    private long totalSales=0L;
    private long totalRefunds=0L;
    private long totalTax=0L;
    private long netEarnings=0L;
    private Integer totalOrders=0;
    private Integer canceledOrders=0;
    private Integer totalTransactions=0;




}
