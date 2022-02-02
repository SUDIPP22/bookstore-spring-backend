package com.bookstore.app.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Wish_List")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wishlist {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int wishId;
	    
//	    @JsonIgnoreProperties(value= {"hibernateLazyInitializer","applications"})
//		@ManyToOne(fetch=FetchType.LAZY)
//		@JoinColumn(name="user")
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="user")
		private UserEntity user;
		
//		@JsonIgnoreProperties(value= {"hibernateLazyInitializer","applications"})
//		@ManyToOne(fetch=FetchType.LAZY)
//		@JoinColumn(name="book")
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="book")
		private BookEntity book;
}
