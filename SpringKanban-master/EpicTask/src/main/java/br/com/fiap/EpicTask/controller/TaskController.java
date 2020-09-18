package br.com.fiap.EpicTask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/task")
public class TaskController {
	@Autowired	
	private TaskRepository repository;
	

	@GetMapping
	public String tasks() {
		return "tasks";
	}
}
