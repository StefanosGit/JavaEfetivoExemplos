/**
 * 
 */
package br.com.stefanos.javaefetivo.capii;

/**
 * @author stefanospavlidis
 *
 */
public class NutritionFacts {

	/**
	 * Teste do padão Builder Item 2 do livro Java Efetivo
	 * 
	 * @param args
	 */
	
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	public static class Builder {
		
		//parametros obrigatorios
		private final int servingSize;
		private final int servings;
		//parametros opcionais
		private int calories      = 0;
		private int fat           = 0;  
		private int sodium        = 0;
		private int carbohydrate  = 0; 
		
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val) {
			calories = val;
			return this;
		}
		public Builder fat(int val) {
			fat = val;
			return this;
		}
		public Builder sodium(int val) {
			sodium = val;
			return this;
		}
		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}
		
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
		
	
	}
	
	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings    = builder.servings;
		calories    = builder.calories;
		fat         = builder.fat;
		sodium      = builder.sodium;
		carbohydrate= builder.carbohydrate;
	}
	

	
	@Override
	public String toString() {
		return "NutritionFacts [servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories
				+ ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
	}



	public static void main(String[] args) {

		NutritionFacts cocaCola = new NutritionFacts.Builder(1000, 100).calories(25).fat(50).sodium(10).build();
		
		
		NutritionFacts cocada = new NutritionFacts.Builder(200, 100).calories(10).carbohydrate(45).build();
		
		System.out.println(cocaCola);
		System.out.println("===============================");
		System.out.println(cocada);
		
		

	}

}
