package com.eastbytes.accounts.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "AccountNumber cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "Customer ID cannot be null or empty")
    private String accountType;

    @NotEmpty(message = "Branch address cannot be null or empty")
    private String branchAddress;

}
