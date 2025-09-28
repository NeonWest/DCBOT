package com.omar.dcbot.services;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;


public class GeminiService {
    private final Client client;


    public GeminiService(String geminiapikey) {
        this.client = new Client.Builder().apiKey(geminiapikey).build();
    }

    public String askQuestion(String question) {
        try {
            System.out.println("Sending question to Gemini: " + question);

            GenerateContentResponse response = client.models.generateContent(
                    "gemini-2.5-flash", "Please keep your response under 1500 characters. " +
                    question,
                    null
            );

            String answer = response.text();
            System.out.println("Received response: " + answer);

            return answer;

        } catch (Exception e) {
            System.out.println("Error calling Gemini: " + e.getMessage());
            return "Sorry, I couldn't process your question right now: " + e.getMessage();
        }
    }






}
