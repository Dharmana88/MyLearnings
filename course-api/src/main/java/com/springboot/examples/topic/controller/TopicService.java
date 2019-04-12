package com.springboot.examples.topic.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	 List<Topic> listTopics = new ArrayList<>(Arrays.asList(new Topic("1", "java", "core java"), new Topic("2", "j2ee", "j2eee"),
			new Topic("3", "spring", "springg")));

	public List<Topic> getAllTopics() {
		return listTopics;
	}
	
	
	public Topic getTopic(String id) {
		
		/*
		 * Topic t =null; for (Topic topic : listTopics) { if
		 * (id.equalsIgnoreCase(topic.getId())) { t= topic; } }
		 * 
		 * 
		 * return t;
		 */
		
		return listTopics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}


	public Topic addTopic(Topic topic) {
		System.out.println("in service");
		listTopics.add(topic);
		return topic;
		
		//return new Topic("4", "springmvc", "springmvc");
	}


	public void updateTopic(Topic topic, String id) {

		for (int i = 0; i < listTopics.size(); i++) {

			Topic t = listTopics.get(i);
			if (t.getId().equalsIgnoreCase(id)) {
				listTopics.set(i, topic);
				return;
			}
		}

	}


	public void deleteTopic(Topic topic, String id) {
		listTopics.removeIf(t -> t.getId().equalsIgnoreCase(id));
		
		/*
		 * for (int i = 0; i < listTopics.size(); i++) {
		 * 
		 * Topic t = listTopics.get(i); if (t.getId().equalsIgnoreCase(id)) {
		 * listTopics.remove(i); return; } }
		 */

	}
	
	
}
