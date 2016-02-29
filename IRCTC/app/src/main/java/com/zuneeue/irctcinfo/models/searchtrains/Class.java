
package com.zuneeue.irctcinfo.models.searchtrains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Class {

    @SerializedName("class-code")
    @Expose
    private String classCode;
    @SerializedName("available")
    @Expose
    private String available;

    /**
     * 
     * @return
     *     The classCode
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * 
     * @param classCode
     *     The class-code
     */
    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    /**
     * 
     * @return
     *     The available
     */
    public String getAvailable() {
        return available;
    }

    /**
     * 
     * @param available
     *     The available
     */
    public void setAvailable(String available) {
        this.available = available;
    }

}
