
package com.zuneeue.irctcinfo.models.routes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class RouteData {

    @SerializedName("response_code")
    @Expose
    private int responseCode;
    @SerializedName("route")
    @Expose
    private List<Route> route = new ArrayList<Route>();
    @SerializedName("train")
    @Expose
    private Train train;

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

}
