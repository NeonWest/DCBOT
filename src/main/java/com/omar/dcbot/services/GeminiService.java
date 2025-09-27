package com.omar.dcbot.services;

public class GeminiService {
    private String apikey;
    public GeminiService(String apikey){
        this.apikey = apikey;
    }
    public String askQuestion(String question){
        return "Hello, You asked: " +question;
    }
}
