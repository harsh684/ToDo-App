package com.example.ToDoApp.model;

import java.time.LocalDate;

import org.hibernate.annotations.Columns;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="todo")
public class ToDo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NonNull
	private Long id;
	
	@Column
	@NonNull
	private  String title;
	
	@Column
	@NonNull
	private LocalDate date;
	
	@Column
	@NonNull
	private String status;
	
	public ToDo() {
		
	}
	
	public ToDo(Long id, String title, LocalDate date, String status) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", title=" + title + ", date=" + date + ", status=" + status + "]";
	}
	
}
