package tipo_datos_y_variables;


/*
  Esta clase contiene 
  ¿Como crear e inicializar una variable?
  ¿Como uso los diferentes tipos de datos?
  ¿Como declaro primitivo y no primitivo?
  ¿Como declaro un long, un float y un double?
*/
public class TipoDatosVariables {
    public static void main(String[] args) {
        System.out.println("Lección Tipo de Datos y Variables");
        
        // Declaración de variables de tipo primitivo enteros
        int miPrimerVariable = 1;
        System.out.println(miPrimerVariable);
        byte miSegundaVariable = 127;
        System.out.println(miSegundaVariable);
        short miTerceraVariable = 200;
        System.out.println(miTerceraVariable);
        int miPrimerEntero = 348;
        System.out.println(miPrimerEntero);

        // En los valores long es necesario añadir una L al final, puede ser mays o minúscula
        // p.d Es recomendable usar L. para mayor claridad y no confusión con el número 1 - l.
        long unValorMasGrande = 9223372036854775807L;
        System.out.println(unValorMasGrande);
        

        // Tipo de datos flotantes 
        float vConDecimal = 23.00F;
        System.out.println(vConDecimal);
        double v2ConDecimal =  1.234e2;
        System.out.println(v2ConDecimal);


        // Tipos de datos lógicos
        boolean esAgosto = true;
        System.out.println(esAgosto);

        // Tipos de datos de texto
        // Es necesario user simple quotes para indicar que es un char

        // char miPrimerCaracter = "A" Esto es incorrecto;
        char miPrimerCaracter = 'A';
        System.out.println(miPrimerCaracter);
        char miSegundoCaracter = '\uffff';
        System.out.println(miSegundoCaracter);

        // Tipos de datos no primitivos
        String cadenaString = "Esta es una cadena y soy un dato no primitivo";
        System.out.println(cadenaString);

        // Ofrece la posibilidad de tratar un primitivo como un objeto
        Integer intNoPrimitivo = 2;
        System.out.println(intNoPrimitivo);

        // Y ofrece metodos utiles para trabajar
        System.out.println(intNoPrimitivo.intValue());
        System.out.println(intNoPrimitivo.toString());
        System.out.println(intNoPrimitivo.compareTo(4));

        Integer dos = 3;
        Integer tres = dos;
        dos = 4;
        tres = 6;
        
        System.out.println(tres);
        System.out.println(dos);
    }
}
