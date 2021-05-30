package com.cdp.model;

public class Position {
    private Integer J_id;
    private String J_name;
    private String J_introduce;
    private Integer id;//部门id
    private float gz;

    public Integer getJ_id() {
        return J_id;
    }

    public void setJ_id(Integer j_id) {
        J_id = j_id;
    }

    public String getJ_name() {
        return J_name;
    }

    public void setJ_name(String j_name) {
        J_name = j_name;
    }

    public String getJ_introduce() {
        return J_introduce;
    }

    public void setJ_introduce(String j_introduce) {
        J_introduce = j_introduce;
    }

    public float getGz() {
        return gz;
    }

    public void setGz(float gz) {
        this.gz = gz;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Position{" +
                "J_id=" + J_id +
                ", J_name='" + J_name + '\'' +
                ", J_introduce='" + J_introduce + '\'' +
                ", id=" + id +
                ", gz=" + gz +
                '}';
    }
}
