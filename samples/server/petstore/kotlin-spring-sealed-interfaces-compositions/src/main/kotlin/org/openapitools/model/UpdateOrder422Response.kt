package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BusinessConstraintError
import org.openapitools.model.StateTransitionError
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
 * @param constraint 
 * @param details 
 */
data class UpdateOrder422Response(

    @get:JsonProperty("currentState", required = true) val currentState: kotlin.String,

    @get:JsonProperty("attemptedTransition", required = true) val attemptedTransition: kotlin.String,

    @get:JsonProperty("constraint", required = true) val constraint: kotlin.String,

    @get:JsonProperty("details", required = true) val details: kotlin.String
) {

}

