package com.omar.dcbot.listeners;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.Channel;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import org.jetbrains.annotations.NotNull;
import com.omar.dcbot.services.GeminiService;

public class EventListener extends ListenerAdapter {

    private final GeminiService geminiservice;

    public EventListener(GeminiService geminiservice){
        this.geminiservice = geminiservice;
    }


    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        if (event.getName().equals("ask")) {
            String question = event.getOption("question").getAsString();

            // Acknowledge the command immediately (Discord requires this)
            event.deferReply().queue();

            // Get AI response
            String aiResponse = geminiservice.askQuestion(question);

            // Send the response
            event.getHook().sendMessage("🤖 **AI Assistant:** " + aiResponse).queue();
        }
    }
}
