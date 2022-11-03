package com.example.rvj;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {
    // Methode to call all News
    @GET
    Call<NewsModal> getAllNews(@Url String url);

    // Methode to call News by catagory
    @GET
    Call<NewsModal>getNewsByCategory(@Url String url);
}
