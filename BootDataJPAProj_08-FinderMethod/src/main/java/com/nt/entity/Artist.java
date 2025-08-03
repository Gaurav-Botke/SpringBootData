package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="ARTIST_INFO")
@Data
@AllArgsConstructor

@RequiredArgsConstructor
public class Artist {
	
	@Id
	private Integer id;
	@NonNull
     private String name;
	@NonNull
     private String category;
	@NonNull
     private Double fee;
	
	public Artist() {
		System.out.println("Artist :: 0-param Constructor ");
	}
	
	
}
