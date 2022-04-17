class Persona {

    int edad;
    String nombre;
    int telefono;

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.edad = 18;
        cliente.nombre = "Francisco";
        cliente.telefono = 314;
        cliente.credito = 200;

        System.out.println("El cliente tiene "+ cliente.edad + " años.");
        System.out.println("Se llama "+ cliente.nombre);
        System.out.println("Su numero de telefono es: "+ cliente.telefono);
        System.out.println("su credito es de: "+ cliente.credito );

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 25;
        trabajador.nombre = "Pedro";
        trabajador.telefono = 315;
        trabajador.salario = 2000;

        System.out.println("Nombre trabajador: "+ trabajador.nombre);
        System.out.println("Edad: "+ trabajador.edad + " años.");
        System.out.println("Telefono: "+ trabajador.telefono);
        System.out.println("Su salario es de: "+ trabajador.salario + " COP.");
        
    }
}

class Cliente extends Persona {

    int credito;
}

class Trabajador extends Persona {

    int salario;
}