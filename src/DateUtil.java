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
     * @param date
     * @return
     */
    public static Calendar getCalender(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    /**
     * 返回当天的Calendar实例
     * @return
     */
    public static Calendar getCurrentCalendar() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
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
}
