package com.jsc.model;

public class SignInfo {

    private String token;
    private String cardNo;
    private String name;
    private String similarityDegree;
    private String image1;
    private String image2;

    private String cardImgPath;
    private String faceImgPath;

    private String signStatus;
    private String signTime;

    public String getCardImgPath() {
        return cardImgPath;
    }

    public void setCardImgPath(String cardImgPath) {
        this.cardImgPath = cardImgPath;
    }

    public String getFaceImgPath() {
        return faceImgPath;
    }

    public void setFaceImgPath(String faceImgPath) {
        this.faceImgPath = faceImgPath;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSimilarityDegree() {
        return similarityDegree;
    }

    public void setSimilarityDegree(String similarityDegree) {
        this.similarityDegree = similarityDegree;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(String signStatus) {
        this.signStatus = signStatus;
    }

    public String getSignTime() {
        return signTime;
    }

    public void setSignTime(String signTime) {
        this.signTime = signTime;
    }

}
