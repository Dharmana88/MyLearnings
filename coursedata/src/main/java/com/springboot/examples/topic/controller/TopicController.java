package com.springboot.examples.topic.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService service;

	@RequestMapping("/topic")
	public String topicDisplay() {
		return " topic";
	}

	@RequestMapping("/topics")
	public List<Topic> listOfTopicDisplay() {

		List<Topic> list = Arrays.asList(new Topic("1", "java", "core java"), new Topic("2", "j2ee", "j2eee"),
				new Topic("3", "spring", "springg"));

		/*
		 * List<Topic> list = new ArrayList<Topic>(); Topic t1 = new
		 * Topic("1","java","jaava"); Topic t2 = new Topic("2","j2ee","j2eee"); Topic t3
		 * = new Topic("3","spring","springg"); list.add(t1); list.add(t2);
		 * list.add(t3);
		 */
		return list;
	}

	@RequestMapping("/getAllTopics")
	public List<Topic> getAllTopics() {
		return service.getAllTopics();

	}

	@RequestMapping("/getAllTopics/{id}")
	public Topic getTopic(@PathVariable String id) {

		return service.getTopic(id);

	}
	
	@RequestMapping(method=RequestMethod.POST, value ="/getAllTopics")
	public void addTopic(@RequestBody Topic topic) {
		System.out.println("Start Added");
		Topic t= service.addTopic(topic);
		System.out.println("Added"+ t.getName());

	}
	
	@RequestMapping(method=RequestMethod.PUT, value ="/getAllTopics/{id}")
	public void upDateTopic(@RequestBody Topic topic,@PathVariable String id) {
		System.out.println("Start update");
		service.updateTopic(topic,id);
		System.out.println("updated");

	}
	
	@RequestMapping(method=RequestMethod.DELETE, value ="/getAllTopics/{id}")
	public void deleteTopic(@RequestBody Topic topic,@PathVariable String id) {
		System.out.println("Start Delete");
		service.deleteTopic(topic,id);
		System.out.println("Deleted");
	}
}
