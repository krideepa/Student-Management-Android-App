package com.jusms.misc.utils;

/**
 * Created by Coolalien on 3/11/2017.
 */

public class Constants {

    /**
     * Permission
     */
    public static final int PERMISSIONS_REQ = 1;

    public static final String IP = "192.168.0.100";

    /**
     * Server url
     *
     */

    /*
    public static final String LOGINURL = "http://192.168.0.100/attendance/login.php";
    public static final String INSERTATTEND = "http://192.168.0.100/attendance/insertAttendance.php";
    public static final String VIEWATTENDANCE = "http://192.168.0.100/attendance/viewAttendance.php";
    public static final String QUICKATTENDANCE = "http://192.168.0.100/attendance/quickAttendance.php";
    */
    
    public static final String LOGINURL = "http://"+ IP + "/attendance/login.php";
    public static final String INSERTATTEND = "http://"+ IP +"/attendance/insertAttendance.php";
    public static final String VIEWATTENDANCE = "http://"+ IP +"/attendance/viewAttendance.php";
    public static final String QUICKATTENDANCE = "http://"+ IP +"/attendance/quickAttendance.php";
    

    /**
     * pref
     */
    public static final String INOUROUT = "loggedIn";
    public static final String USERNAME = "username";
    public static final String STARTDATE = "startdate";
    public static final String ENDDATE = "enddate";
    public static final String ATDATA = "atdata";
    public static final String COUNTER = "counter";
    public static final String COUNTER2 = "counter1";
    public static final String DIV = "div";
    public static final String STATUS = "status";
    public static final String ROLLNO = "rollno";
    public static final String DATETIME = "dtime";
    public static final String UNSAVEDAT = "unsaved";
    public static final String FILTERAT = "filterat";

    public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";


}
