/**
 * 
 */
package br.com.stefanos.javaefetivo.capii;

/**
 * Teste de static factory Item 1 do livro Java Efetivo
 * 
 * @author stefanospavlidis
 *
 */
public class User {
	
	private final String name;
	private final String email;
	private final String country;
	

	public User(String name, String email, String country) {
		super();
		this.name = name;
		this.email = email;
		this.country = country;
	}
	
	/**
	 * Exemplo de uso de static factory
	 * 
	 * @param name
	 * @param email
	 * @return
	 */
	public static User createWithDefaultCountry(String name, String email) {
		return new User(name, email, "Brazil");
	}
	
	



	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", country=" + country + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		User user1 = new User("Stefanos", "stefanos@email.com", "Brasil");
		
		User user2 = User.createWithDefaultCountry("Adalberto", "adalberto@email.com");
		
		System.out.println(user1);
		System.out.println("====================================");
		System.out.println(user2);
		
	}
	
	

}
