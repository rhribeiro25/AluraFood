package br.com.alurafood.payments.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("orders-ms")
public interface OrderClient {
    @RequestMapping(method = RequestMethod.PUT, value = "/orders/{id}/paid")
    void updatePayments(@PathVariable Long id);
}
