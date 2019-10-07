package com.arash.edu.coupon.rest;

import com.arash.edu.coupon.api.CouponRestControllerApi;
import com.arash.edu.coupon.api.paths.CouponServicePath;
import com.arash.edu.coupon.model.Coupon;
import com.arash.edu.coupon.repository.CouponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class CouponRestController implements CouponRestControllerApi {

    private final CouponRepository couponRepository;

    @RequestMapping(value = CouponServicePath.COUPON_CREATE, method = RequestMethod.POST)
    public Coupon create(@RequestBody Coupon coupon) {
        couponRepository.save(coupon);
        return coupon;
    }

    public Coupon get(@PathVariable String code) {
        return couponRepository.findByCode(code);
    }
}
