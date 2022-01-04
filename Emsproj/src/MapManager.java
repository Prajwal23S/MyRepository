import java.util.*;

public class MapManager {
public static Set<String> getKeys(HashMap<String, String> hm)
{
	Set<String> data = new HashSet<String>();
	data=hm.keySet();
	return data;

}
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "Abhi");
		hm.put("2", "Vicky");
		hm.put("3", "Raja");
		hm.put("Mahesh", "4");
		hm.put("5", "rohit");
		System.out.println("Key values: "+getKeys(hm));
	}

}
