package com.jsc.model;

import java.util.List;

public class EduPlan {

    private String jhxh; // 计划序号
    private String kcfl; // 课程分类
    private String kcflmc; // 课程分类名称
    private String jyddmc; // 教育地点名称
    private String jhrs; // 计划人数
    private String sqrs; // 申请人数
    private String ccbj; // 标记  1是半日课程（上午或下午）2是整日课程（上午和下午）[addtime 180803]
    private String skkssj; // 授课开始时间 半日课程开始时间；整日课程上午场开始时间
    private String skjssj; // 授课结束时间 半日课程结束时间 整日课程上午场结束时间
    private String skkssj2;// 授课开始时间2  半日课程为空 整日课程下午场开始时间[addtime 180803]
    private String skjssj2;// 授课结束时间2 半日课程为空 整日课程下午场结束时间[addtime 180803]
    private String skks; // 授课课时
    private String dmcs;// 点名次数 该场次需要中间点名次数 [addtime 180803]
    private String jgsj;//点名间隔时间 点名次数超过1次的该值有效，单位：分钟 [addtime 180803]
    List<Student> stus; // 学员集合


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EduPlan{");
        sb.append("jhxh='").append(jhxh).append('\'');
        sb.append(", kcfl='").append(kcfl).append('\'');
        sb.append(", kcflmc='").append(kcflmc).append('\'');
        sb.append(", jyddmc='").append(jyddmc).append('\'');
        sb.append(", jhrs='").append(jhrs).append('\'');
        sb.append(", sqrs='").append(sqrs).append('\'');
        sb.append(", ccbj='").append(ccbj).append('\'');
        sb.append(", skkssj='").append(skkssj).append('\'');
        sb.append(", skjssj='").append(skjssj).append('\'');
        sb.append(", skkssj2='").append(skkssj2).append('\'');
        sb.append(", skjssj2='").append(skjssj2).append('\'');
        sb.append(", skks='").append(skks).append('\'');
        sb.append(", dmcs='").append(dmcs).append('\'');
        sb.append(", jgsj='").append(jgsj).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getJhxh() {
        return jhxh;
    }

    public void setJhxh(String jhxh) {
        this.jhxh = jhxh;
    }

    public String getKcfl() {
        return kcfl;
    }

    public void setKcfl(String kcfl) {
        this.kcfl = kcfl;
    }

    public String getKcflmc() {
        return kcflmc;
    }

    public void setKcflmc(String kcflmc) {
        this.kcflmc = kcflmc;
    }

    public String getJyddmc() {
        return jyddmc;
    }

    public void setJyddmc(String jyddmc) {
        this.jyddmc = jyddmc;
    }

    public String getJhrs() {
        return jhrs;
    }

    public void setJhrs(String jhrs) {
        this.jhrs = jhrs;
    }

    public String getSqrs() {
        return sqrs;
    }

    public void setSqrs(String sqrs) {
        this.sqrs = sqrs;
    }

    public String getSkkssj() {
        return skkssj;
    }

    public void setSkkssj(String skkssj) {
        this.skkssj = skkssj;
    }

    public String getSkjssj() {
        return skjssj;
    }

    public void setSkjssj(String skjssj) {
        this.skjssj = skjssj;
    }

    public String getSkks() {
        return skks;
    }

    public void setSkks(String skks) {
        this.skks = skks;
    }

    public List<Student> getStus() {
        return stus;
    }

    public void setStus(List<Student> stus) {
        this.stus = stus;
    }

    public String getCcbj() {
        return ccbj;
    }

    public void setCcbj(String ccbj) {
        this.ccbj = ccbj;
    }

    public String getSkkssj2() {
        return skkssj2;
    }

    public void setSkkssj2(String skkssj2) {
        this.skkssj2 = skkssj2;
    }

    public String getSkjssj2() {
        return skjssj2;
    }

    public void setSkjssj2(String skjssj2) {
        this.skjssj2 = skjssj2;
    }

    public String getDmcs() {
        return dmcs;
    }

    public void setDmcs(String dmcs) {
        this.dmcs = dmcs;
    }

    public String getJgsj() {
        return jgsj;
    }

    public void setJgsj(String jgsj) {
        this.jgsj = jgsj;
    }

}
