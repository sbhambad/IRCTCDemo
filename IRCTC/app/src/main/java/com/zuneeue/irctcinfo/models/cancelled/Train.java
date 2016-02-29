
package com.zuneeue.irctcinfo.models.cancelled;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Train {

    @SerializedName("train")
    @Expose
    private Train_ train;
    @SerializedName("dest")
    @Expose
    private Dest dest;
    @SerializedName("source")
    @Expose
    private Source source;

    /**
     * 
     * @return
     *     The train
     */
    public Train_ getTrain() {
        return train;
    }

    /**
     * 
     * @param train
     *     The train
     */
    public void setTrain(Train_ train) {
        this.train = train;
    }

    /**
     * 
     * @return
     *     The dest
     */
    public Dest getDest() {
        return dest;
    }

    /**
     * 
     * @param dest
     *     The dest
     */
    public void setDest(Dest dest) {
        this.dest = dest;
    }

    /**
     * 
     * @return
     *     The source
     */
    public Source getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    public void setSource(Source source) {
        this.source = source;
    }

}
