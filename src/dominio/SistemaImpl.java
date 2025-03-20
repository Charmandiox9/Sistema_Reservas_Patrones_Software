package dominio;


import logica.Sistema;

public class SistemaImpl implements Sistema{

    Hotel hotel = new Hotel();


    @Override
    public boolean hacerReservas(String nombre, String nTarjeta) {
        boolean estado = false;

        Cliente cliente = new Cliente(nombre, nTarjeta);
        Pago pago = new Pago();

        if(cliente.getTarjetaCredito().contains("1122")){
            pago.completarPago();
        }

        if(pago.isEstado()){
            estado = true;
            hotel.hacerReserva(cliente);
        }

        return estado;
    }
}
