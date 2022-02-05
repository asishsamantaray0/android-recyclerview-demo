package com.asish.companyinfo.models;

/**
 * Company Model class.
 */
public class CompanyModel {

    private String name;
    private String ceoName;
    private int logo;

    public CompanyModel() {
    }

    /**
     * All Args Constructor.
     *
     * @param name    Name of the Company
     * @param ceoName CEO name
     * @param logo    Company Logo
     */
    public CompanyModel(String name, String ceoName, int logo) {
        this.name = name;
        this.ceoName = ceoName;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
