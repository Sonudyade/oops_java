package com.qac.corejava.Collection.ProjectGroceryShop;

import com.qac.corejava.Collection.ProjectGroceryShop.DAO.GroceryShopDAO;
import com.qac.corejava.Collection.ProjectGroceryShop.DTO.AddressDTO;
import com.qac.corejava.Collection.ProjectGroceryShop.DTO.ManufacturerCompanyDTO;
import com.qac.corejava.Collection.ProjectGroceryShop.DTO.ProductDTO;

public class Tester {
	public static void main(String[] args) {
		
		ProductDTO productdto = new ProductDTO();
		productdto.setNameOfProduct("Maggi");
		productdto.setMRPrice(20);
		productdto.setIsVeg(true);
		productdto.setDto(null);
		productdto.setBarCodeNumber((long)556001130);
		productdto.setManufacturingDate("4/6/2021");
		productdto.setExpireDate("22/12/2024");
		productdto.setQuantity(100);
		
		ManufacturerCompanyDTO manufacturerCompanyDTO = new ManufacturerCompanyDTO();
		manufacturerCompanyDTO.setCompanyName("Nestle");
		manufacturerCompanyDTO.setContactNo(335678890);
		manufacturerCompanyDTO.setMailId("WeCare@in.nestle.com");
		
		AddressDTO addressdto=new AddressDTO();
		addressdto.setBuildingNo("32");
		addressdto.setArea("Teachers colony");
		addressdto.setCity("Aurad");
		addressdto.setState("Karnataka");
		addressdto.setCountry("India");
		addressdto.setZipcode(585326);
		
		GroceryShopDAO dao=new GroceryShopDAO();
	
		String show= dao.removeProductByCompanyName("Maggi", "Nastle");
		System.out.println(show);
		
		ManufacturerCompanyDTO display = dao.getAllProductByCompanyName("Nastle");
		System.out.println(display);
		
		ProductDTO print =dao.getAllProductByNameOfProduct("Maggi");
		System.out.println(print);
		
		int check = dao.totalNumberOfProduct();
		System.out.println(check);
		
		String take =dao.showAllProduct();
		System.out.println(take);
		
	
		


		
	}

}
