package com.newage.fx.finance.service.client;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
public class FeignClientInterceptor implements RequestInterceptor {

    private static final String AUTHORIZATION_HEADER = "Authorization";

    public static String getBearerTokenHeader() {
        if(((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()) != null){
            String authorize = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getHeader("Authorization");
            return authorize;
        }
        return "";
    }

    public static String getSaasid() {
        if(((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()) != null){
            String saasid = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getHeader("saasid");
            return saasid;
        }
        return "";
    }

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header(AUTHORIZATION_HEADER, getBearerTokenHeader());
        requestTemplate.header("saasid", getSaasid());
    }
}