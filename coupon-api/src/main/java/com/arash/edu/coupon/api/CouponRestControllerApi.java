package com.arash.edu.coupon.api;

import com.arash.edu.coupon.api.paths.CouponServicePath;
import com.arash.edu.coupon.model.Coupon;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = CouponServicePath.COUPON_CONTEXT_ROOT)
public interface CouponRestControllerApi {

    @RequestMapping(value = CouponServicePath.COUPON_GET)
    Coupon get(String code);
}
