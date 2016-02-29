
package com.zuneeue.irctcinfo.models.availability;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Quota {

    @SerializedName("quota_name")
    @Expose
    private String quotaName;
    @SerializedName("quota_code")
    @Expose
    private String quotaCode;

    /**
     * 
     * @return
     *     The quotaName
     */
    public String getQuotaName() {
        return quotaName;
    }

    /**
     * 
     * @param quotaName
     *     The quota_name
     */
    public void setQuotaName(String quotaName) {
        this.quotaName = quotaName;
    }

    /**
     * 
     * @return
     *     The quotaCode
     */
    public String getQuotaCode() {
        return quotaCode;
    }

    /**
     * 
     * @param quotaCode
     *     The quota_code
     */
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

}
