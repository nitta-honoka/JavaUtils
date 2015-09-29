package com.cnblogs.honoka.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by honoka on 15/9/24.
 * 日期工具类
 */
public class DateUtil {

    //定义日期模板
    private static String defaultDatePattern = "yyyy-MM-dd";
    public final static String DEFAULT_DATE_FORMAT = "yyyy年MM月dd日";
    public final static String DATETIME_FORMAT_HHMMSS = "yyyy年MM月dd日 HH时mm分ss秒";
    public final static String yyMMdd = "yy-MM-dd"; //150924
    public final static String yyyyMMdd = "yyyy-MM-dd"; //2015-09-24
    public final static String HHmmss = "HH:mm:ss"; //22:19:20
    public final static String yyyyMMddHHmmss = "yyyy-MM-dd HH:mm:ss"; //2015-09-24 22:19:20
    public final static String yyMMddHHmmss = "yy-MM-dd HH:mm:ss"; //15-09-24 22:19:20

    /**
     * 返回指定日期的Calendar实例
     * @param date 传入日期
     * @return
     */
    public static Calendar getCalender(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    /**
     * 返回当天的Calendar实例
     * @return calendar Calendar实例
     */
    public static Calendar getCurrentCalendar() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    /**
     * 返回自定义格式的当前日期
     * @param pattern 指定的格式
     * @return 指定格式的日期
     */
    public static String getCurrentTimeByCustomPattern(String pattern) {
        return new SimpleDateFormat(pattern).format(new Date());
    }

    /**
     * 返回当前日期
     * @return
     */
    public static Date getCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }

    /**
     * 返回当前年份
     * @return
     */
    public static int getCurrentYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 返回当前月份
     * @return
     */
    public static int getCurrentMonth() {
        Calendar calendar = Calendar.getInstance();
        return (calendar.get(Calendar.MONTH) + 1);
    }

    /**
     * 返回当前日
     * @return
     */
    public static int getCurrentDay() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DATE);
    }

    /**
     * 将指定日期转换为默认格式yyyy-MM-dd
     * @param date
     * @return
     */
    public static String getTimeByDefaultPattern(Date date) {
        return new SimpleDateFormat(defaultDatePattern).format(date);
    }

    /**
     * 将指定日期转换为自定义格式
     * @param date
     * @param pattern
     * @return
     */
    public static String getTimeByCustomPattern(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }

    /**
     * 判断日期是否属于自然季度的末尾月,3-5月春，6-8月夏，9-11月秋，12-2月冬
     * @param date
     * @return
     */
    public static boolean isEndOfSeason(Date date) {
        Calendar calendar = getCalender(date);
        int month = calendar.get(Calendar.MONTH) + 1;
        if (month % 3 == 2) {
            return true;
        }
        return false;
    }

    /**
     * 返回指定日期的年份
     * @param date
     * @return
     */
    public static int getYear(Date date) {
        Calendar calendar = getCalender(date);
        return calendar.get(Calendar.YEAR);
    }
    /**
     * 返回指定日期的月份
     * @param date
     * @return
     */
    public static int getMonth(Date date) {
        Calendar calendar = getCalender(date);
        return (calendar.get(Calendar.MONTH) + 1);
    }
    /**
     * 返回指定日期的天数
     * @param date
     * @return
     */
    public static int getDay(Date date) {
        Calendar calendar = getCalender(date);
        return calendar.get(Calendar.DATE);
    }
    /**
     * 日期型转换为自定义格式的字符串
     * @param pattern 格式
     * @param date 日期
     * @return
     */
    public static String dateToString(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }

    /**
     * 将自定义格式的字符串转换为日期型
     * @param dateString 字符串
     * @param pattern   格式
     * @return
     * @throws Exception
     */
    public static Date stringToDate(String dateString, String pattern) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            Date date = simpleDateFormat.parse(dateString);
            return date;
        } catch (ParseException e) {
            throw new Exception("请检查输入字符串与其格式");
        }
    }
}
