
package com.nielsmasdorp.speculum.models.yahoo_weather;

import java.util.HashMap;
import java.util.Map;

public class Channel {

    public String title;
    public String link;
    public String description;
    public String language;
    public String lastBuildDate;
    public String ttl;
    public Location location;
    public Units units;
    public Wind wind;
    public Atmosphere atmosphere;
    public Astronomy astronomy;
    public Image image;
    public Item item;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
