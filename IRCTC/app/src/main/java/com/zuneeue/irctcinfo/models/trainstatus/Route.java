
package com.zuneeue.irctcinfo.models.trainstatus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Route {

    @SerializedName("no")
    @Expose
    private int no;
    @SerializedName("station_")
    @Expose
    private Station station;
    @SerializedName("has_arrived")
    @Expose
    private boolean hasArrived;
    @SerializedName("has_departed")
    @Expose
    private boolean hasDeparted;
    @SerializedName("day")
    @Expose
    private int day;
    @SerializedName("distance")
    @Expose
    private int distance;
    @SerializedName("scharr")
    @Expose
    private String scharr;
    @SerializedName("schdep")
    @Expose
    private String schdep;
    @SerializedName("actarr")
    @Expose
    private String actarr;
    @SerializedName("actdep")
    @Expose
    private String actdep;
    @SerializedName("scharr_date")
    @Expose
    private String scharrDate;
    @SerializedName("actarr_date")
    @Expose
    private String actarrDate;
    @SerializedName("latemin")
    @Expose
    private int latemin;

    /**
     * 
     * @return
     *     The no
     */
    public int getNo() {
        return no;
    }

    /**
     * 
     * @param no
     *     The no
     */
    public void setNo(int no) {
        this.no = no;
    }

    /**
     * 
     * @return
     *     The station
     */
    public Station getStation() {
        return station;
    }

    /**
     * 
     * @param station
     *     The station_
     */
    public void setStation(Station station) {
        this.station = station;
    }

    /**
     * 
     * @return
     *     The hasArrived
     */
    public boolean isHasArrived() {
        return hasArrived;
    }

    /**
     * 
     * @param hasArrived
     *     The has_arrived
     */
    public void setHasArrived(boolean hasArrived) {
        this.hasArrived = hasArrived;
    }

    /**
     * 
     * @return
     *     The hasDeparted
     */
    public boolean isHasDeparted() {
        return hasDeparted;
    }

    /**
     * 
     * @param hasDeparted
     *     The has_departed
     */
    public void setHasDeparted(boolean hasDeparted) {
        this.hasDeparted = hasDeparted;
    }

    /**
     * 
     * @return
     *     The day
     */
    public int getDay() {
        return day;
    }

    /**
     * 
     * @param day
     *     The day
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * 
     * @return
     *     The distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * 
     * @param distance
     *     The distance
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

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
     *     The scharrDate
     */
    public String getScharrDate() {
        return scharrDate;
    }

    /**
     * 
     * @param scharrDate
     *     The scharr_date
     */
    public void setScharrDate(String scharrDate) {
        this.scharrDate = scharrDate;
    }

    /**
     * 
     * @return
     *     The actarrDate
     */
    public String getActarrDate() {
        return actarrDate;
    }

    /**
     * 
     * @param actarrDate
     *     The actarr_date
     */
    public void setActarrDate(String actarrDate) {
        this.actarrDate = actarrDate;
    }

    /**
     * 
     * @return
     *     The latemin
     */
    public int getLatemin() {
        return latemin;
    }

    /**
     * 
     * @param latemin
     *     The latemin
     */
    public void setLatemin(int latemin) {
        this.latemin = latemin;
    }

}
