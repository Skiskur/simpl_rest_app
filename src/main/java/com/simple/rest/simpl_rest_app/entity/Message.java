package com.simple.rest.simpl_rest_app.entity;

import javax.persistence.*;

@Entity
@Table(name="messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "message_type")
    private String message_type;

    @Column(name = "timestamp")
    private String timestamp;

    @Column(name = "origin")
    private String origin;

    @Column(name = "destination")
    private String destination;

    @Column(name = "status_code")
    private String status_code;

    @Column(name = "status_description")
    private String status_description;

    @Column(name = "message_content")
    private String message_content;

    @Column(name = "message_status")
    private String message_status;

    @Column(name = "duration")
    private int duration;

    public Message() {
    }

    // for type CALL
    public Message(String message_type, String timestamp, String origin, String destination, String status_code, String status_description, int duration) {
        this.message_type = message_type;
        this.timestamp = timestamp;
        this.origin = origin;
        this.destination = destination;
        this.status_code = status_code;
        this.status_description = status_description;
        this.duration = duration;
    }

    // for type MSG
    public Message(String message_type, String timestamp, String origin, String destination, String message_content, String message_status) {
        this.message_type = message_type;
        this.timestamp = timestamp;
        this.origin = origin;
        this.destination = destination;
        this.message_content = message_content;
        this.message_status = message_status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage_type() {
        return message_type;
    }

    public void setMessage_type(String message_type) {
        this.message_type = message_type;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public String getStatus_description() {
        return status_description;
    }

    public void setStatus_description(String status_description) {
        this.status_description = status_description;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }

    public String getMessage_status() {
        return message_status;
    }

    public void setMessage_status(String message_status) {
        this.message_status = message_status;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
