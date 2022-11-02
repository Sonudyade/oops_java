package com.qac.corejava.Collection.ProjectGroceryShop.DTO;

public class ProductDTO {
	String NameOfProduct;
	double MRPrice;
	long BarCodeNumber;
	ManufacturerCompanyDTO dto;
	Boolean IsVeg;
	String ManufacturingDate;
	String ExpireDate;
	int Quantity;
	
	public ProductDTO() {
		System.out.println("Invoking ProductDTO constructor");
	}

	public String getNameOfProduct() {
		return NameOfProduct;
	}

	public void setNameOfProduct(String nameOfProduct) {
		NameOfProduct = nameOfProduct;
	}

	public double getMRPrice() {
		return MRPrice;
	}

	public void setMRPrice(double mRPrice) {
		MRPrice = mRPrice;
	}

	public long getBarCodeNumber() {
		return BarCodeNumber;
	}

	public void setBarCodeNumber(long barCodeNumber) {
		BarCodeNumber = barCodeNumber;
	}

	public ManufacturerCompanyDTO getDto() {
		return dto;
	}

	public void setDto(ManufacturerCompanyDTO dto) {
		this.dto = dto;
	}

	public Boolean getIsVeg() {
		return IsVeg;
	}

	public void setIsVeg(Boolean isVeg) {
		IsVeg = isVeg;
	}

	public String getManufacturingDate() {
		return ManufacturingDate;
	}

	public void setManufacturingDate(String manufacturingDate) {
		ManufacturingDate = manufacturingDate;
	}

	public String getExpireDate() {
		return ExpireDate;
	}

	public void setExpireDate(String expireDate) {
		ExpireDate = expireDate;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	

}
