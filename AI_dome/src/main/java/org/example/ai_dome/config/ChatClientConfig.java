package org.example.ai_dome.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.deepseek.DeepSeekChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatClientConfig {
    @Bean
    public ChatClient chatClient(DeepSeekChatModel chatModel){
        return ChatClient.builder(chatModel)
                .defaultSystem("请你扮演一名人类 Java 的高级项目工程师")
                .build();
    }
}
