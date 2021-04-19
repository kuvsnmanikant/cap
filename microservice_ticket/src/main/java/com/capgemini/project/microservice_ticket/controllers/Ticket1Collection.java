package com.capgemini.project.microservice_ticket.controllers;

import com.capgemini.project.microservice_ticket.services.Ticket1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.capgemini.project.microservice_ticket.models.Ticket;

@RestController
@RequestMapping("/ticket")
public class Ticket1Collection {

    @Autowired
    private Ticket1Service ts;

    @GetMapping("/allticket")
    public List<Ticket> findAllTickets() {
        return ts.findAllTickets();
    }

    @GetMapping("/tickettype/{type}")
    public Ticket findByTrainType(@PathVariable String type) {
        return ts.findByTrainType(type);
    }

    @PostMapping("/addtickettype")
    public String addTraintype(@RequestBody Ticket t) {
        return ts.addTraintype(t);
    }

    @PutMapping("/updateticket/{s}")
    public String updateTicket(Ticket p, String s) {
        return ts.updateTicket(p, s);
    }
}
