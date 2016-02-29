
package com.zuneeue.irctcinfo.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Passenger {

    @SerializedName("no")
    @Expose
    private int no;
    @SerializedName("booking_status")
    @Expose
    private String bookingStatus;
    @SerializedName("current_status")
    @Expose
    private String currentStatus;
    @SerializedName("coach_position")
    @Expose
    private int coachPosition;

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
     *     The bookingStatus
     */
    public String getBookingStatus() {
        return bookingStatus;
    }

    /**
     * 
     * @param bookingStatus
     *     The booking_status
     */
    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    /**
     * 
     * @return
     *     The currentStatus
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * 
     * @param currentStatus
     *     The current_status
     */
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    /**
     * 
     * @return
     *     The coachPosition
     */
    public int getCoachPosition() {
        return coachPosition;
    }

    /**
     * 
     * @param coachPosition
     *     The coach_position
     */
    public void setCoachPosition(int coachPosition) {
        this.coachPosition = coachPosition;
    }

}
