package com.faisal.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("spring", "Spring Framework", "Framework description"),
			new Topic("java", "java j2ee", "Framework description"),
			new Topic("spring mvc", "Spring Framework", "mvc description")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopicById(String id) {

		for (Topic topic : topics) {
			if (topic.getId().equals(id))
				return topic;
		}
		return null;

		// Lambda expression syntax

//		topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(int i=0;i<topics.size();i++){
			if(topics.get(i).getId().equals(id)){
				topics.set(i, topic);
				break;
			}
		}
		
	}

	public void deleteTopic(String id) {
		for(int i=0;i<topics.size();i++){
			if(topics.get(i).getId().equals(id)){
				topics.remove(i);
				break;
			}
		}
	}
}
