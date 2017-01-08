package com.learn2crack.loginregistration;

/**
 * Created by Roni on 1/5/2017.
 */
import com.learn2crack.loginregistration.models.ServerRequest;
import com.learn2crack.loginregistration.models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("http://172.16.41.116/learn2crack-login-register/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
