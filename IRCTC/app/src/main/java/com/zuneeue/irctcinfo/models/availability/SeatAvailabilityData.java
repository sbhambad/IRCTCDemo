
package com.zuneeue.irctcinfo.models.availability;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SeatAvailabilityData {

    @SerializedName("response_code")
    @Expose
    private int responseCode;
    @SerializedName("train_number")
    @Expose
    private String trainNumber;
    @SerializedName("train_name")
    @Expose
    private String trainName;
    @SerializedName("error")
    @Expose
    private boolean error;
    @SerializedName("from")
    @Expose
    private From from;
    @SerializedName("class")
    @Expose
    private Class _class;
    @SerializedName("to")
    @Expose
    private To to;
    @SerializedName("availability")
    @Expose
    private List<Availability> availability = new ArrayList<Availability>();
    @SerializedName("quota")
    @Expose
    private Quota quota;

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
     *     The trainNumber
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * 
     * @param trainNumber
     *     The train_number
     */
    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    /**
     * 
     * @return
     *     The trainName
     */
    public String getTrainName() {
        return trainName;
    }

    /**
     * 
     * @param trainName
     *     The train_name
     */
    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    /**
     * 
     * @return
     *     The error
     */
    public boolean isError() {
        return error;
    }

    /**
     * 
     * @param error
     *     The error
     */
    public void setError(boolean error) {
        this.error = error;
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
     *     The _class
     */
    public Class getClass_() {
        return _class;
    }

    /**
     * 
     * @param _class
     *     The class
     */
    public void setClass_(Class _class) {
        this._class = _class;
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
     *     The availability
     */
    public List<Availability> getAvailability() {
        return availability;
    }

    /**
     * 
     * @param availability
     *     The availability
     */
    public void setAvailability(List<Availability> availability) {
        this.availability = availability;
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

}
