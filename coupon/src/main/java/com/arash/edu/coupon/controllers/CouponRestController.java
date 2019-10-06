package com.arash.edu.coupon.controllers;

import com.arash.edu.coupon.model.Coupon;
import com.arash.edu.coupon.repository.CouponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/couponapi")
@RestController
public class CouponRestController {

    private final CouponRepository couponRepository;

    @RequestMapping(value = "/coupons", method = RequestMethod.POST)
    public Coupon create(@RequestBody Coupon coupon) {
        couponRepository.save(coupon);
        return coupon;
    }

    @RequestMapping(value = "/coupons/{code}", method = RequestMethod.GET)
    public Coupon get(@PathVariable String code) {
        return couponRepository.findByCode(code);
    }
}
