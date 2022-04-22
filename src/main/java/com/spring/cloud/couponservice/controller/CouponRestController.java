package com.spring.cloud.couponservice.controller;

import com.spring.cloud.couponservice.model.Coupon;
import com.spring.cloud.couponservice.repository.CouponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coupon-api")
public class CouponRestController {

    @Autowired
    CouponRepo couponRepo;

    @PostMapping("/coupons")
    //@RequestMapping(value = "/coupons", method = RequestMethod.POST)
    public Coupon createCoupon(Coupon coupon) {

        return couponRepo.save(coupon);
    }

    @GetMapping("/coupons/{code}")
    public Coupon getCoupon(@PathVariable String code) {

        return couponRepo.findByCode(code);
    }

}
