//package com.mwf.forum.model;
//
//import java.util.List; 
//import javax.persistence.Entity; 
//import javax.persistence.FetchType; 
//import javax.persistence.GeneratedValue; 
//import javax.persistence.GenerationType; 
//import javax.persistence.Id; 
//import javax.persistence.JoinColumn; 
//import javax.persistence.OneToMany;
//
//@Entity
//public class Client {
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)    
//	private Long id;
//	
//	private String name;
//
//	private String address;
//	
//	private String cardId;
//
//	@OneToMany(targetEntity=Purchase.class, fetch=FetchType.EAGER)
//	@JoinColumn(name="client_id")
//	private List<Purchase> purchases;
//	
//	public Long getId() {
//		  return id;
//	}
//
//	public void setId(Long id) {
//		  this.id = id;
//	}
//
//	public String getName() {
//		  return name;
//	}
//
//	public void setNome(String name) {
//		  this.name = name;
//	}
//
//	public String getAddress() {
//		  return address;
//	}
//
//	public void setAddress(String address) {
//		  this.address = address;
//	}
//
//	public String getCardId() {
//		  return cardId;
//	}
//
//	public void setCardId(String cardId) {
//		  this.cardId = cardId;
//	}
//
//	public List<Purchase> getPurchases() {
//		  return purchases;
//	}
//
//	public void setPurchases(List<Purchase> purchases) {
//		  this.purchases = purchases;
//	}
//}