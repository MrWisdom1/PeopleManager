package com.cdp.model;

import com.cdp.utils.Paging;

public class Department extends Paging {
    private Integer D_id;
    private String D_name;
    private String D_duty;
    private String D_phone;
    private Integer C_id;

    public Integer getC_id() {
        return C_id;
    }

    public void setC_id(Integer c_id) {
        C_id = c_id;
    }

    public Integer getD_id() {
        return D_id;
    }

    public void setD_id(Integer d_id) {
        D_id = d_id;
    }

    public String getD_name() {
        return D_name;
    }

    public void setD_name(String d_name) {
        D_name = d_name;
    }

    public String getD_duty() {
        return D_duty;
    }

    public void setD_duty(String d_duty) {
        D_duty = d_duty;
    }

    public String getD_phone() {
        return D_phone;
    }

    public void setD_phone(String d_phone) {
        D_phone = d_phone;
    }

    @Override
    public String toString() {
        return "Department{" +
                "D_id=" + D_id +
                ", D_name='" + D_name + '\'' +
                ", D_duty='" + D_duty + '\'' +
                ", D_phone='" + D_phone + '\'' +
                ", C_id=" + C_id +
                '}';
    }
}
