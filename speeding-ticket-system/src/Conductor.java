public class Conductor {
    private String id;
    private String nombre;
    private int tipoVia;
    private int velocidadRegistrada;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(int tipoVia) {
        this.tipoVia = tipoVia;
    }

    public int getVelocidadRegistrada() {
        return velocidadRegistrada;
    }

    public void setVelocidadRegistrada(int velocidadRegistrada) {
        this.velocidadRegistrada = velocidadRegistrada;
    }
}

