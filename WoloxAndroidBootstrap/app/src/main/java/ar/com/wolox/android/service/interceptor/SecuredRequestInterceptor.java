package ar.com.wolox.android.service.interceptor;

import okhttp3.Request;

public class SecuredRequestInterceptor extends ApiRestInterceptor {

    public static final String SESSION_TOKEN_HEADER = "Authorization";

    public void addHeaders(Request.Builder requestBuilder) {
        String token = "holis"; // AccessUtils.getSessionToken()
        if (token == null) return;
        requestBuilder.addHeader(SESSION_TOKEN_HEADER, token);
    }
}