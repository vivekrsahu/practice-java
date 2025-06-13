package practice.corejava.collection.common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This class shows that for HashMap, the old value is replaced by the newer one, if the key is already present.
 * But for HashSet, the new entry is not added and return false, if the entry is already present.<br>
 * HashSet internally calls HashMap and its add method checks whether the put method of HashMap has returned any 
 * value (i.e., key already present) i.e., not null and hence it doesn't add the new entry and return false.
 * 
 * @author Vivek Ranjan Sahu
 */
public final class MapVSSet {
	public static void main(String[] args) {
		Set<KeyClass> set = new HashSet<>();
		set.add(new KeyClass("Vivek", "747"));
		set.add(new KeyClass("Vivek", "668823"));
		System.out.println("Set: " + set);
		Map<String, String> map = new HashMap<>();
		map.put("Vivek", "747");
		map.put("Vivek", "668823");
		System.out.println("Map: " + map);
	}
}

/**
 * A pojo class with default implementation that would be used as a key for HashMap and HashSet.
 * 
 * @author Vivek Ranjan Sahu
 */
final class KeyClass {
	private final String key;
	private final String value;
	public KeyClass(String key, String value) {
		this.key = key;
		this.value = value;
	}
	public String getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		return key.equals(((KeyClass) obj).key);
	}
	@Override
	public String toString() {
		return key + "=" + value;
	}
}