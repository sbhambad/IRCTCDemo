
package com.zuneeue.irctcinfo.models.routes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Class {

    @SerializedName("available")
    @Expose
    private String available;
    @SerializedName("class-code")
    @Expose
    private String classCode;

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

}
