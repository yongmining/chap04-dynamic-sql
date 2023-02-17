package com.greedy.common;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
//@Data
public class MenuDTO {

	private int code;
	private String name;
	private int price;
	private int categoryCode;
	private String orderableStatus;
	


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getOrederableStatus() {
		return orderableStatus;
	}

	public void setOrederableStatus(String orederableStatus) {
		this.orderableStatus = orederableStatus;
	}

	@Override
	public String toString() {
		return "MenuDTO [code=" + code + ", name=" + name + ", price=" + price + ", categoryCode=" + categoryCode
				+ ", orederableStatus=" + orderableStatus + "]";
	}
	
}
