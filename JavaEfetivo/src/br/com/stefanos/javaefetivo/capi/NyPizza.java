package br.com.stefanos.javaefetivo.capi;

import java.util.Objects;

public class NyPizza extends Pizza{
	
	public enum Size{SMALL, MEDIUM, LARGE}
	private final Size size;
	
	public static class Builder extends Pizza.Builder<Builder> {

		private final Size size;
		
		public Builder(Size size) {
			this.size = Objects.requireNonNull(size);
		}

		@Override
		public NyPizza build() {
			return new NyPizza(this);
		}

		@Override
		protected Builder self() {
			return this;
		}

		
	}
	
	private NyPizza(Builder builder) {
		super(builder);
		size = builder.size;
	}
	
	
	
	
	@Override
	public String toString() {
		
		
		String top = " Toppings = ";
		for(Topping topping:this.toppings) {
			top += topping.name() + " ";
		}
		
		return "NyPizza [size=" + size + top + "]";
	}




	public static void main(String[] args) {
		NyPizza pizza = new NyPizza.Builder(Size.SMALL).addTopping(Topping.SAUSAGE).addTopping(Topping.ONION)
				.addTopping(Topping.MUSHROOM).build();
		
		System.out.println(pizza);
	}

}
