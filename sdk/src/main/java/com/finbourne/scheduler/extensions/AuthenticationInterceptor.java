package com.finbourne.scheduler.extensions;

import java.io.IOException;

import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;
import com.finbourne.scheduler.extensions.auth.RefreshingTokenProvider;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AuthenticationInterceptor implements Interceptor {
    private RefreshingTokenProvider tokenProvider;

    public AuthenticationInterceptor(RefreshingTokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        try {
            Request request = chain.request()
                    .newBuilder()
                    .header("Authorization", "Bearer " + this.tokenProvider.get().getAccessToken())
                    .build();
            return chain.proceed(request);
        } catch (FinbourneTokenException e) {
            throw new IOException(e);
        }
    }

}
