package com.omar.dcbot;

import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

import javax.security.auth.login.LoginException;

public class DCBOT {
    private final ShardManager shardManager;

    public DCBOT() throws LoginException {
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.playing("WITH YOUR EMOTIONS"));
        shardManager = builder.build();

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