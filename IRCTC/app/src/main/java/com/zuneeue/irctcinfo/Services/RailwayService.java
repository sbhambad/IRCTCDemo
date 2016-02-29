package com.zuneeue.irctcinfo.Services;

import com.zuneeue.irctcinfo.models.pnr.PnrData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by pratikgadekar on 2/29/16.
 */
public interface RailwayService {

    @GET("pnr_status/pnr/{pnrNo}/apikey/{apiKey}/")
    Call<PnrData> getPnr(@Path("pnrNo") String pnrNo, @Path("apiKey") String apiKey);
}
