package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class CombineDto {

    private Long accountNumber;
    private String accountType;
    private String branchAddress;

    private CardsDto cardsDto;
    private LoansDto loansDto;
    private CustomerDto customerDto;

    public CombineDto(CardsDto cardsDto, LoansDto loansDto) {
        this.cardsDto = cardsDto;
        this.loansDto = loansDto;
    }
}
