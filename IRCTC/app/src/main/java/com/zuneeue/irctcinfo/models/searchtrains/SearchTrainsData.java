
package com.zuneeue.irctcinfo.models.searchtrains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SearchTrainsData {

    @SerializedName("response_code")
    @Expose
    private int responseCode;
    @SerializedName("total")
    @Expose
    private int total;
    @SerializedName("train")
    @Expose
    private List<Train> train = new ArrayList<Train>();

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
     *     The total
     */
    public int getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * 
     * @return
     *     The train
     */
    public List<Train> getTrain() {
        return train;
    }

    /**
     * 
     * @param train
     *     The train
     */
    public void setTrain(List<Train> train) {
        this.train = train;
    }

}
