
package com.zuneeue.irctcinfo.models.fare;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FareData {

    @SerializedName("response_code")
    @Expose
    private int responseCode;
    @SerializedName("train")
    @Expose
    private Train train;
    @SerializedName("from")
    @Expose
    private From from;
    @SerializedName("quota")
    @Expose
    private Quota quota;
    @SerializedName("to")
    @Expose
    private To to;
    @SerializedName("fare")
    @Expose
    private List<Fare> fare = new ArrayList<Fare>();

    /**
     * 
     * @return
     *     The responseCode
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * 
     * @param responseCode
     *     The response_code
     */
    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * 
     * @return
     *     The train
     */
    public Train getTrain() {
        return train;
    }

    /**
     * 
     * @param train
     *     The train
     */
    public void setTrain(Train train) {
        this.train = train;
    }

    /**
     * 
     * @return
     *     The from
     */
    public From getFrom() {
        return from;
    }

    /**
     * 
     * @param from
     *     The from
     */
    public void setFrom(From from) {
        this.from = from;
    }

    /**
     * 
     * @return
     *     The quota
     */
    public Quota getQuota() {
        return quota;
    }

    /**
     * 
     * @param quota
     *     The quota
     */
    public void setQuota(Quota quota) {
        this.quota = quota;
    }

    /**
     * 
     * @return
     *     The to
     */
    public To getTo() {
        return to;
    }

    /**
     * 
     * @param to
     *     The to
     */
    public void setTo(To to) {
        this.to = to;
    }

    /**
     * 
     * @return
     *     The fare
     */
    public List<Fare> getFare() {
        return fare;
    }

    /**
     * 
     * @param fare
     *     The fare
     */
    public void setFare(List<Fare> fare) {
        this.fare = fare;
    }

}
