package com.simple.rest.simpl_rest_app.controller;

import com.simple.rest.simpl_rest_app.entity.Message;
import com.simple.rest.simpl_rest_app.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/messages")
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    @GetMapping("/messages/MSG")
    public List<Message> getAllMSG() {
        return messageService.getAllMSG();
    }

    @GetMapping("/messages/CALL")
    public List<Message> getAllCall() {
        return messageService.getAllCALL();
    }

    @GetMapping("/messages/{id}")
    public Message getMessage(@PathVariable int id)  {
        return messageService.getMessage(id);
    }

    @PostMapping("/messages")
    public void saveMessage(@RequestBody Message message) {
        messageService.saveMessage(message);
    }

    @PutMapping("/messages")
    public void updateMessage(@RequestBody Message message) {
        messageService.saveMessage(message);
    }

    @DeleteMapping("/messages/{id}")
    public void deleteMessage(@PathVariable int id) {
        messageService.deleteMessage(id);
    }

}
