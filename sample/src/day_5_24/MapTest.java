package day_5_24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		Map<String, String> map1 = new HashMap();
		map1.put("url", "jdbc:oracle:thin:@127.0.01:1521");
		map1.put("user", "hr");
		map1.put("pw", "hr");
		map1.put("driver", "oracle.jdbc.OracleDriver");

		System.out.println(map1);
		System.out.println(map1.get("driver"));

		Iterator<String> i = map1.keySet().iterator();
		while (i.hasNext()) {
			String key = i.next();
			System.out.println(key + " = " + map1.get(key));
		}

	}

}
