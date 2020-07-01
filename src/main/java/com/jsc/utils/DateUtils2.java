package com.jsc.utils;

import com.jsc.model.EduPlan;
import com.jsc.model.Student;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateUtils2 {

    static String DATE_TIME_FMT = "yyyy-MM-dd HH:mm:ss.SSS";
    static String DATE_TIME_FMT_NO_MILL = "yyyy-MM-dd HH:mm:ss";
    static String DATE_FMT = "yyyy-MM-dd";
    static String TIME_FMT = "HH:mm:ss.SSS";
    static String TIME_FMT_NO_MILL = "HH:mm:ss";
    static String TIME_FMT_NO_SEC = "yyyy-MM-dd HH:mm";

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {

        try {
            System.out.println(diffDays("2019-12-21", "2019-12-20"));

            List<Student> newStudentList = new ArrayList<>();
            Student student1 = new Student();
            student1.setSfzmhm("1");
            student1.setZt("1");
            newStudentList.add(student1);

            Student student2 = new Student();
            student2.setSfzmhm("2");
            student2.setZt("2");
            newStudentList.add(student2);

            Student student3 = new Student();
            student3.setSfzmhm("2");
            student3.setZt("0");
            newStudentList.add(student3);

            Student student4 = new Student();
            student4.setSfzmhm("4");
            student4.setZt("2");
            newStudentList.add(student4);

            for (Student student : newStudentList) {
                System.out.println(student);
            }

            EduPlan eduPlan = new EduPlan();
            eduPlan.setStus(newStudentList);

            List<Student> studentList = eduPlan.getStus();
            Map<String,Student> map = new HashMap();
            for (Student student : studentList) {
                if(map.containsKey(student.getSfzmhm())){
                    if(map.get(student.getSfzmhm()).getZt().compareTo(student.getZt()) >= 0){
                        eduPlan.getStus().remove(map.get(student.getSfzmhm()));
                        map.put(student.getSfzmhm(), student);
                    }else{
                        eduPlan.getStus().remove(student);
                    }
                }else{
                    map.put(student.getSfzmhm(), student);
                }
            }

            for (Student student : eduPlan.getStus()) {
                System.out.println(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String dateToString(Date date, String format) {
        if (date == null)
            throw new NullPointerException("dateToString: date == null");

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String currentDate = sdf.format(date);
        return currentDate;
    }

    public static String dateToString(Date date) {
        return dateToString(date, DATE_TIME_FMT);
    }

    public static String dateToStringNoMillsec(Date date) {
        return dateToString(date, DATE_TIME_FMT_NO_MILL);
    }

    public static String dateToDateString(Date date) {
        return dateToString(date, DATE_FMT);
    }

    public static String dateToTimeString(Date date) {
        return dateToString(date, TIME_FMT);
    }

    public static String dateToTimeStringNoMillsec(Date date) {
        return dateToString(date, TIME_FMT_NO_MILL);
    }

    public static Date parseDate(String str) throws Exception {
        if (str == null)
            throw new NullPointerException("parseDate: str == null");

        str = StringUtils.trim(str);
        if (str.length() == 0)
            throw new Exception("parseDate: str is empty");

        Boolean hasMill = str.charAt(str.length() - 4) == '.';
        Boolean hasSpace = StringUtils.contains(str, ' ');

        String fmt = DATE_TIME_FMT;
        if (hasSpace) {
            if (hasMill)
                fmt = DATE_TIME_FMT;
            else
                fmt = DATE_TIME_FMT_NO_MILL;
        } else {
            if (StringUtils.contains(str, '-'))
                fmt = DATE_FMT;
            else if (StringUtils.contains(str, ':'))
                fmt = hasMill ? TIME_FMT : TIME_FMT_NO_MILL;
        }

        return DateUtils.parseDate(str, fmt);
    }

    public static boolean isEffectiveDate(Date nowTime, String start, String finish) throws ParseException {


        Date startTime = DateUtils.parseDate(start, TIME_FMT_NO_SEC);
        Date finishTime = DateUtils.parseDate(finish, TIME_FMT_NO_SEC);

        if (nowTime.getTime() == startTime.getTime()
                || nowTime.getTime() == finishTime.getTime()) {
            return true;
        }

        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(startTime);
        begin.add(Calendar.MINUTE, -30);

        Calendar end = Calendar.getInstance();
        end.setTime(finishTime);
        end.add(Calendar.MINUTE, 30);

        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }

    public static int diff(long currentTimeMillis, Long end) {
        int minute = 0;
        long diff = end - currentTimeMillis;
        minute = (int) (diff / (60 * 1000));
        return minute;
    }

    public static Date addMinutes(long now, int minutes) {
        Calendar date = Calendar.getInstance();
        date.setTime(new Date(now));
        date.add(Calendar.MINUTE, minutes);
        return date.getTime();
    }

    public static int diffDays(String nowDate, String expiry) throws Exception {
        Date begin = parseDate(nowDate);
        Date end = parseDate(expiry);

        int days = (int) ((end.getTime() - begin.getTime()) / (3600 * 1000 * 24));
        return days;
    }
}
