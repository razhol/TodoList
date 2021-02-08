package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	@Autowired
	private TodoJpaRepository repository;
	
   public Todo saveTodo(Todo todo) {
	return repository.save(todo);
	   
   }
   
   public List<Todo> saveTodos(List<Todo> todos) {
	   
	return repository.saveAll(todos);
	   
   }
   
  public List <Todo> getTodos(){
	  return repository.findAll();
  }
  
  public Todo getTodosByItemNo(int item_number){
	  return repository.findById(item_number).orElse(null);
  }
  
  public void deleteItem(int item_number) {
	  repository.deleteById(item_number);
	  
  }
  
//  public Todo updateTodo(Todo todo) {
//	  Todo exitingTodo = repository.findById(todo.getItem_number()).orElse(null);
//	  exitingTodo.setAmount(todo.getAmount());
//	  exitingTodo.setInventory_code(todo.getInventory_code());
//	  exitingTodo.setName(todo.getName());
//	  return repository.save(exitingTodo);
//  }
  




public Todo AddAmount(int item_number, int Amount) {
	 Todo exitingTodo = repository.findById(item_number).orElse(null);
	  exitingTodo.setAmount(exitingTodo.getAmount()+Amount); 
	return repository.save(exitingTodo);
	
}

public Todo DecreaseAmount(int item_number, int Amount) {
	 Todo exitingTodo = repository.findById(item_number).orElse(null);
	  exitingTodo.setAmount(exitingTodo.getAmount()-Amount);
	  if(exitingTodo.getAmount()<0) {
		  exitingTodo.setAmount(0);
	  }
	return repository.save(exitingTodo);
}









}

