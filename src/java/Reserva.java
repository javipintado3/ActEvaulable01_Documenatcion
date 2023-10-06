package java;

import java.util.Date;

/**
 * La clase Reserva representa el usuario de la reserva, el libro que ha reservado, 
 * la fecha de la reserva y la fecha de la devolucion.
 * 
 * @author Javier Pintado Navarro
 * @version 1.1
 */
public class Reserva {

	private String usuario;
	private Libro libro;
	private Date fechaReseva;
	private Date fechaDevolucion;
	
	/**
	 * Constructor para crear la instancia con un usuario, un libro,  la fecha de reserva y la fecha de devolucion.
	 * 
	 * 
	 * @param usuario El usuario de la reserva
	 * @param libro El libro de la reserva
	 * @param fechaReseva La fecha de reserva
	 * @param fechaDevolucion La fecha de devolucion
	 */
	public Reserva(String usuario, Libro libro, Date fechaReseva, Date fechaDevolucion) {
		super();
		this.usuario = usuario;
		this.libro = libro;
		this.fechaReseva = fechaReseva;
		this.fechaDevolucion = fechaDevolucion;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public Date getFechaReseva() {
		return fechaReseva;
	}
	public void setFechaReseva(Date fechaReseva) {
		this.fechaReseva = fechaReseva;
	}
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	@Override
	public String toString() {
		return "Reserva [usuario=" + usuario + ", libro=" + libro + ", fechaReseva=" + fechaReseva
				+ ", fechaDevolucion=" + fechaDevolucion + "]";
	}
	
	
	
	
}
