package com.capgemini.project.microservice_ticket.controllers;

import com.capgemini.project.microservice_ticket.models.TrainSearch;
import com.capgemini.project.microservice_ticket.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.project.microservice_ticket.models.ConvertSearchDetails;

@RestController
@RequestMapping("/search")
public class Search1Controller {

    @Autowired
    private TicketService t;

    @PostMapping("/searchtrains")
    public ConvertSearchDetails getTrain(@RequestBody TrainSearch ts){
       return  t.getTrain(ts);
    }
}
