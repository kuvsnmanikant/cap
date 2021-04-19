package com.capgemini.project.microservice_ticket.services;

import com.capgemini.project.microservice_ticket.models.Ticket;
import java.util.List;
import com.capgemini.project.microservice_ticket.databases.Ticket1Database;
import com.capgemini.project.microservice_ticket.exceptionhandling.Notfoundexception;
import com.capgemini.project.microservice_ticket.interfaces.Ticket1Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ticket1Service implements Ticket1Interface{
    @Autowired
    private Ticket1Database td;

    public List<Ticket> findAllTickets(){
        return td.findAll();
    }
    public Ticket findByTrainType(String type){
        Ticket lt= td.findByTrainType(type);
        if (lt == null) {
            throw new Notfoundexception(" not exist");
        }
        return lt;
    }
    public String addTraintype(Ticket t){
        Ticket a= td.findByTrainType(t.getTrain_type());
        if (a != null) {
            return "you can't add";
        }
        td.save(t);
        return "success";
    }
    public String deleteTraintype(String t){
        Ticket a= td.findByTrainType(t);
        if (a == null) {
            return "you can't delete";
        }
        td.deleteByTrainType(t);
        return "success";
    }
    public String updateTicket(Ticket p, String s) {
        Ticket a = td.findByTrainType(s);
        if (a == null) {
            throw new Notfoundexception(s + " not exist");
        }
        td.deleteByTrainType(s);
        td.save(p);
        return "success";
    }

}
