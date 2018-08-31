package com.ruiyou;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.pojo.User;

/**
 * Map 排序
 * @author Gzq
 *
 */
public class MapSort {
	public static void main(String[] args) {
		Map<String,User> map = new HashMap<>();
		User user = new User("06", 8);
		User user1 = new User("02", 5);
		User user2 = new User("03", 2);
		map.put("5",user);
		map.put("8",user1);
		map.put("2",user2);
		HashMap map2 = map(map);
		System.out.println(map2);
	}
	
	private static HashMap map(Map<String,User> map) {
		
		Set<Entry<String, User>> entrySet = map.entrySet();
		List<Entry<String, User>> list = new ArrayList<Entry<String, User>>(entrySet);
		Collections.sort(list, new Comparator<Entry<String, User>>() {
			@Override
			public int compare(Entry<String, User> arg0,
					Entry<String, User> arg1) {
				return arg0.getValue().getAge()-arg1.getValue().getAge();
			}
		});
		System.out.println(list);
		LinkedHashMap<String, User> map1 = new LinkedHashMap<String, User>();
		list.forEach(a -> {
			map1.put(a.getKey(),a.getValue());
		});
		return map1;
	}
}