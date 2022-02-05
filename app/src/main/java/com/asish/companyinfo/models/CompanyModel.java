package com.asish.companyinfo.models;

public class CompanyModel {

    private String name;
    private String ceoName;
    private int logo;

    public CompanyModel() {
    }

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
