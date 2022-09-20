package com.qac.corejava.oops.Inheritance.relations.HasA;


	public class Bike {
		
		private String brandName;
		private String modelName;
		private int cost;
		Engine engine;
		
			
		public String getBrandName() {
			return brandName;
		}
		
		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}
		
		public String getModelName() {
			return modelName;
		}
		
		public void setModelName (String modelName) {
			this.modelName = modelName;
		}
		
		public int getCost() {
			return cost;
		}
		
		public void setCost(int cost) {
			this.cost = cost;
		}
		
		public Engine getEngine() {
			return engine;
		}
		
		public void setEngine(Engine engine) {
			this.engine = engine;
		}
	}



