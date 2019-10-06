package com.arash.edu.price.rest;

import com.arash.edu.price.repository.PriceRepository;
import com.arash.edu.price.api.PricesRestControllerApi;
import com.arash.edu.price.model.Price;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PriceRestController implements PricesRestControllerApi {

    private final PriceRepository priceRepository;

    public Price create(@RequestBody Price price) {
        return priceRepository.save(price);
    }

    public Price fetch() {
        return priceRepository.findAll().get(0);
    }
}
