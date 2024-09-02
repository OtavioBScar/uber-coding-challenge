package com.otaviobscar.uber_coding_challenge.core;

public interface EmailSenderUseCase {

    void sendEmail(String to, String subject, String body);
}
