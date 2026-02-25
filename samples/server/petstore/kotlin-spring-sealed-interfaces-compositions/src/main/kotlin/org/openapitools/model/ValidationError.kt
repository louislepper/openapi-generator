package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateUserResponse
import org.openapitools.model.ProcessPaymentResponse
import org.openapitools.model.UpdateOrderResponse
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
 * @param &#x60;field&#x60; 
 * @param message 
 */
data class ValidationError(

    @get:JsonProperty("field", required = true) val `field`: kotlin.String,

    @get:JsonProperty("message", required = true) val message: kotlin.String
) : CreateUserResponse, ProcessPaymentResponse, UpdateOrderResponse {

}

