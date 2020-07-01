package com.jsc.controller;


import com.jsc.WebReturn;
import com.jsc.utils.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LJAPIController {
    private Logger _logger = LoggerFactory.getLogger(LJAPIController.class);




    /**
     * 强制保存计划列表。
     *
     * @throws Exception
     */
    @RequestMapping(value = {"/api/saveEduPlan", "/api/saveeduplan"}, method = RequestMethod.GET)
    @ResponseBody
    public WebReturn saveEduListGET() {
        return saveEduPlan();
    }

    @RequestMapping(value = {"/api/saveEduPlan", "/api/saveeduplan"}, method = RequestMethod.POST)
    @ResponseBody
    public WebReturn saveEduListPOST() {
        return saveEduPlan();
    }

    public WebReturn saveEduPlan() {
        WebReturn ret = new WebReturn();

        HttpUtils httpUtils =new HttpUtils();
        String url="http://127.0.0.1:8082/api/saveeduplan";

        try {
            httpUtils.sendPost(url,"");
//            faceTask.getEduPlanAndStus();
        } catch (Exception ex) {
            ret.setException(ex);
            _logger.error("{}", ex);
        }

        return ret;
    }
}
