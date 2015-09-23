/**
 * 常用功能工具类
 * @author honoka
 */
public class ToolUtil {
	/**
	 * 判断传入的对象是否为空
	 * @author honoka
	 * @param obj
	 * @return
	 */
	public static boolean isNull(Object obj){
		return (obj==null);
	}
	
	/**
	 * 判断对象是否非空
	 * @author honoka
	 * @param obj
	 * @return
	 */
	public static boolean isNotNull(Object obj){
		return (null!=obj);
	}
	
	/**
	 * 判断对象是否非空，且是否非空字符串
	 * @author honoka
	 * @param obj
	 * @return
	 */
	public static boolean isNotEmpty(Object obj){
		return (null!=obj)&&(!"".equals(obj.toString()));
	}
}