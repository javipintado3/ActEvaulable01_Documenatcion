/**
 * La clase Reserva representa el usuario de la reserva, el libro que ha reservado, 
 * la fecha de la reserva y la fecha de la devolucion.
 * 
 * @class
 */
class Reserva {
    /**
     * Crea una nueva instancia de Reserva.
     * @param {string} usuario - El nombre del usuario que realiza la reserva.
     * @param {string} libro - El título del libro que se reserva.
     * @param {Date} fechaReserva - La fecha en que se realiza la reserva.
     * @param {Date} fechaDevolucion - La fecha prevista para la devolución del libro.
     */
    constructor(usuario, libro, fechaReserva, fechaDevolucion) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaReserva = fechaReserva;
        this.fechaDevolucion = fechaDevolucion;
    }


 
    getUsuario() {
        return this.usuario;
    }

    setUsuario(nuevoUsuario) {
        this.usuario = nuevoUsuario;
    }

    getLibro() {
        return this.libro;
    }

    setLibro(nuevoLibro) {
        this.libro = nuevoLibro;
    }

    getFechaReserva() {
        return this.fechaReserva;
    }

    setFechaReserva(nuevaFechaReserva) {
        this.fechaReserva = nuevaFechaReserva;
    }

    getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    setFechaDevolucion(nuevaFechaDevolucion) {
        this.fechaDevolucion = nuevaFechaDevolucion;
    }
}


