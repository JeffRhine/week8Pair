package com.techelevator.ssg.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.forum.ForumDao;
import com.techelevator.ssg.model.forum.ForumPost;

@Controller
public class ForumController {
	
	@Autowired
	ForumDao forumDao;
	
	@RequestMapping(path="/forum",method=RequestMethod.GET)
	public String showAllPosts(ModelMap modelHolder){
		List<ForumPost> posts = forumDao.getAllPosts();
		modelHolder.put("allPosts", posts);
		
		return "forumPosts";		
	}
	@RequestMapping(path={"/forumInput"}, method=RequestMethod.GET)
	public String goToForumInput(){
		return "forumInput";
	}
	
	@RequestMapping(path="/forumNewPost", method=RequestMethod.POST)
	public String forumInput(@ModelAttribute ForumPost newPost) {
	newPost.setDatePosted(LocalDateTime.now());
	forumDao.save(newPost);
	return "redirect:/forum";
	}
}
