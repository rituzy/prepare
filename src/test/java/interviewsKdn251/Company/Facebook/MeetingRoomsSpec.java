package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 20.04.2017.
 */
public class MeetingRoomsSpec {
    @Test
    public void isAttendTest() throws Exception {
        MeetingRooms.Interval[] intervalsFalse = {new MeetingRooms.Interval(0,30), new MeetingRooms.Interval(5,10),
                                             new MeetingRooms.Interval(15,20)};
        MeetingRooms.Interval[] intervalsTrue = {new MeetingRooms.Interval(0,5), new MeetingRooms.Interval(5,10),
                new MeetingRooms.Interval(15,20), new MeetingRooms.Interval(25,40)};
        Assert.assertFalse(MeetingRooms.isAttend(intervalsFalse));
        Assert.assertTrue(MeetingRooms.isAttend(intervalsTrue));

    }

}