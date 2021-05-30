package com.cdp.model;

import java.util.Date;

public class People {
    private Integer P_id;
    private String P_account;
    private String P_password;
    private String P_truename;
    private String P_sex;
    private Date P_borthy;
    private String P_email;
    private String P_phone;
    private Integer P_state;
    private Integer B_ID;
    private Integer Z_ID;
    private Date R_time;
    private String P_adress;
    private String P_js;

    public Integer getP_id() {
        return P_id;
    }

    public void setP_id(Integer p_id) {
        P_id = p_id;
    }

    public String getP_account() {
        return P_account;
    }

    public void setP_account(String p_account) {
        P_account = p_account;
    }

    public String getP_truename() {
        return P_truename;
    }

    public void setP_truename(String p_truename) {
        P_truename = p_truename;
    }

    public String getP_sex() {
        return P_sex;
    }

    public void setP_sex(String p_sex) {
        P_sex = p_sex;
    }

    public Date getP_borthy() {
        return P_borthy;
    }

    public void setP_borthy(Date p_borthy) {
        P_borthy = p_borthy;
    }

    public String getP_email() {
        return P_email;
    }

    public void setP_email(String p_email) {
        P_email = p_email;
    }

    public String getP_phone() {
        return P_phone;
    }

    public void setP_phone(String p_phone) {
        P_phone = p_phone;
    }

    public Integer getP_state() {
        return P_state;
    }

    public void setP_state(Integer p_state) {
        P_state = p_state;
    }

    public Integer getB_ID() {
        return B_ID;
    }

    public void setB_ID(Integer b_ID) {
        B_ID = b_ID;
    }

    public Integer getZ_ID() {
        return Z_ID;
    }

    public void setZ_ID(Integer z_ID) {
        Z_ID = z_ID;
    }

    public Date getR_time() {
        return R_time;
    }

    public void setR_time(Date r_time) {
        R_time = r_time;
    }

    public String getP_adress() {
        return P_adress;
    }

    public void setP_adress(String p_adress) {
        P_adress = p_adress;
    }

    public String getP_js() {
        return P_js;
    }

    public void setP_js(String p_js) {
        P_js = p_js;
    }

    public String getP_password() {
        return P_password;
    }

    public void setP_password(String p_password) {
        P_password = p_password;
    }

    @Override
    public String toString() {
        return "People{" +
                "P_id=" + P_id +
                ", P_account='" + P_account + '\'' +
                ", P_password='" + P_password + '\'' +
                ", P_truename='" + P_truename + '\'' +
                ", P_sex='" + P_sex + '\'' +
                ", P_borthy=" + P_borthy +
                ", P_email='" + P_email + '\'' +
                ", P_phone='" + P_phone + '\'' +
                ", P_state=" + P_state +
                ", B_ID=" + B_ID +
                ", Z_ID=" + Z_ID +
                ", R_time=" + R_time +
                ", P_adress='" + P_adress + '\'' +
                ", P_js='" + P_js + '\'' +
                '}';
    }
}
