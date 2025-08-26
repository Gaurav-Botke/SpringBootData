package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ARTIST_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artist {
    
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String category;
	private Double fee;
}
