package com.mogobiz.mirakl

import com.mogobiz.mirakl.CommonModel.AdditionalFieldType
import com.mogobiz.mirakl.PaymentModel.PaymentStatus
import com.mogobiz.mirakl.OrderModel.{PaymentWorkflow,OrderState, OrderLineState, RefundState}
import com.mogobiz.mirakl.ShippingModel.ShippingFeeErrorCode
import org.json4s.DefaultFormats
import org.json4s.ext.EnumSerializer
import spray.httpx.Json4sJacksonSupport

/**
  * Created by yoannbaudy on 05/09/2016.
  */
object JsonSupport extends Json4sJacksonSupport {

  val miraklJsonFormat = DefaultFormats +
    new EnumSerializer(AdditionalFieldType) +
    new EnumSerializer(PaymentWorkflow) +
    new EnumSerializer(PaymentStatus) +
    new EnumSerializer(OrderState) +
    new EnumSerializer(OrderLineState) +
    new EnumSerializer(RefundState) +
    new EnumSerializer(ShippingFeeErrorCode)

  implicit val json4sJacksonFormats = miraklJsonFormat
}