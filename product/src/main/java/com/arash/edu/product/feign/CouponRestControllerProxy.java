package com.arash.edu.product.feign;

import com.arash.edu.coupon.api.CouponRestControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "coupon")
public interface CouponRestControllerProxy extends CouponRestControllerApi {
}
