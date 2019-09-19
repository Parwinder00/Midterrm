package com.example.midterrm;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

   /* @GET("Vy2abloQD")
    Call<List<Pokemon>> getAllPokemon();
*/
    @GET("3534")
    Call<Montreal> getWeather();
}
