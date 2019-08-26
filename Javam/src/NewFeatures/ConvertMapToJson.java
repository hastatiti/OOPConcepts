package NewFeatures;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.google.gson.Gson;

public class ConvertMapToJson {
	public static void main(String[] args) {
		Map<String, String> elements = new HashMap<>();
		elements.put("Key1", "Value1");
		elements.put("Key2", "Value2");
		elements.put("Key3", "Value3");
		// JSONObject json = new JSONObject(elements);
		//
		// System.out.println(json);
		Gson gson = new Gson();
		String json = gson.toJson(elements);
		System.out.println(json);
	}
}
