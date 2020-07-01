package com.jsc.model;

import java.util.List;

public class ClassRoom {

    private String classId;
    private String type;
    private List<OutPeople> outPeoples;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<OutPeople> getOutPeoples() {
        return outPeoples;
    }

    public void setOutPeoples(List<OutPeople> outPeoples) {
        this.outPeoples = outPeoples;
    }

}
