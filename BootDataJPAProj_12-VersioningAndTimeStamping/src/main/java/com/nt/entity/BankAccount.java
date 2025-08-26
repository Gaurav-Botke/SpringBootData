package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="BANK_ACCOUNT2")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class BankAccount {
        
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accNo;
	
	@NonNull
	@Column(length=20)
	 private String name;
	
	@NonNull
	@Column(length = 20)
	 private String addr;
	

	@Version
	 private Integer version;
	
	
	@CreationTimestamp
	@Column(updatable = false)
	 private LocalDateTime acctOpen;
	
	
	
	//@UpdateTimestamp
	// private LocalDateTime acctModify;    // also we can used anothor form it only update when the data is modify not at the creation time
	
	 @Column(insertable = false, updatable = true)
	 private LocalDateTime acctModify;
	
	
	 @PreUpdate
	    public void onUpdate() {
	        this.acctModify = LocalDateTime.now();
	    }
	
	
	
	
		/*	🧠 Explanation:
			@PreUpdate runs only when an update occurs.
		
			@PrePersist runs only during the first insert.
		
			acctModify is not set on insert, and only set on update by manually assigning LocalDateTime.now().
			*/
	
	
	
	
	
	
}
