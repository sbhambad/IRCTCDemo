
package com.zuneeue.irctcinfo.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class PnrData {

    @SerializedName("response_code")
    @Expose
    private int responseCode;
    @SerializedName("error")
    @Expose
    private boolean error;
    @SerializedName("train_name")
    @Expose
    private String trainName;
    @SerializedName("train_num")
    @Expose
    private String trainNum;
    @SerializedName("pnr")
    @Expose
    private String pnr;
    @SerializedName("doj")
    @Expose
    private String doj;
    @SerializedName("chart_prepared")
    @Expose
    private String chartPrepared;
    @SerializedName("class")
    @Expose
    private String _class;
    @SerializedName("total_passengers")
    @Expose
    private int totalPassengers;
    @SerializedName("train_start_date")
    @Expose
    private TrainStartDate trainStartDate;
    @SerializedName("from_station")
    @Expose
    private FromStation fromStation;
    @SerializedName("boarding_point")
    @Expose
    private BoardingPoint boardingPoint;
    @SerializedName("to_station")
    @Expose
    private ToStation toStation;
    @SerializedName("reservation_upto")
    @Expose
    private ReservationUpto reservationUpto;
    @SerializedName("passengers")
    @Expose
    private List<Passenger> passengers = new ArrayList<Passenger>();

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
     *     The error
     */
    public boolean isError() {
        return error;
    }

    /**
     * 
     * @param error
     *     The error
     */
    public void setError(boolean error) {
        this.error = error;
    }

    /**
     * 
     * @return
     *     The trainName
     */
    public String getTrainName() {
        return trainName;
    }

    /**
     * 
     * @param trainName
     *     The train_name
     */
    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    /**
     * 
     * @return
     *     The trainNum
     */
    public String getTrainNum() {
        return trainNum;
    }

    /**
     * 
     * @param trainNum
     *     The train_num
     */
    public void setTrainNum(String trainNum) {
        this.trainNum = trainNum;
    }

    /**
     * 
     * @return
     *     The pnr
     */
    public String getPnr() {
        return pnr;
    }

    /**
     * 
     * @param pnr
     *     The pnr
     */
    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    /**
     * 
     * @return
     *     The doj
     */
    public String getDoj() {
        return doj;
    }

    /**
     * 
     * @param doj
     *     The doj
     */
    public void setDoj(String doj) {
        this.doj = doj;
    }

    /**
     * 
     * @return
     *     The chartPrepared
     */
    public String getChartPrepared() {
        return chartPrepared;
    }

    /**
     * 
     * @param chartPrepared
     *     The chart_prepared
     */
    public void setChartPrepared(String chartPrepared) {
        this.chartPrepared = chartPrepared;
    }

    /**
     * 
     * @return
     *     The _class
     */
    public String getClass_() {
        return _class;
    }

    /**
     * 
     * @param _class
     *     The class
     */
    public void setClass_(String _class) {
        this._class = _class;
    }

    /**
     * 
     * @return
     *     The totalPassengers
     */
    public int getTotalPassengers() {
        return totalPassengers;
    }

    /**
     * 
     * @param totalPassengers
     *     The total_passengers
     */
    public void setTotalPassengers(int totalPassengers) {
        this.totalPassengers = totalPassengers;
    }

    /**
     * 
     * @return
     *     The trainStartDate
     */
    public TrainStartDate getTrainStartDate() {
        return trainStartDate;
    }

    /**
     * 
     * @param trainStartDate
     *     The train_start_date
     */
    public void setTrainStartDate(TrainStartDate trainStartDate) {
        this.trainStartDate = trainStartDate;
    }

    /**
     * 
     * @return
     *     The fromStation
     */
    public FromStation getFromStation() {
        return fromStation;
    }

    /**
     * 
     * @param fromStation
     *     The from_station
     */
    public void setFromStation(FromStation fromStation) {
        this.fromStation = fromStation;
    }

    /**
     * 
     * @return
     *     The boardingPoint
     */
    public BoardingPoint getBoardingPoint() {
        return boardingPoint;
    }

    /**
     * 
     * @param boardingPoint
     *     The boarding_point
     */
    public void setBoardingPoint(BoardingPoint boardingPoint) {
        this.boardingPoint = boardingPoint;
    }

    /**
     * 
     * @return
     *     The toStation
     */
    public ToStation getToStation() {
        return toStation;
    }

    /**
     * 
     * @param toStation
     *     The to_station
     */
    public void setToStation(ToStation toStation) {
        this.toStation = toStation;
    }

    /**
     * 
     * @return
     *     The reservationUpto
     */
    public ReservationUpto getReservationUpto() {
        return reservationUpto;
    }

    /**
     * 
     * @param reservationUpto
     *     The reservation_upto
     */
    public void setReservationUpto(ReservationUpto reservationUpto) {
        this.reservationUpto = reservationUpto;
    }

    /**
     * 
     * @return
     *     The passengers
     */
    public List<Passenger> getPassengers() {
        return passengers;
    }

    /**
     * 
     * @param passengers
     *     The passengers
     */
    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }




}
