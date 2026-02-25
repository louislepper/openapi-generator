package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Article
import org.openapitools.model.Video
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
 * @param id 
 * @param title 
 * @param body 
 * @param durationSeconds 
 */
data class Search200Response(

    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @get:JsonProperty("title", required = true) val title: kotlin.String,

    @get:JsonProperty("body", required = true) val body: kotlin.String,

    @get:JsonProperty("durationSeconds", required = true) val durationSeconds: kotlin.Int
) {

}

