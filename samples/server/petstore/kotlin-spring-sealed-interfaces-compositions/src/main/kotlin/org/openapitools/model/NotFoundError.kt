package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GetItemResponse
import org.openapitools.model.GetOrderResponse
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
 * @param resource 
 * @param id 
 */
data class NotFoundError(

    @get:JsonProperty("resource", required = true) val resource: kotlin.String,

    @get:JsonProperty("id", required = true) val id: kotlin.String
) : GetItemResponse, GetOrderResponse {

}

