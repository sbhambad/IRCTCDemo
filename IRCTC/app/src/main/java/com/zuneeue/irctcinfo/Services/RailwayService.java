package com.zuneeue.irctcinfo.Services;

import com.zuneeue.irctcinfo.models.arrivals.ArrivalsData;
import com.zuneeue.irctcinfo.models.availability.SeatAvailabilityData;
import com.zuneeue.irctcinfo.models.cancelled.CancelledData;
import com.zuneeue.irctcinfo.models.fare.FareData;
import com.zuneeue.irctcinfo.models.pnr.PnrData;
import com.zuneeue.irctcinfo.models.routes.RouteData;
import com.zuneeue.irctcinfo.models.searchtrains.SearchTrainsData;
import com.zuneeue.irctcinfo.models.trainsdetails.TrainsDetailsData;
import com.zuneeue.irctcinfo.models.trainstatus.LiveStatusData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by pratikgadekar on 2/29/16.
 */
public interface RailwayService {

    @GET("pnr_status/pnr/{pnrNo}/apikey/{apiKey}/")
    Call<PnrData> getPnr(@Path("pnrNo") String pnrNo, @Path("apiKey") String apiKey);

    @GET("live/train/{trainNumber}/doj/{date}/apikey/{apikey}/")
    Call<LiveStatusData> getLiveStatus(@Path("trainNumber") String trainNumber, @Path("date") String date, @Path("apikey") String apikey);

    @GET("route/train/<trainNumber>/apikey/<apiKey>/")
    Call<RouteData> getRoute(@Path("trainNumber") String trainNumber, @Path("apiKey") String apiKey);

    @GET("check_seat/train/{trainNumber}/source/{sourceCode}/dest/{destCode}/date/{doj}/class/{classCode}/quota/{quotaCode}/apikey/{apiKey}/")
    Call<SeatAvailabilityData> getSeatAvailability(@Path("trainNumber") String trainNumber, @Path("sourceCode") String sourceCode, @Path("doj") String doj
            , @Path("classCode") String classCode, @Path("quotaCode") String quotaCode, @Path("apiKey") String apiKey);

    @GET("between/source/{sourceCode}/dest/{destCode}/date/dd-mm/apikey/{apiKey}/")
    Call<SearchTrainsData> getTrainsBetweenStations(@Path("sourceCode") String sourceCode, @Path("destCode") String destCode, @Path("apiKey") String apiKey);

    @GET("name_number/train/{nameNumber}/apikey/{apiKey}/")
    Call<TrainsDetailsData> getTrainNameNumber(@Path("nameNumber") String nameNumber, @Path("apiKey") String apiKey);

    @GET("fare/train/{trainNumber}/source/{souceCode}/dest/{destCode}/age/{age}/quota/{quota}/doj/{doj}/apikey/{apikey}/")
    Call<FareData> getFare(@Path("trainNumber") String trainNumber, @Path("souceCode") String souceCode, @Path("destCode") String destCode,
                           @Path("age") String age, @Path("quota") String quota, @Path("apikey") String apikey);

    @GET("arrivals/station/{stationCode}/hours/{hours}/apikey/{apiKey}/")
    Call<ArrivalsData> getArrivalAtStation(@Path("stationCode") String stationCode, @Path("hours") String hours, @Path("apiKey") String apiKey);


    @GET("cancelled/date/{date}/apikey/{apiKey}/")
    Call<CancelledData> getCancelledTrains(@Path("date") String date, @Path("apiKey") String apiKey);


}
