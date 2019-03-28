package com.example.cryptotesttask;


import com.example.cryptotesttask.pojo.Crypto;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CryptocurrencyService {

    String BASE_URL = "https://api.cryptonator.com/api/full/";

    @GET("{coin}-usd")
    Observable<? extends List<Crypto.Market>> getCoinData(@Path("coin") String coin);


}
