
package com.zuneeue.irctcinfo.models.searchtrains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Train {

    @SerializedName("no")
    @Expose
    private int no;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("src_departure_time")
    @Expose
    private String srcDepartureTime;
    @SerializedName("dest_arrival_time")
    @Expose
    private String destArrivalTime;
    @SerializedName("travel_time")
    @Expose
    private String travelTime;
    @SerializedName("from")
    @Expose
    private From from;
    @SerializedName("to")
    @Expose
    private To to;
    @SerializedName("classes")
    @Expose
    private List<Class> classes = new ArrayList<Class>();
    @SerializedName("days")
    @Expose
    private List<Day> days = new ArrayList<Day>();

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

    /**
     * 
     * @return
     *     The srcDepartureTime
     */
    public String getSrcDepartureTime() {
        return srcDepartureTime;
    }

    /**
     * 
     * @param srcDepartureTime
     *     The src_departure_time
     */
    public void setSrcDepartureTime(String srcDepartureTime) {
        this.srcDepartureTime = srcDepartureTime;
    }

    /**
     * 
     * @return
     *     The destArrivalTime
     */
    public String getDestArrivalTime() {
        return destArrivalTime;
    }

    /**
     * 
     * @param destArrivalTime
     *     The dest_arrival_time
     */
    public void setDestArrivalTime(String destArrivalTime) {
        this.destArrivalTime = destArrivalTime;
    }

    /**
     * 
     * @return
     *     The travelTime
     */
    public String getTravelTime() {
        return travelTime;
    }

    /**
     * 
     * @param travelTime
     *     The travel_time
     */
    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
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
     *     The classes
     */
    public List<Class> getClasses() {
        return classes;
    }

    /**
     * 
     * @param classes
     *     The classes
     */
    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    /**
     * 
     * @return
     *     The days
     */
    public List<Day> getDays() {
        return days;
    }

    /**
     * 
     * @param days
     *     The days
     */
    public void setDays(List<Day> days) {
        this.days = days;
    }

}
