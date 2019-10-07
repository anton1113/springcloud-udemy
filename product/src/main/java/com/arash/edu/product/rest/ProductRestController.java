package com.arash.edu.product.rest;

import com.arash.edu.coupon.model.Coupon;
import com.arash.edu.product.feign.CouponRestControllerProxy;
import com.arash.edu.product.model.Product;
import com.arash.edu.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/productapi")
public class ProductRestController {

    private final ProductRepository productRepository;
    private final CouponRestControllerProxy couponRestControllerProxy;

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        Coupon coupon = couponRestControllerProxy.get(product.getCouponCode());
        product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
        return productRepository.save(product);
    }
}
