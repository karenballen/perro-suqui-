public abstract class mascota {

            protected String nombre;
            protected int edad;

            public mascota(String nombre, int edad) {
                this.nombre = nombre;
                this.edad = edad;
            }

            public abstract void comer();
            public abstract void hacerSonido();
            public abstract void bañar();
            public abstract void cepillar();

            public void mostrarInfo() {
                System.out.println("Mascota: " + nombre + ", Edad: " + edad);

            }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}