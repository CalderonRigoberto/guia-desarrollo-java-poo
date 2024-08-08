# Lección de sintáxis básica en Java

- Case sensitive: Es muy importante mantener en mente que java es "Case Sensitive", por ejemplo el identificador 
`Programador` y `programador` tendrán un diferente significado.
- Nombre de clases: Las clases en Java tiene un estandar para ser nombradas donde la primer letra debe estar en mayúscula, y en caso de que el nombre de la 
clase sea conformado por varias palabras cada inicio de la palabra también debe iniciar con mayúscula. Por ejemplo `class EjemploDeClaseEnJava`
- Nombre de métodos: Los métodos deben comenzar con la letra en minúscula. Ejemplo `public int sumar()`. En el caso de que el método contenga más
de una palabara en su nombre, las siguientes palabras a excepeción de la primera tienen que comenzar con mayúscula. Ejemplo `public void obtenerDatoImportante()`.
- Nombre del archivo: El nombre del archivo debe ser exactamente igual al nombre de la clase.


## Identificadores y variables en Java

- Identificadores son el nombre de las variables, metódos, clases, packages e interfaces.

Todos los identificadores pueden comenzar con una letra `(A-Z o a-Z)`, signo de moneda `$` o un guión bajo `_`.
Tanto en Java como en los lenguajes de programación que llegues a conocer existe keywords, que son y tienen un signficado y función especial. Por lo tanto, 
estas no son permitidas para usar como identificadores para tus variables.

Ejemplos de identificadores válidos: `edad`, `$ahorroInvertido`, `_valor2`.
Ejemplos de identificadores no válidos: `456edad`, `-dineroEnMiCuenta-`.


## Palabras reservadas (Keywords)
- Son palabras que no pueden ser usadas como identificadores para tus variables, ya que tienen un significado
y uso especial para tu código en Java.

Las siguientes son keywords de ejemplo que existen en Java. (Más adelante abordaremos su uso): 

abstract
assert
boolean
break
byte
case
catch
char
class
const
continue
default
do
double
else
enum
extends
final
finally
float
for
goto
if
implements
import
instanceof
int
interface
long
native
new
package
private
protected
public
return
short
static
strictfp
super
switch
synchronized
this
throw
throws
transient
try
void
volatile
while
var
true
null
false


## Espacios en blanco

En Java los espacios en blanco (whitespaces) son un término que puede derivarse como tasbs,   comentarios, etc.
Estos espacios en blanco, son ignorados por el compilador.

Ejemplo `int edad;`, `sumaDatos = a + b // Suma el total de a y b`


Estos espacios no son restrictivos o tienen una forma especifica de colocarse, puedes colocar cuantos quieras
con el propósito de que tu código sea legible y entendible para los demás.


## Comentarios

En cualquier lenguaje de programación, son importantes los comentarios, ya que esto permite
generar una pequeña documentación o texto de ayuda que permite saber como tu código funciona o para entender
ciertos procesos.

Existen diferentes tipos de comentarios

- Single Line Comments (Comentarios de una sola línea)
```java
// Este es un comentario de una sola línea 
```

-Multiline comments (Comentarios multilinea)
```java
/*
Puedo comentar todo lo que este dentro de aquí,
inclusive más de una línea.

Java es Genial.
*/
```

- Java docs (Comentarios o Documentación para tu código Java)
```java
/**
 * Esto sirve para describir la funcionalidad de tu código, clase, variable y/o metódos.
 * 
 * <p>Inclusive acepta tags de Html</p>
 * 
 * @param parametro1 Puedes usar parametros y describirlos
 * @return parametro2 Puedes indicar que retorna
 * 
 * Es importante verificar como usar y generar Java Docs, pero sin duda son una gran herramienta
 * para comentar tu código.
 */
```