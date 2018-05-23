package components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cucumber.api.Scenario;

public class TestVariables {
	private Map<String, String> varStrings = new HashMap<>();
	private Map<String, Boolean> varBoolean = new HashMap<>();
	private Map<String, List<String>> varListString = new HashMap<>();
	private Map<String, Long> varLongs = new HashMap<>();
	private Map<String, Scenario> varScenario = new HashMap<>();
	
	public void addTo(String key, String value) {
		if (!varListString.containsKey(key)) {
			varListString.put(key, new ArrayList<>());
		}
		varListString.get(value).add(value);
	}
	
	public void set(String key, String value) {
		varStrings.put(key, value);
	}
	
	public void set(String key, Boolean value) {
		varBoolean.put(key, value);
	}
	
	public void set(String key, List<String> value) {
		varListString.put(key, value);
	}
	
	public void set(String key, Long value) {
		varLongs.put(key, value);
	}
	
	public void write(String key, Scenario value) {
		value.write(key);
		varScenario.put(key, value);
	}
	
	public String get(String key) {
		return varStrings.get(key);
	}
	
	public Boolean getBoolean(String key) {
		return varBoolean.get(key);
	}
	
	public List<String> getList(String key) {
		return varListString.get(key);
	}
	
	public Long getLong(String key) {
		return varLongs.get(key);
	}
	
	
}
