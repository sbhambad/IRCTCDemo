
package com.zuneeue.irctcinfo.models.cancelled;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CancelledData {

    @SerializedName("response_code")
    @Expose
    private int responseCode;
    @SerializedName("last_updated")
    @Expose
    private LastUpdated lastUpdated;
    @SerializedName("trains")
    @Expose
    private List<Train> trains = new ArrayList<Train>();

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
     *     The lastUpdated
     */
    public LastUpdated getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 
     * @param lastUpdated
     *     The last_updated
     */
    public void setLastUpdated(LastUpdated lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * 
     * @return
     *     The trains
     */
    public List<Train> getTrains() {
        return trains;
    }

    /**
     * 
     * @param trains
     *     The trains
     */
    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

}
