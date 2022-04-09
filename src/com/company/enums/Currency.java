package com.company.enums;

public enum Currency implements CustomInter {
    AZN("Azerbaijan", 940),
    USD("United States", 840),
    TRY("Turkey", 949);

    private String country;
    private int code;

    Currency() {
    }

    Currency(String country, int code) {
        this.country = country;
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
