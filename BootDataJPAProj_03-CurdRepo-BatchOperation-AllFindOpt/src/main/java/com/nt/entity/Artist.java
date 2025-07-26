package com.nt.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
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
@NoArgsConstructor
@RequiredArgsConstructor
public class Artist {
     
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "ARTIST_SEQ", allocationSize = 121)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen1")
	private Integer id;
	@NonNull
    private String name;
	@NonNull
	private String category;
	@NonNull
	private Double fee;
}
