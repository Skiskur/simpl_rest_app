package com.simple.rest.simpl_rest_app.dao;

import com.simple.rest.simpl_rest_app.entity.Message;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MessageDAOImpl implements MessageDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Message> getAllMessages() {
        Session session = entityManager.unwrap(Session.class);

        Query getAll = session.createQuery("from Message ", Message.class);

        return getAll.getResultList();
    }

    @Override
    public List<Message> getAllMSG() {
        Session session = entityManager.unwrap(Session.class);

        Query getAll = session.createQuery("from Message where message_type = 'MSG'", Message.class);

        return getAll.getResultList();
    }

    @Override
    public List<Message> getAllCALL() {
        Session session = entityManager.unwrap(Session.class);

        Query getAll = session.createQuery("from Message where message_type = 'CALL'", Message.class);

        return getAll.getResultList();
    }

    @Override
    public Message getMessage(int id) {
        Session session = entityManager.unwrap(Session.class);

        return session.get(Message.class, id);
    }

    @Override
    public void saveMessage(Message message) {
        Session session = entityManager.unwrap(Session.class);

        session.saveOrUpdate(message);
    }

    @Override
    public void deleteMessage(int id) {
        Session session = entityManager.unwrap(Session.class);

        Query query = session.createQuery("delete from Message where id=:messageId");
        query.setParameter("messageId", id);
        query.executeUpdate();
    }
}
