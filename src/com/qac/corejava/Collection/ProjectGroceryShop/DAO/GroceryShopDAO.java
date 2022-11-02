package com.qac.corejava.Collection.ProjectGroceryShop.DAO;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.qac.corejava.Collection.ProjectGroceryShop.DTO.ManufacturerCompanyDTO;
import com.qac.corejava.Collection.ProjectGroceryShop.DTO.ProductDTO;
import com.qac.corejava.Collection.set.HashSet.BankAccountDtailsDTO;

public class GroceryShopDAO {
	
	HashSet<ProductDTO> set = new HashSet<ProductDTO>();
	public boolean save (ProductDTO dto) {
		set.add(dto);
		return dto.getNameOfProduct()+"data saved" != null;
	}
	
	public String removeProductByCompanyName(String productName, String companyName) {
		for(int i=0;i<set.size();i++) {
			if(set.equals(companyName)) {
				return companyName;
			}
		}
		return null;
		
		
	}
	TreeSet<ManufacturerCompanyDTO>treeset=new TreeSet<ManufacturerCompanyDTO>();
	public ManufacturerCompanyDTO getAllProductByCompanyName(String companyName) {
		for(ManufacturerCompanyDTO object:treeset) {
			if(object.getCompanyName().equals(companyName)) {
				return object;
			}
		}
		return null;
	}
	public ProductDTO getAllProductByNameOfProduct(String nameOfProduct) {
		for(ProductDTO object: set) {
			if(object.getNameOfProduct().equals(nameOfProduct)) {
				return object;
			}
		}
		return null;

		}
	public int totalNumberOfProduct() {
		for(ProductDTO object:set) {
			}
		return 1;
			
		}
	

	public String showAllProduct() {
		for(ProductDTO object:set) {
			System.out.println(object);
		}
		return null;
	}
}