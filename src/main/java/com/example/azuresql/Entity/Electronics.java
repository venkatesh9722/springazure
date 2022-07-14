package com.example.azuresql.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor@NoArgsConstructor
@Table(name="Electronics")
public class Electronics {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String categery;
	private double price;
}
