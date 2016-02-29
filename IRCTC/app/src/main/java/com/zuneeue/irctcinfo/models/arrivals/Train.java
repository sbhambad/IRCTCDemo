
package com.zuneeue.irctcinfo.models.arrivals;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Train {

    @SerializedName("scharr")
    @Expose
    private String scharr;
    @SerializedName("delayarr")
    @Expose
    private String delayarr;
    @SerializedName("schdep")
    @Expose
    private String schdep;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("actdep")
    @Expose
    private String actdep;
    @SerializedName("delaydep")
    @Expose
    private String delaydep;
    @SerializedName("actarr")
    @Expose
    private String actarr;
    @SerializedName("number")
    @Expose
    private String number;

    /**
     * 
     * @return
     *     The scharr
     */
    public String getScharr() {
        return scharr;
    }

    /**
     * 
     * @param scharr
     *     The scharr
     */
    public void setScharr(String scharr) {
        this.scharr = scharr;
    }

    /**
     * 
     * @return
     *     The delayarr
     */
    public String getDelayarr() {
        return delayarr;
    }

    /**
     * 
     * @param delayarr
     *     The delayarr
     */
    public void setDelayarr(String delayarr) {
        this.delayarr = delayarr;
    }

    /**
     * 
     * @return
     *     The schdep
     */
    public String getSchdep() {
        return schdep;
    }

    /**
     * 
     * @param schdep
     *     The schdep
     */
    public void setSchdep(String schdep) {
        this.schdep = schdep;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The actdep
     */
    public String getActdep() {
        return actdep;
    }

    /**
     * 
     * @param actdep
     *     The actdep
     */
    public void setActdep(String actdep) {
        this.actdep = actdep;
    }

    /**
     * 
     * @return
     *     The delaydep
     */
    public String getDelaydep() {
        return delaydep;
    }

    /**
     * 
     * @param delaydep
     *     The delaydep
     */
    public void setDelaydep(String delaydep) {
        this.delaydep = delaydep;
    }

    /**
     * 
     * @return
     *     The actarr
     */
    public String getActarr() {
        return actarr;
    }

    /**
     * 
     * @param actarr
     *     The actarr
     */
    public void setActarr(String actarr) {
        this.actarr = actarr;
    }

    /**
     * 
     * @return
     *     The number
     */
    public String getNumber() {
        return number;
    }

    /**
     * 
     * @param number
     *     The number
     */
    public void setNumber(String number) {
        this.number = number;
    }

}
