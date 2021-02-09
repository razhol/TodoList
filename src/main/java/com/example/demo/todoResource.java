package com.example.demo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@EnableSwagger2



@CrossOrigin(origins= "http://localhost:4200")
@RestController 
public class todoResource {
	
	@Autowired
	private TodoService service;
	
	
	@PostMapping("/addTodo")
	public Todo addTodo(@RequestBody Todo todo) {
		return service.saveTodo(todo);	
	}
	
	@PostMapping("/addTodos")
	public List<Todo> addTodo(@RequestBody List<Todo> todos) {
		return service.saveTodos(todos);	
	}
	
	@GetMapping("/Todos")
	List<Todo> findAllTodos(){
		return service.getTodos();
	}
	
	@GetMapping("/Todos/{item_number}")
	public Todo findTodoByItemNo(@PathVariable int item_number) {
		return service.getTodosByItemNo(item_number);
	}
	
	
	@PutMapping("/Withdrawal/{item_number}/{amount}")
	public Todo WithdrawalQuantity(@PathVariable int item_number, @PathVariable int amount) {
	 return service.DecreaseAmount(item_number, amount);
	}
	
	@PutMapping("/Deposit/{item_number}/{amount}")
	public Todo DepositQuantity(@PathVariable int item_number, @PathVariable int amount) {
	 return service.AddAmount(item_number, amount);
	}
	
	@DeleteMapping("/delete/{item_number}")
	public void deleteItem(@PathVariable int item_number) {
		service.deleteItem(item_number);
	}
	

	
}
