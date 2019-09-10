/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StringUtil.java 
 * @Prject: yn-exam9.10
 * @Package:  
 * @Description: TODO
 * @author: 闫sir   
 * @date: 2019年9月10日 上午9:56:13 
 * @version: V1.0   
 */

/** 
 * @ClassName: 工具类 
 * @Description: TODO
 * @author: 闫sir
 * @date: 2019年9月10日 上午9:56:13  
 */
public class StringUtil {

	public static String show() {
		String str = "\"* Because TreeNodes are about twice the size of regular nodes, we\\r\\n\" + \r\n" + 
				"				\"     * use them only when bins contain enough nodes to warrant use\\r\\n\" + \r\n" + 
				"				\"     * (see TREEIFY_THRESHOLD). And when they become too small (due to\\r\\n\" + \r\n" + 
				"				\"     * removal or resizing) they are converted back to plain bins.  In\\r\\n\" + \r\n" + 
				"				\"     * usages with well-distributed user hashCodes, tree bins are\\r\\n\" + \r\n" + 
				"				\"     * rarely used.  Ideally, under random hashCodes, the frequency of\\r\\n\" + \r\n" + 
				"				\"     * nodes in bins follows a Poisson distribution\\r\\n\" + \r\n" + 
				"				\"     * (http://en.wikipedia.org/wiki/Poisson_distribution) with a\\r\\n\" + \r\n" + 
				"				\"     * parameter of about 0.5 on average for the default resizing\\r\\n\" + \r\n" + 
				"				\"     * threshold of 0.75, although with a large variance because of\\r\\n\" + \r\n" + 
				"				\"     * resizing granularity. Ignoring variance, the expected\\r\\n\" + \r\n" + 
				"				\"     * occurrences of list size k are (exp(-0.5) * pow(0.5, k) /\\r\\n\" + \r\n" + 
				"				\"     * factorial(k)). The first values are\\r\\n\" + \r\n" + 
				"				\"\"";
		
		
		System.out.println(str.substring(1));
		String[] split = str.split("b");
		for (String string : split) {
			System.out.println(string);
		}
		String[] split2 = str.split("a");
		for (String string : split2) {
			
			System.out.println(string);
		}
		String[] split3 = str.split("c");
		int i = 0;
		for (String string : split3) {
			i++;
			System.out.println(i);
		}
		return "";
		
		
	}
}
