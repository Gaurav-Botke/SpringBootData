package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="ARTIST_INFO")         //optional annotation
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Artist {
	    
	   @Id
	   @Column(name="ID")                                     //optional Annotation
	  // @GeneratedValue(strategy = GenerationType.AUTO)
	   @SequenceGenerator(name="gen1",sequenceName = "ARTIST_SEQ",initialValue = 101,allocationSize = 1)
	   @GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
       private Integer id;
	   
	   @NonNull
	   @Column(name="NAME" ,length=30)
       private String name;
	   
	   @NonNull
	   @Column(name="CATEGORY",length=30)
       private String category;
	   
	   @NonNull
       private Double fee;
}
