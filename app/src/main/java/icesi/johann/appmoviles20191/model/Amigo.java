package icesi.johann.appmoviles20191.model;

public class Amigo {

    private String id;

    private String nombre;

    private String edad;

    private String telefono;

    private String email;

    //Serializar
    public Amigo(){
    }

    public Amigo(String id, String nombre, String edad, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

}
