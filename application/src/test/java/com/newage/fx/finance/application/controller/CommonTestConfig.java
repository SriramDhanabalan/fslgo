package com.newage.fx.finance.application.controller;

import org.mockito.Mockito;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

@TestConfiguration
class CommonTestConfig {

    /*@Bean
    public AccountService accountService() {

        return Mockito.mock(AccountServiceImpl.class);
    }

    @Bean
    public AccountCodeService accountCodeService() {

        return Mockito.mock(AccountCodeServiceImpl.class);
    }*/

    @Bean
    public MessageSource messageSource() {

        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames("classpath:messages/messages");
        messageSource.setUseCodeAsDefaultMessage(true);
        messageSource.setDefaultEncoding(StandardCharsets.UTF_8.displayName());
        messageSource.setCacheSeconds(Math.toIntExact(TimeUnit.DAYS.toSeconds(1)));
        messageSource.setFallbackToSystemLocale(false);
        return messageSource;
    }

    @Bean
    public ModelMapper modelMapper () {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        return modelMapper;
    }
}
