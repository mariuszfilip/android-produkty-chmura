package com.example.produkty2;

public class ElementList {
	
	private String price;
	
	private String count_product;
	
	private String name;
	
	private Long id;
	
	public ElementList(Long long1,String name_input){
		setId(long1);
		setName(name_input);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long long1) {
		this.id = long1;
	}
	
	public String toString(){
		return name;
		
	}

	public String getCountProduct() {
		return count_product;
	}

	public void setCountProduct(String count_product) {
		this.count_product = count_product;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	

}
