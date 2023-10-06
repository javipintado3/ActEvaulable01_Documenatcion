/**
 * La clase libro representa el autor de ese libro, el titulo, el isbn y el estado.
 * Esta clase presenta los getters y setters y un constructor
 * 
 * @class
 */
class Libro {
    /**
     * Crea una nueva instancia de Libro.
     * @param {string} titulo - El título del libro.
     * @param {string} autor - El autor del libro.
     * @param {string} isbn - El número ISBN del libro.
     * @param {string} estado - El estado actual del libro.
     */
    constructor(titulo, autor, isbn, estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = estado;
    }

    getTitulo() {
        return this.titulo;
    }

   
    setTitulo(nuevoTitulo) {
        this.titulo = nuevoTitulo;
    }

   
    getAutor() {
        return this.autor;
    }

    
    setAutor(nuevoAutor) {
        this.autor = nuevoAutor;
    }

   
    getIsbn() {
        return this.isbn;
    }

    
    setIsbn(nuevoIsbn) {
        this.isbn = nuevoIsbn;
    }

 
    getEstado() {
        return this.estado;
    }

  
    setEstado(nuevoEstado) {
        this.estado = nuevoEstado;
    }
}


 