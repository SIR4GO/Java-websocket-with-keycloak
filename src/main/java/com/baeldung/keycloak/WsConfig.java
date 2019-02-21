package com.baeldung.keycloak;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver;
import org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketTransportRegistration;

import java.security.Principal;
import java.util.List;

@CrossOrigin(origins = "*")
@Configuration
@EnableWebSocketMessageBroker
public class WsConfig implements WebSocketMessageBrokerConfigurer {

	@CrossOrigin(origins = "*")
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/pair").setAllowedOrigins("http://localhost:4200").addInterceptors(new HttpHandshakeInterceptor()).withSockJS();
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		registry.enableSimpleBroker("/topic" ,"/queue");
		registry.setApplicationDestinationPrefixes("/app");
	}

	@Override
	public void configureWebSocketTransport(WebSocketTransportRegistration webSocketTransportRegistration) {

	}

	@Override
	public void configureClientInboundChannel(ChannelRegistration channelRegistration) {

	}

	@Override
	public void configureClientOutboundChannel(ChannelRegistration channelRegistration) {

	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> list) {

	}

	@Override
	public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> list) {

	}

	@Override
	public boolean configureMessageConverters(List<MessageConverter> list) {
		return false;
	}


}