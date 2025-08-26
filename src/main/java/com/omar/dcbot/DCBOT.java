package com.omar.dcbot;

import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

import javax.security.auth.login.LoginException;

public class DCBOT {
    private final Dotenv config;
    private final ShardManager shardManager;

    public DCBOT() throws LoginException {
        config = Dotenv.configure().load();


        String token = config.get("TOKEN"); //Discord bot token
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.playing("Hayallerimle"));
        shardManager = builder.build();

    }


    public Dotenv getConfig() {
        return config;
    }

    public ShardManager getShardManager(){
        return shardManager;
    }

    public static void main(String[] args){
        try{
            DCBOT bot = new DCBOT();
        } catch (LoginException e){
            System.out.println("ERROR PROVIDED TOKEN IS INVALID!");
        }
    }
}