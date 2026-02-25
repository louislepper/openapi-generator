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
 * @param email 
 * @param name 
 */
data class CreateUserRequest(

    @get:Email
    @get:JsonProperty("email", required = true) val email: kotlin.String,

    @get:JsonProperty("name") val name: kotlin.String? = null
) {

}

