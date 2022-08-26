package com.simple.rest.simpl_rest_app.service;

import com.simple.rest.simpl_rest_app.dao.MessageDAO;
import com.simple.rest.simpl_rest_app.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    private MessageDAO messageDAO;

    @Override
    @Transactional
    public List<Message> getAllMessages() {
        return messageDAO.getAllMessages();
    }

    @Override
    @Transactional
    public List<Message> getAllMSG() {
        return messageDAO.getAllMSG();
    }

    @Override
    @Transactional
    public List<Message> getAllCALL() {
        return messageDAO.getAllCALL();
    }

    @Override
    @Transactional
    public Message getMessage(int id) {
        return messageDAO.getMessage(id);
    }

    @Override
    @Transactional
    public void saveMessage(Message message) {
        messageDAO.saveMessage(message);
    }

    @Override
    @Transactional
    public void deleteMessage(int id) {
        messageDAO.deleteMessage(id);
    }
}
