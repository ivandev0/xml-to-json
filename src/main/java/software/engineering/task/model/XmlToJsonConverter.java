package software.engineering.task.model;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class XmlToJsonConverter {
    public static String convert(String xml) throws JSONException {
        JSONObject json = XML.toJSONObject(xml);
        return json.toString();
    }
}
