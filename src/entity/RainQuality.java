package entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:Michelle
 * @Description:
 * @Date:Created in 2020/2/18 9:58
 * @Modified By:
 */
public class RainQuality implements Serializable{
    private int id;
    private String districName;
    private Date monitorTime;
    private int rain;
    private  String monitoringStation;
    private String monitoringAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistricName() {
        return districName;
    }

    public void setDistricName(String districName) {
        this.districName = districName;
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public int getRain() {
        return rain;
    }

    public void setRain(int rain) {
        this.rain = rain;
    }

    public String getMonitoringStation() {
        return monitoringStation;
    }

    public void setMonitoringStation(String monitoringStation) {
        this.monitoringStation = monitoringStation;
    }

    public String getMonitoringAddress() {
        return monitoringAddress;
    }

    public void setMonitoringAddress(String monitoringAddress) {
        this.monitoringAddress = monitoringAddress;
    }
}
