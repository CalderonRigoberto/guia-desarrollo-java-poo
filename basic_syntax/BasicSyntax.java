/*
 * @author Rigoberto Calderón
 * 
 * Lección básica de sintáxis en Java.
 */
package basic_syntax;

class BasicSyntax {

    public static void main(String[] args) {
        System.out.println("Lección de sintáxis básica!!");
        
        // Identificadores
        int miPrimerVariable;

        // No usar keywrods como identificadores
        // int abstract;
        // String default;

        /*
         * Aqui guardaré texto importante, para poder 
         * contar el número de vocales que contiene.
         */
        String unaCadenaDeTexto = "";

        // Espacios en blanco y tabs e identación
        // Esto no módifica o altera la funcionalidad de tu código
        // impacta en la legibilidad del mismo.
        unaCadenaDeTexto = "" + 
                "Otra Cadena de Texto";
    }
}