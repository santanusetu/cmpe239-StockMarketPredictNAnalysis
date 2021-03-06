package org.stockmaketprediction.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.jar.JarOutputStream;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import twitter4j.JSONArray;
import twitter4j.JSONException;
import twitter4j.JSONObject;
import twitter4j.OEmbedRequest;
import twitter4j.Paging;
import twitter4j.Query;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.api.*;
import twitter4j.conf.*;
import twitter4j.json.DataObjectFactory;

@RestController
public class TwitterUserStatus implements Serializable {

	ConfigurationBuilder configurationBuilder;
	TwitterFactory twitterFactory;

	public TwitterUserStatus() {
		configurationBuilder = new ConfigurationBuilder();
		configurationBuilder.setDebugEnabled(true).setOAuthConsumerKey("TNdCsNsUa2tV11R6GbsbIRlO5")
				.setOAuthConsumerSecret("C14sPoToL0lSJM8LI7flQVmFffaf2nXOGZ5V2MwO3hx4dJu9kh")
				.setOAuthAccessToken("3273447385-x6MOVQQwcwttZh0w6ZT2lKt3eM8gm8gEbE89Xug")
				.setOAuthAccessTokenSecret("iC4vir6BzlDSHShS762wnerOACEcrfsqXIWcXe70sMyHp").setJSONStoreEnabled(true);
		twitterFactory = new TwitterFactory(configurationBuilder.build());

	}

	@RequestMapping(value = "/", method = { RequestMethod.GET })
	public List<String> ListStatus()
			throws TwitterException, JSONException, JsonGenerationException, JsonMappingException, IOException {

		Twitter twitter = twitterFactory.getInstance();
		String users = "@Nasdaq";
		String[] userList = users.split(",");
		List<String> twittesList = new ArrayList<String>();
		for (String user : userList) {
			List<Status> statusList = twitter.getUserTimeline(users, new Paging(1, 1000));
			ObjectMapper mapper = new ObjectMapper();
			int len = statusList.size();
			for (Status status : statusList) {
				twittesList.add(status.getCreatedAt() + "--->" + status.getText());
			}

		}
		System.out.println(twittesList.toString());
		return twittesList;
	}

	@RequestMapping(value = "/trend", method = { RequestMethod.GET })
	public List<String> trend20()
			throws TwitterException, JSONException, JsonGenerationException, JsonMappingException, IOException {

		Twitter twitter = twitterFactory.getInstance();
		String users = "@Nasdaq";
		String[] userList = users.split(",");
		List<String> twittesList = new ArrayList<String>();
		for (String user : userList) {
			List<Status> statusList = twitter.getUserTimeline(users, new Paging(1, 20));
			ObjectMapper mapper = new ObjectMapper();
			int len = statusList.size();
			for (Status status : statusList) {
				twittesList.add(status.getCreatedAt() + "--->" + status.getText());
			}

		}
		System.out.println(twittesList.toString());
		return twittesList;
	}

	public static void main(String[] args) {
		/*
		 * TwitterUserStatus t = new TwitterUserStatus(); try { List<String>
		 * twittesList=t.ListStatus("",2); for (String string : twittesList) {
		 * System.out.println(string); } } catch (TwitterException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } catch (Exception e)
		 * { // TODO: handle exception System.out.println(e.getMessage()); }
		 */
	}

}
