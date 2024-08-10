## Tipo de Datos y Variables

### ¿Qué es una variable?
Es un contenedor que almacena información en memoria durante la ejecución de un programa de Java.
Cada variable tiene un tipo de dato que le indica a tu programa que valor puede almacenar y el tamaño que puede tener. Parece complicado pero es más fácil de lo que piensas.

En Java hay principalmente 3 tipos de de variables:
- Local
- Instance
- Static

Para poder usar una variable dentro de tu programa necesitas dos pasos primordiales a seguir:
1. Declaración de una variable
2. Incialización de la misma

Estos dos pasos puedes hacerlo en una misma línea, ya lo verás.

Una variable esta conformada por dos cosas, como mencionamos anteriormente el tipo de dato y el nombre de tu variable. Pero antes de todo, ¿qué carajo que son los tipos de datos?

Los tipos de datos especifican que información puede ser almacenada en una variable y que tamaño permite almacenar.

En Java existen los tipos de datos primitivos y los datos no primitivos.
## ¿Cuál es la diferencia entre estos dos tipos datos?

### Primitivos 

Los primitivos son los más básicos para utilizar en Java. Hay 8 tipos de datos primitivos:

1. byte Que es un tipo de dato de 8bits (Valores positivos y negativos), tiene un valor minimo para almacenar de -128 y un máximo de 127. Es múy útil para ahorrar memoria donde realmente importa. Puede ser también usado en lugar de un int.
2. short Que es un tipo de dato de 16bits (Valores positivos y negativos). Permite almacenar un valor minímo de -32768 hasta un máximo de 32767. Al igual que un byte puede ser utilizado en arreglos grandes para ahorrar el uso de la memoria.
3. int Que es un tipo de dato de 32bits (Valores positivos y negativos). Permite almacenar un valor minímo de -2_147_483_648 y un máximo de 2_147_483_647. 
4. long Que es un tipo de dato de 64bits (Valores positivos y negativos). Permite almacenar un valor minímo de -9_223_372_036_854_775_808 y uno máximo de 9_223_372_036_854_775_807. Es recomendable utilizar long cuando necesitas almacenar valores más grandes que los que permite almacenar int.
5. float Es un tipo de dato de 32bits IEEE 754 que permite almacenar números decimales con precisión simple (Tiene menos precisión en comparación con double). Es suficiente para ser usado en muchos casos donde no se requiere una alta precisión. IEEE 754 se trata de un formato común para representar números decimales en las computadoras, esto con la intención de garantizar consistencia entre diferentes sistemas. Este tipo no se recomiendan o deben ser usados para valores precisos como divisas.
6. double Es un tipo de dato de precisión doble de 64bits IEEE 754. Este tipo de dato es la elección por defecto para trabajar con datos que contienen valores decimales. Este tipo no se recomiendan o deben ser usados para valores precisos como divisas.
7. boolean Este tipo de dato solo tiene dos posibles valores true y false. Es recomendable usar este tipo para condiciones simples de verdedaro o falso. Solo representa 1 bit de información, pero su "tamaño" no es algo que este precisamente definido.
8. char Es un tipo de dato que solo permite un unico caracter de 16bit unicode. Tiene un valor minímo de \u0000' o 0 y un valor máximo de '\uffff'  65_535.

Los valores primitivos tienen valores por defecto asignados por el compilador, unícamente cuando no han sido inicializados y dependiendo el tipo de dato. Te recomiendo visitar el siguiente enlace [Valores por defecto datos primitivos](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html).


### No primitivos
Los tipos de datos no primitivos son String, clases, arrays, interfaces, eunms, colecciones, etc. 

También podrás ver o conocerlos como clases wrappers. Que están directamente relacionada con los datos primitivos ya que proporcionan una forma de tratarlo como objetos.

Contienen métodos que te permiten llevar acabo ciertas tareas, funciones, conversiones, o manipulación de valores, inmutabilidad. 

Aquí un ejemplo:
int → Integer
long → Long
float → Float
double → Double
char → Character
byte → Byte
short → Short


Ahora te mostraré un ejemplo de como declarar una variable y como inicializarla. Aun así podrás encontrar más ejemplos en código [AQUI](TipoDatosVariables.java).

```java
// Declarar una variable
int miPrimeraVariable;
// Puedo asignarle un valor después
miPrimerVariable = 12;

// Inicializar una variable
int miSegundaVariable = 1;


// Declarar una variable de tipo no primitivo

String miPrimerCadenaDeTexto = "Estoy avanzando!!!";
```

Como puedes observar nos encontramos que es necesario el tipo de dato, el nombre y podemos incializar en la misma línea o después, depende de la funcionalidad que le queramos dar a nuestro
código.
