package com.arash.edu.price.api;

import com.arash.edu.price.model.Price;
import com.arash.edu.price.paths.PriceServicePath;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = PriceServicePath.PRICE_CONTEXT_ROOT)
public interface PricesRestControllerApi {

    @RequestMapping(value = PriceServicePath.PRICE_CREATE, method = RequestMethod.POST)
    Price create(Price price);

    @RequestMapping(value = PriceServicePath.PRICE_FETCH, method = RequestMethod.GET)
    Price fetch();
}
