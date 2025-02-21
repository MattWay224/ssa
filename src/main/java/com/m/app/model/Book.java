package com.m.app.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "books")
public class Book {
	@Id
	@Qualifier
	@GeneratedValue
	private int id;
	private String name;
	private String author;
	private LocalDate dateOfPublishing;
	private int cost;
}
