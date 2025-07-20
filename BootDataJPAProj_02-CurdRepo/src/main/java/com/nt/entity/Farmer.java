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
import lombok.NoArgsConstructor;

@Entity
@Table(name="FARMER_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Farmer {
   
	@Id
	@SequenceGenerator(name="gen2",sequenceName = "FARMER_SEQ",allocationSize = 1,initialValue = 1000)
	@GeneratedValue(generator="gen2",strategy = GenerationType.SEQUENCE)
	private Integer id;
	@Column(length=30)
	private String name;
	private String scheme;
	@Column(length=30)
	private boolean status;
}
