package com.eastbytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
    name = "Accounts",
    description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "AccountNumber cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    @Schema(
        description = "Account Number of Eazy Bank account", example = "3454433243"
    )
    private Long accountNumber;

    @NotEmpty(message = "Customer ID cannot be null or empty")
    @Schema(
        description = "Account type of Eazy Bank account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "Branch address cannot be null or empty")
    @Schema(
        description = "Eazy Bank branch address", example = "123 NewYork"
    )
    private String branchAddress;

}
