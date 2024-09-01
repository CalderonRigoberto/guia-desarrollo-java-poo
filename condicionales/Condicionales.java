package condicionales;

class Condicionales {
    public static void main(String[] args) {
        System.out.println("Condicionales!!");
        int miEdad = 18;
        if(miEdad >= 18) {
            System.out.println("Soy mayor de edad!");
        } else {
            System.out.println("No cumplo con los requisitos");
        }

        boolean condicion1 = miEdad == 18 ? true : false;

        if(condicion1) {
            System.out.println("Mi edad es igual a 18");
        } else if (!condicion1) {
            System.out.println("Mi edad es diferente de 18");
        } 

        String ocupacion = "Desarrollador Java";
        switch (ocupacion) {
            case "Desarrollador Kotlin":
                System.out.println(ocupacion + "ocupación");
                break;
            case "Desarrollador Java":
                System.out.println("Soy " + ocupacion + " y quiero aprender mucho más a cerca de Java!");
                break;
            default:
                System.out.println("Estoy en proceso de ser desarrollador.");
                break;
        }
    }
}