package com.example.mvpjingdong.net;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiService {
    @GET
    Observable<ResponseBody>getData(@Url String surl);
}
