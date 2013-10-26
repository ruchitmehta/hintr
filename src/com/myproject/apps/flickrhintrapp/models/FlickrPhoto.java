package com.myproject.apps.flickrhintrapp.models;

import org.json.JSONException;
import org.json.JSONObject;

public class FlickrPhoto {
	
	private String title;
	private String url;
	private String uid;
	
	
	public FlickrPhoto(JSONObject jsonObject){
		try {
			title = jsonObject.getString("title");
			setTitle(jsonObject.getString("title"));
			uid = jsonObject.getString("id");
			setUrl("http://farm" + jsonObject.getString("farm") + ".staticflickr.com" + jsonObject.getString("server")
	                   + "/" + uid + "_" + jsonObject.getString("secret") + ".jpg");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUid() {
		return uid;
	}


	public void setUid(String uid) {
		this.uid = uid;
	}
}
