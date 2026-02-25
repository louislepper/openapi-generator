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
 * @param description 
 * @param priceCents 
 * @param tags 
 */
data class ItemDetails(

    @get:JsonProperty("description") val description: kotlin.String? = null,

    @get:JsonProperty("priceCents") val priceCents: kotlin.Long? = null,

    @get:JsonProperty("tags") val tags: kotlin.collections.List<kotlin.String>? = null
) {

}

