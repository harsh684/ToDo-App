package com.example.ToDoApp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ToDoApp.model.ToDo;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>{

	
//	public List<ToDo> getAllToDoItems();
//	
//	public ToDo getToDoItemById(Long id);
//	
//	public boolean updateStatus(Long id);
//	
//	public boolean saveOrUpdateToDoItem(ToDo todo);
//	
//	public boolean deleteToDoItem(Long id);
}
