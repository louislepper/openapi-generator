package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OrderItemsInner
import org.openapitools.model.OrderPayment
import org.openapitools.model.GetOrderResponse
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
 * @param id 
 * @param status 
 * @param payment 
 * @param items 
 */
data class Order(

    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @get:JsonProperty("status", required = true) val status: Order.Status,

    @field:Valid
    @get:JsonProperty("payment") val payment: OrderPayment? = null,

    @field:Valid
    @get:JsonProperty("items") val items: kotlin.collections.List<OrderItemsInner>? = null
) : GetOrderResponse, UpdateOrderResponse {

    /**
    * 
    * Values: pending,confirmed,shipped,delivered,cancelled
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        pending("pending"),
        confirmed("confirmed"),
        shipped("shipped"),
        delivered("delivered"),
        cancelled("cancelled");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Order'")
            }
        }
    }

}

