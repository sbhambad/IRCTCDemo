
package com.zuneeue.irctcinfo.models.trainstatus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class LiveStatusData {

    @SerializedName("response_code")
    @Expose
    private int responseCode;
    @SerializedName("error")
    @Expose
    private String error;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("train_number")
    @Expose
    private String trainNumber;
    @SerializedName("route")
    @Expose
    private List<Route> route = new ArrayList<Route>();

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
     *     The error
     */
    public String getError() {
        return error;
    }

    /**
     * 
     * @param error
     *     The error
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * 
     * @return
     *     The position
     */
    public String getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     *     The position
     */
    public void setPosition(String position) {
        this.position = position;
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
     *     The route
     */
    public List<Route> getRoute() {
        return route;
    }

    /**
     * 
     * @param route
     *     The route
     */
    public void setRoute(List<Route> route) {
        this.route = route;
    }

}
