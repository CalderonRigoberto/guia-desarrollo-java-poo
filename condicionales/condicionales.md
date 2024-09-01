## Uso de condicionales 

El uso de condicionales en el mundo de la programación son una parte fundamental para instruir a la computadora en que cosas ejecutar a través de condiciones preestablecidas unícamente si son true o false en tu programa o proyecto que estes desarollando. 

### ¿Qué condicionales existen en Java?

1. Bloque de código `if`. Especifica si una condición es true, entonces el código dentro de este bloque será ejecutado.

Ejemplo
```java
    if(condicion == true) {
        // TODO EL CODIGO DENTRO DE AQUI SERA EJECUTADO
        System.out.println("Esta es mi primera validación usando if");
    }

    if(!condicion) {
        System.out.println("Esta condicion se cumplió, entonces este texto lo estas viendo en tu consola");
    }
```

2. Bloque de código `else`. Las sentencias que estén dentro de este bloque serán ejecutadas cuando la condicional preestablecida dentro del `if`no se haya cumplido.

Ejemplo 
```java
    int miEdad = 22;

    if(miEdad.equals(18)) {
        System.out.println("Soy mayor y esta condición se cumplió!!!");
    } else {
        System.out.println("Este bloque será ejecutado porque mi edad no es diferente a 18");
    }
```

3. Bloque de código `else if`. Utilizado para validar una nueva condición en caso de que la condición preestablecida dentro de `if`no se haya cumplido.

Ejemplo
```java
    if(condicion1 > 12) {
        System.out.println("La condicion1 es true");
    } else if(condicion1 < 10) {
        System.out.println("La primera condicion es false y condicion1 es menor a 10 ");
    } else {
        System.out.printl("Este bloque se ejecutará ya que ninguno de los anteriores fue verdadero.");
    }
```

4. Uso de `switch` para la validación de muchas alternativas en bloques de código para ser ejecutadas.
Si bien, dentro de este repositorio tendremos más ejemplos relacionados con procesos en sistemas reales aquí dejaremos un ejemplo sencillo.

```java
    int args = 0;
    switch (args) {
        case value:
            // AQUI EL CODIGO QUE SE VA EJECUTAR SI LA CONDICION CUMPLE CON ESTE CASO
            break;
    
        default:
            // AQUI EL CODIGO QUE SE VA EJECUTAR SI EL ARGUMENTO NO COINCIDE CON NINGUN `case`
            break;
    }
```

El switch tiene cosas interesante que podemos ver aquí. Lo primero es que inicia con una condición `switch(args)` que será usado por los case para saber si cumple con la condición que coloques. 

Los `case` contienen los valores y dentro de ellos el código que será ejecutado.

`default` Este bloque de código será ejecutado si ninguno de los case cumple con la condición preestablecida en el argumento.

`break` Esta línea de código es una keyword que es usada para terminar un bucle o una esctructura de flujo. Además de ser usado en los `switch` puede ser usado en `for` `do-while` `while`.

5. Operadores ternarios `condicion ? expresion1 : expresion2`. Es una alternativa a los if si lo quieres ver de esa manera. Pero permite hacer una forma concisa y sencilla usada para validación de condicionales.

Si bien, los operadores ternarios son útiles, se recomienda usarlo para validaciones anidadas.

Ejemplo
```java
int number = 15;
String result = (number % 2 == 0) ? "Par" : "Impar";
System.out.println("El número es: " + result);
```



Si deseas ver más ejemplos y ejecutar código puedes ver la clase de java con código ejecutable.



