package com.omar.dcbot;

import com.omar.dcbot.listeners.EventListener;
import com.omar.dcbot.services.GeminiService;
import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.interactions.commands.*;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;


public class DCBOT {
    private final Dotenv config;
    private final ShardManager shardManager;

    public DCBOT() {
        config = Dotenv.configure().load();


        String token = config.get("TOKEN"); //Discord bot token
        String geminiapikey = config.get("GEMINI_KEY");

        GeminiService geminiService = new GeminiService(geminiapikey);

        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder
                .createDefault(token)
                .enableIntents(GatewayIntent.MESSAGE_CONTENT);

        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.playing("Hayallerimle"));
        shardManager = builder.build();

        shardManager.getShards().get(0).updateCommands().addCommands(
                Commands.slash("ask", "Ask the AI assistant a question")
                        .addOption(OptionType.STRING, "question", "Your question for the AI", true)
        ).queue();

        shardManager.addEventListener(new EventListener(geminiService) );
    }

    public Dotenv getConfig() {
        return config;
    }

    public ShardManager getShardManager(){
        return shardManager;
    }

    public static void main(String[] args){
        DCBOT bot = new DCBOT();
    }
}