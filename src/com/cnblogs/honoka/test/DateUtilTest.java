package com.cnblogs.honoka.test;

import com.cnblogs.honoka.utils.DateUtil;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by niconicoAO on 15/9/24.
 */
public class DateUtilTest {

    @Test
     public void testGetCurrentTime() throws Exception {
       System.out.println(DateUtil.getCurrentTime());
    }


    @Test
    public void testGetCurrentYear() throws Exception {
        assertEquals(2015, DateUtil.getCurrentYear());
        assertNotEquals(2016, DateUtil.getCurrentYear());
    }

    @Test
    public void testGetCurrentMonth() throws Exception {
        assertEquals(9, DateUtil.getCurrentMonth());
    }

    @Test
    public void testGetCurrentDay() throws Exception {
        assertEquals(29, DateUtil.getCurrentDay());
    }

    private Date testDate(String date) throws Exception {
        Date testDate = DateUtil.stringToDate(date, "yyyyMMdd");
        return testDate;
    }

    @Test
    public void testIsEndOfSeason() throws Exception {
        assertTrue(DateUtil.isEndOfSeason(testDate("20150802")));
        assertFalse(DateUtil.isEndOfSeason(testDate("20151202")));
    }

    @Test
    public void testGetYear() throws Exception {
        assertEquals(2015, DateUtil.getYear(testDate("20150902")));
    }

    @Test
    public void testGetMonth() throws Exception {
        assertEquals(9, DateUtil.getMonth(testDate("20150902")));
    }

    @Test
    public void testGetDay() throws Exception {
        assertEquals(2, DateUtil.getDay(testDate("20150902")));
    }

    @Test
    public void testDateToString() throws Exception {
        assertEquals("20150902", DateUtil.dateToString(testDate("20150902"), "yyyyMMdd"));
        assertEquals("2015-09-02", DateUtil.dateToString(testDate("20150902"), "yyyy-MM-dd"));

    }
}