package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 */
data class CreditCardPayment(

    @get:JsonProperty("cardNumber", required = true) val cardNumber: kotlin.String,

    @get:JsonProperty("expiryMonth", required = true) val expiryMonth: kotlin.Int,

    @get:JsonProperty("expiryYear", required = true) val expiryYear: kotlin.Int
) {

}

