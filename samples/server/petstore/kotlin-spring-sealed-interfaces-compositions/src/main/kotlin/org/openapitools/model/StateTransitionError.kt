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
 * @param currentState 
 * @param attemptedTransition 
 */
data class StateTransitionError(

    @get:JsonProperty("currentState", required = true) val currentState: kotlin.String,

    @get:JsonProperty("attemptedTransition", required = true) val attemptedTransition: kotlin.String
) {

}

