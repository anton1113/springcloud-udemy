package com.arash.edu.coupon.repository;

import com.arash.edu.coupon.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

    Coupon findByCode(String code);
}
