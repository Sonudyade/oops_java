package com.qac.corejava.oops.Inheritance.relations;

import com.qac.corejava.oops.Inheritance.relations.HasA.Bike;
import com.qac.corejava.oops.Inheritance.relations.HasA.Engine;

         public class TestBike {
        	 
           public static void main(String[] args) {
		
		Bike bmwrr310 = new Bike();
		bmwrr310.setBrandName("BMW");
		bmwrr310.setModelName("rr310");
		bmwrr310.setCost(300000);
		bmwrr310.setEngine(null);
		
		Engine engine = new Engine();
		engine.setBrandName("BMW");
		engine.setCapacity((short)312);
		engine.setNoOfStrokes((byte)4);
		
		bmwrr310.setEngine(engine);
		
		System.out.println(bmwrr310.getBrandName());
		System.out.println(bmwrr310.getModelName());
		System.out.println(bmwrr310.getCost());
		System.out.println(bmwrr310.getEngine());
	}

}



