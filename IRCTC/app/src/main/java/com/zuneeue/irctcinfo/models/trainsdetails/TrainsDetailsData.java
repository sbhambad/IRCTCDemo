
package com.zuneeue.irctcinfo.models.trainsdetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TrainsDetailsData {

    @SerializedName("response_code")
    @Expose
    private int responseCode;
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
