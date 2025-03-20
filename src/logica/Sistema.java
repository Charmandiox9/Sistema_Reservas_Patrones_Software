package logica;

import dominio.Hotel;
import dominio.Cliente;
import dominio.Pago;

public interface Sistema {
    boolean hacerReservas(String nombre, String nTarjeta);
}
