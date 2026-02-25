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
 * @param transactionId 
 * @param last4 
 */
data class CreditCardResult(

    @get:JsonProperty("transactionId", required = true) val transactionId: kotlin.String,

    @get:JsonProperty("last4", required = true) val last4: kotlin.String
) {

}

