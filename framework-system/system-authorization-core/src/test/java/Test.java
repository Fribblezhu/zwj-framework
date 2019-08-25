import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/21/19
 * @Time: 3:30 PM
 * @description:
 */
public class Test {


    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //2019-06-19 09:54:35
        calendar.set(2019,5,19,0,0,0);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(format.format(new Date(calendar.getTimeInMillis() + 2910975L)));
    }
}
