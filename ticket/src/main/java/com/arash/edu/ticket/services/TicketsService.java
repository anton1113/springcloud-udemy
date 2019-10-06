package com.arash.edu.ticket.services;

import com.arash.edu.price.model.Price;
import com.arash.edu.ticket.feign.PricesRestControllerProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Service
public class TicketsService {

    private final PricesRestControllerProxy pricesRestControllerProxy;

    public BigDecimal getTicketsPrices(int ticketsCount) {
        Price price = pricesRestControllerProxy.fetch();
        return price.getPrice().multiply(new BigDecimal(ticketsCount));
    }
}
