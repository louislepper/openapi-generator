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
 * @param amountCents 
 * @param currency 
 */
data class PaymentRequest(

    @get:JsonProperty("amountCents", required = true) val amountCents: kotlin.Long,

    @get:JsonProperty("currency", required = true) val currency: kotlin.String
) {

}

