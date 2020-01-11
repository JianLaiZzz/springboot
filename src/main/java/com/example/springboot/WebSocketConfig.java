package com.example.springboot;

import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @author: zhw
 * @createDate: 2020/1/11
 */
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer
{

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry)
	{

	}
}
