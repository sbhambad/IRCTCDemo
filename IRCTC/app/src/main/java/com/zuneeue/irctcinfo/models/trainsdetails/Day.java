
package com.zuneeue.irctcinfo.models.trainsdetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Day {

    @SerializedName("day-code")
    @Expose
    private String dayCode;
    @SerializedName("runs")
    @Expose
    private String runs;

    /**
     * 
     * @return
     *     The dayCode
     */
    public String getDayCode() {
        return dayCode;
    }

    /**
     * 
     * @param dayCode
     *     The day-code
     */
    public void setDayCode(String dayCode) {
        this.dayCode = dayCode;
    }

    /**
     * 
     * @return
     *     The runs
     */
    public String getRuns() {
        return runs;
    }

    /**
     * 
     * @param runs
     *     The runs
     */
    public void setRuns(String runs) {
        this.runs = runs;
    }

}
