package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateUserResponse
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
 * @param reason 
 * @param conflictingId 
 */
data class ConflictError(

    @get:JsonProperty("reason", required = true) val reason: kotlin.String,

    @get:JsonProperty("conflictingId", required = true) val conflictingId: kotlin.String
) : CreateUserResponse {

}

