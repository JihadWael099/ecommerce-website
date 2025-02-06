package com.ecommerce.ecommerce.model;
import lombok.Data;

@Data
public class BankDetails {

    private String accountNumber;
    private String accountHolderName;

    /// if the account in real or not
    private String ifIbanCode;
}
