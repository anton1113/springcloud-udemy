package com.arash.edu.ticket.feign;

import com.arash.edu.price.api.PricesRestControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "price")
public interface PricesRestControllerProxy extends PricesRestControllerApi {
}
