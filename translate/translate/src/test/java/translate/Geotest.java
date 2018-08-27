package translate;

import net.sf.json.JSONObject;

import org.junit.Test;

import com.translate.utils.HttpClientUtil;

public class Geotest {
	@Test
	public void Geo() {
		String url = "http://localhost:8082/translate/geo?lat=121.515368&lon=31.303285";
		String formatted_address = HttpClientUtil.getInstance().doGetRequest(url);
		System.out.println(formatted_address);
	}
}
