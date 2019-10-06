package com.arash.edu.ticket.rest;

import com.arash.edu.ticket.services.TicketsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RequiredArgsConstructor
@RequestMapping("/ticketapi")
@RestController
public class TicketController {

    private final TicketsService ticketsService;

    @RequestMapping(value = "/tickets/price/{numberOfTickets}", method = RequestMethod.GET)
    public BigDecimal computePrices(@PathVariable int numberOfTickets) {
        return ticketsService.getTicketsPrices(numberOfTickets);
    }
}
