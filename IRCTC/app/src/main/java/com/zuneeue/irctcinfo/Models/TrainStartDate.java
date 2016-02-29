
package com.zuneeue.irctcinfo.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TrainStartDate {

    @SerializedName("month")
    @Expose
    private int month;
    @SerializedName("year")
    @Expose
    private int year;
    @SerializedName("day")
    @Expose
    private int day;

    /**
     * 
     * @return
     *     The month
     */
    public int getMonth() {
        return month;
    }

    /**
     * 
     * @param month
     *     The month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * 
     * @return
     *     The year
     */
    public int getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    public void setYear(int year) {
        this.year = year;
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

}
