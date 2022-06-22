package entity;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @ClassName Detail
 * @Author caodz
 * @Date 2022/6/20
 **/
public class Detail1 {

    int eventType;

    int userId;

    int deviceCode;

    int channel;

    Date eventTime;

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(int deviceCode) {
        this.deviceCode = deviceCode;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }


}
