package java;

/**
 * La clase libro representa el autor de ese libro, el titulo, el isbn y el estado.
 * Esta clase presenta los getters y setters y un constructor
 * 
 * @author Javier Pintado Navarro
 * @version 1.0
 * 
 */
public class Libro {

	private String autor;
	private String titulo;
	private String isbn;
	private Estado estado;
	
	/**
	 * Enumerado que representa los estados posibles de un libro.
	 * 
	 * - `DISPONIBLE`: Indica que el libro está disponible para su reserva.
	 * - `RESERVADO`: Indica que el libro ha sido reservado por un usuario.
	 * 
	 */
	public enum Estado {
		disponible , reservado
	}
	
	
	/**
	 * Constructor para crear la instancia de un libro con el autor, el titulo, el isbn y el estado.
	 * 
	 * 
	 * @param autor El autor del libro.
	 * @param titulo El titulo del libro
	 * @param isbn El isbn del libro
	 * @param estado el estado que se encuentra el libro
	 */
	public Libro(String autor, String titulo, String isbn, Estado estado) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.isbn = isbn;
		this.estado = estado;
	}

	/**
	 * Constructor por defecto
	 */
	public Libro() {
		
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", isbn=" + isbn + "]";
	}
	
	
	
	
}
