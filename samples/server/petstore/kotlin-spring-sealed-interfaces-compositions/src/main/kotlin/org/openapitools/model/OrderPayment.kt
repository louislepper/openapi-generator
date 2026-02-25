package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BankTransferPayment
import org.openapitools.model.CreditCardPayment
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid

/**
 * 
 * @param cardNumber 
 * @param expiryMonth 
 * @param expiryYear 
 * @param iban 
 * @param bic 
 */
data class OrderPayment(

    @get:JsonProperty("cardNumber", required = true) val cardNumber: kotlin.String,

    @get:JsonProperty("expiryMonth", required = true) val expiryMonth: kotlin.Int,

    @get:JsonProperty("expiryYear", required = true) val expiryYear: kotlin.Int,

    @get:JsonProperty("iban", required = true) val iban: kotlin.String,

    @get:JsonProperty("bic", required = true) val bic: kotlin.String
) {

}

