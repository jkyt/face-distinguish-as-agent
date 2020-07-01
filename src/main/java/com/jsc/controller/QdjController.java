package com.jsc.controller;

import com.alibaba.fastjson.JSONObject;
import com.jsc.model.SignInfo;
import com.jsc.result.QdjResult2;
import com.jsc.utils.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class QdjController {

    private Logger _logger = LoggerFactory.getLogger(QdjController.class);

    /**
     * 测试用接口。
     *
     * @param request
     * @param signInfo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/FileUploadSelf", method = RequestMethod.GET)
    public QdjResult2 fileUploadSelfGET(HttpServletRequest request, SignInfo signInfo) {
        return fileUploadSelf(request, signInfo);
    }

    @ResponseBody
    @RequestMapping(value = "/FileUploadSelf", method = RequestMethod.POST, produces = "application/json", consumes = "application/json;charset=UTF-8")
    public QdjResult2 fileUploadSelfPOST(HttpServletRequest request, @RequestBody SignInfo signInfo) {
        return fileUploadSelf(request, signInfo);
    }

    public QdjResult2 fileUploadSelf(HttpServletRequest request, SignInfo signInfo) {

        _logger.info("################################################");
        _logger.info("【收到考勤命令】");
        QdjResult2 result = null;
        HttpUtils httpUtils =new HttpUtils();
        String url="http://127.0.0.1:8082/FileUploadSelf";
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("token",signInfo.getToken());
        jsonObject.put("cardNo",signInfo.getCardNo());
        jsonObject.put("name",signInfo.getName());
        jsonObject.put("similarityDegree",signInfo.getSimilarityDegree());
        jsonObject.put("image1",signInfo.getImage1());
        jsonObject.put("image2",signInfo.getImage2());
        jsonObject.put("cardImgPath",signInfo.getCardImgPath());
        jsonObject.put("faceImgPath",signInfo.getFaceImgPath());
        jsonObject.put("signStatus",signInfo.getSignStatus());
        jsonObject.put("signTime",signInfo.getSignTime());
        httpUtils.sendPost2(url,jsonObject);


        _logger.info(httpUtils.sendPost2(url,jsonObject));
        _logger.info("################################################");


        return result;
    }



}
