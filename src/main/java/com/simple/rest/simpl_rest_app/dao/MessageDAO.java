package com.simple.rest.simpl_rest_app.dao;

import com.simple.rest.simpl_rest_app.entity.Message;

import java.util.List;

public interface MessageDAO {

    public List<Message> getAllMessages();

    public List<Message> getAllMSG();

    public List<Message> getAllCALL();

    public Message getMessage(int id);

    public void saveMessage(Message message);

    public void deleteMessage(int id);
}
