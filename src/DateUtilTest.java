import org.junit.Test;

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
        System.out.println(DateUtil.getCurrentYear());
    }

    @Test
    public void testGetCurrentMonth() throws Exception {
        System.out.println(DateUtil.getCurrentMonth());
    }

    @Test
    public void testGetCurrentDay() throws Exception {
        System.out.println(DateUtil.getCurrentDay());
    }
}