package com.simple.rest.simpl_rest_app.service;

import com.simple.rest.simpl_rest_app.entity.Message;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MessageService {

    public List<Message> getAllMessages();

    public List<Message> getAllMSG();

    public List<Message> getAllCALL();

    @Transactional
    public Message getMessage(int id);

    public void saveMessage(Message message);

    public void deleteMessage(int id);
}
