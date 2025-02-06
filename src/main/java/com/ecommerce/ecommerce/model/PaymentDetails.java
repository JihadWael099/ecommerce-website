package com.ecommerce.ecommerce.model;

import com.ecommerce.ecommerce.domain.PaymentStatus;
import lombok.Data;

@Data
public class PaymentDetails {

    private String paymentId;
    private String paymentLinkId;
    private String paymentLinkReferenceId;
    private String paymentLinkStatus;
    private String paymentIdZWSP;
    private PaymentStatus status;
}
