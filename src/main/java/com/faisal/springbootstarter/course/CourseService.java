package com.faisal.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
 
	@Autowired
	private CourseRepository courseRepository;

	public Course getCourseById(String id) {

		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(String id, Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}

	public List<Course> findByTopicId(String id) {
		return courseRepository.findByTopicId(id);
	}
}
