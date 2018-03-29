package com.wodesh.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * Created by TS on 2018/3/29.
 */
public class DateUtil {

    /**
     * 默认日期格式(yyyy-MM-dd)
     */
    public static final String DATE_DEFAULT = "yyyy-MM-dd";

    /**
     * 默认日期格式(yyyy-MM)
     */
    public static final String DATE_DEFAULT_SHORT = "yyyy-MM";

    /**
     * 默认日期时间格式（yyyy-MM-dd HH:mm）
     */
    public static final String DATETIME_DEFAULT_SHORT = "yyyy-MM-dd HH:mm";

    /**
     * 默认日期时间格式（yyyy-MM-dd HH:mm:ss）
     */
    public static final String DATETIME_DEFAULT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 默认时间格式(HH:mm)
     */
    public static final String TIME_DEFAULT_SHORT = "HH:mm";

    /**
     * 默认时间格式(HH:mm:ss)
     */
    public static final String TIME_DEFAULT = "HH:mm:ss";

    private static Calendar calendar = Calendar.getInstance();

    /**
     * 默认时间模板获取当前时间 时间（yyyy-MM-dd HH:mm:ss）
     * @return
     */
    public static String dateDefault(){
        SimpleDateFormat fmat = new SimpleDateFormat(DATETIME_DEFAULT);
        Date date = new Date(System.currentTimeMillis());
        return fmat.format(date).toString();
    }

    /**
     * 按一定格式获取当前时间
     * @param mat 时间模板
     * @return
     */
    public static String dateForFormat(String mat){
        SimpleDateFormat fmat = new SimpleDateFormat(mat);
        Date date = new Date(System.currentTimeMillis());
        return fmat.format(date).toString();
    }

    /**
     * 根据时间戳和固定模板 获取时间字串
     * @param time
     * @param mat
     * @return
     */
    public static String dateForFormat(long time , String mat){
        SimpleDateFormat fmat = new SimpleDateFormat(mat);
        Date date = new Date(time);
        return fmat.format(date).toLowerCase();
    }

    /**
     * 将时间模板   转化为毫秒"yyyy-MM-dd HH:mm:ss"
     * @param time
     * @return
     */
    public static long formatForDateLong(String time , String formatStr){
        SimpleDateFormat format =  new SimpleDateFormat(formatStr);
        long dateL = 0;
        try{
            Date date = format.parse(time);
            dateL = date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateL;
    }
}
