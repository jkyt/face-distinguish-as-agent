package com.jsc.model;

public class Student {
    private String wwlsh; // 外网流水号
    private String sfzmhm; // 身份证明号码
    private String xm; // 姓名
    private String zt; // 状态 0申请1完成学习[addtime 180803]
    private String qdsj; // 签到时间 未签到的返回空[addtime 180803]
    private String qtsj; // 签退时间 未签退的返回空[addtime 180803]
    private String zjzpPath; // 照片路径
    private String xczpPath;// 现场照片
    
    /**
     * 扩展字段，用于标识教室类型。
     */
    private String classType;


    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getZjzpPath() {
        return zjzpPath;
    }

    public void setZjzpPath(String zjzpPath) {
        this.zjzpPath = zjzpPath;
    }

    public String getXczpPath() {
        return xczpPath;
    }

    public void setXczpPath(String xczpPath) {
        this.xczpPath = xczpPath;
    }

    public String getWwlsh() {
        return wwlsh;
    }

    public void setWwlsh(String wwlsh) {
        this.wwlsh = wwlsh;
    }

    public String getSfzmhm() {
        return sfzmhm;
    }

    public void setSfzmhm(String sfzmhm) {
        this.sfzmhm = sfzmhm;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getQdsj() {
        return qdsj;
    }

    public void setQdsj(String qdsj) {
        this.qdsj = qdsj;
    }

    public String getQtsj() {
        return qtsj;
    }

    public void setQtsj(String qtsj) {
        this.qtsj = qtsj;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("wwlsh='").append(wwlsh).append('\'');
        sb.append(", sfzmhm='").append(sfzmhm).append('\'');
        sb.append(", xm='").append(xm).append('\'');
        sb.append(", zt='").append(zt).append('\'');
        sb.append(", qdsj='").append(qdsj).append('\'');
        sb.append(", qtsj='").append(qtsj).append('\'');
        sb.append(", zjzpPath='").append(zjzpPath).append('\'');
        sb.append(", xczpPath='").append(xczpPath).append('\'');
        sb.append(", classType='").append(classType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
