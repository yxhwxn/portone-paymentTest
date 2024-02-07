package test.portone.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PaymentRequest(
        @JsonProperty("imp_uid") String impUid,
        @JsonProperty("merchant_uid") String merchantUid
) {
}
