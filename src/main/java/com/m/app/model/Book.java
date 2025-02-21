package com.m.app.model;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class Book {
	private String name;
	private String[] authors;
	private LocalDate dateOfPublishing;
	private int cost;
}
