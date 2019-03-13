package com.bagicode.cekongkir.api;

/**
 * Created by Robby Dianputra on 10/31/2017.
 */

import com.bagicode.cekongkir.model.city.ItemCity;
import com.bagicode.cekongkir.model.cost.ItemCost;
import com.bagicode.cekongkir.model.province.ItemProvince;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    // Province
    @GET("province")
    @Headers("key:2c1cf2e4614041e9e929dbee9b2ccfd1")
    Call<ItemProvince> getProvince ();

    // City
    @GET("city")
    @Headers("key:2c1cf2e4614041e9e929dbee9b2ccfd1")
    Call<ItemCity> getCity (@Query("province") String province);

    // Cost
    @FormUrlEncoded
    @POST("cost")
    Call<ItemCost> getCost (@Field("key") String Token,
                            @Field("origin") String origin,
                            @Field("destination") String destination,
                            @Field("weight") String weight,
                            @Field("courier") String courier);

}
