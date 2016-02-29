
package com.zuneeue.irctcinfo.models.availability;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Class {

    @SerializedName("class_name")
    @Expose
    private String className;
    @SerializedName("class_code")
    @Expose
    private String classCode;

    /**
     * 
     * @return
     *     The className
     */
    public String getClassName() {
        return className;
    }

    /**
     * 
     * @param className
     *     The class_name
     */
    public void setClassName(String className) {
        this.className = className;
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
     *     The class_code
     */
    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

}
