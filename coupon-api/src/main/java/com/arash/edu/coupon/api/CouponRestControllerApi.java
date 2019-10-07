package com.arash.edu.coupon.api;

import com.arash.edu.coupon.api.paths.CouponServicePath;
import com.arash.edu.coupon.model.Coupon;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/couponapi", produces = MediaType.APPLICATION_JSON_VALUE)
public interface CouponRestControllerApi {

    @RequestMapping(value = CouponServicePath.COUPON_CREATE, method = RequestMethod.POST)
    Coupon create(Coupon coupon);

    @RequestMapping(value = CouponServicePath.COUPON_GET, method = RequestMethod.GET)
    Coupon get(String code);
}
