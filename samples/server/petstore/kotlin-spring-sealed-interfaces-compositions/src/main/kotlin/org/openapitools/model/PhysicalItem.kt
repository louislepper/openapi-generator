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
 * @param sku 
 * @param weight 
 */
data class PhysicalItem(

    @get:JsonProperty("sku", required = true) val sku: kotlin.String,

    @get:JsonProperty("weight", required = true) val weight: java.math.BigDecimal
) {

}

