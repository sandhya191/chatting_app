package com.info.database;

import java.util.HashMap;
import java.util.Map;

import com.info.model.Message;
import com.info.model.Profile;

/**
 * 
 * @author Sandhya
 * DateBase class of Restful Web Services
 * In this class messages, profiles of Services
 *
 */


public class DatabaseClass {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();

	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}

	

}
