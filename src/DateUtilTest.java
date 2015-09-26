import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by niconicoAO on 15/9/24.
 */
public class DateUtilTest {

    @Test
     public void testGetCurrentTime() throws Exception {
      //  System.out.println(DateUtil.getCurrentTime());
    }


    @Test
    public void testGetCurrentYear() throws Exception {
       // System.out.println(DateUtil.getCurrentYear());
    }

    @Test
    public void testGetCurrentMonth() throws Exception {
       // System.out.println(DateUtil.getCurrentMonth());
    }

    @Test
    public void testGetCurrentDay() throws Exception {
        //System.out.println(DateUtil.getCurrentDay());
    }

    @Test
    public void testIsEndOfSeason() throws Exception {
        System.out.println(DateUtil.isEndOfSeason(DateUtil.stringToDate("20150902", "yyyyMMdd")));
    }

    @Test
    public void testGetYear() throws Exception {
        System.out.println(DateUtil.getYear(DateUtil.stringToDate("20150902", "yyyyMMdd")));

    }

    @Test
    public void testGetMonth() throws Exception {
        System.out.println(DateUtil.getMonth(DateUtil.stringToDate("20150902", "yyyyMMdd")));

    }

    @Test
    public void testGetDay() throws Exception {
        System.out.println(DateUtil.getDay(DateUtil.stringToDate("20150902", "yyyyMMdd")));

    }
}