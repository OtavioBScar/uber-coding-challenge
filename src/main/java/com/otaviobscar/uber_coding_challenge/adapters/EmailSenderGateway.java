package com.otaviobscar.uber_coding_challenge.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);
}
