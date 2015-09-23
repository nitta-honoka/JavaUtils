import static java.lang.System.*;

/**
 * 常用功能
 * @author honoka
 */
public class ToolUtil {
	/**
	 * 判断对象是否非空
	 * @author honoka
	 * @param obj
	 * @return
	 */
	public static boolean isNotEmpty(Object obj) {

		return (null != obj)&&(!"".equals(obj.toString()));
	}
}