package test.portone.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentRequestDto {

    @JsonProperty
    private String impUid;

    @JsonProperty
    private String merchantUid;
}
