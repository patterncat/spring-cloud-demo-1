package com.gavin.client.payment;

import com.gavin.domain.payment.Payment;
import com.gavin.model.request.payment.CreatePaymentReqModel;
import com.gavin.model.response.Response;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("payment-service")
public interface PaymentClient {

    @RequestMapping(value = "/payments", method = RequestMethod.POST)
    Response<Payment> createPayment(@RequestBody CreatePaymentReqModel model);
}
