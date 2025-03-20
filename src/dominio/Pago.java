package dominio;

public class Pago {
    private boolean estado;

    public Pago() {
        estado = false;
    }

    public void completarPago() {
        estado = true;
    }


    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
