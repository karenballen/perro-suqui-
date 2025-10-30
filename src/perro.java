 class perro extends mascota implements cuidado {

    public perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void comer() {
        System.out.println( nombre + "está comiendo croquetas");
    }

    @Override
    public void hacerSonido() {
        System.out.println( nombre + "dice: ¡Guau guau!");
    }

     @Override
     public void bañar() {
        System.out.println(nombre + " se esta bañando ");

     }

     @Override
     public void cepillar() {
        System.out.println(nombre + " ya se cepillo ");

     }

     public void mostrarInfo() {
         System.out.println("edad "+edad);
    }

}
