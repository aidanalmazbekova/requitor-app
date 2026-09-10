package kg.megalab.requitorapp.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void sendOffer(String email) {
        System.out.println("Sent offer to:" + email);
    }

}
