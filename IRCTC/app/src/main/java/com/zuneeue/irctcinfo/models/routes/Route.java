
package com.zuneeue.irctcinfo.models.routes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Route {

    @SerializedName("no")
    @Expose
    private int no;
    @SerializedName("distance")
    @Expose
    private int distance;
    @SerializedName("day")
    @Expose
    private int day;
    @SerializedName("halt")
    @Expose
    private int halt;
    @SerializedName("route")
    @Expose
    private int route;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("fullname")
    @Expose
    private String fullname;
    @SerializedName("lat")
    @Expose
    private double lat;
    @SerializedName("lng")
    @Expose
    private double lng;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("scharr")
    @Expose
    private String scharr;
    @SerializedName("schdep")
    @Expose
    private String schdep;

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
     *     The halt
     */
    public int getHalt() {
        return halt;
    }

    /**
     * 
     * @param halt
     *     The halt
     */
    public void setHalt(int halt) {
        this.halt = halt;
    }

    /**
     * 
     * @return
     *     The route
     */
    public int getRoute() {
        return route;
    }

    /**
     * 
     * @param route
     *     The route
     */
    public void setRoute(int route) {
        this.route = route;
    }

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The fullname
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * 
     * @param fullname
     *     The fullname
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * 
     * @return
     *     The lat
     */
    public double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    /**
     * 
     * @return
     *     The lng
     */
    public double getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    public void setLng(double lng) {
        this.lng = lng;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
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

}
