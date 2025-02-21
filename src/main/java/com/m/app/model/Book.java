package com.m.app.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
public class Book {
	private String name;
	private String[] authors;
	private LocalDate dateOfPublishing;
	private int cost;
	private int id;
}
