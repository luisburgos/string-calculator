### Calculadora de cadenas.

Crear una calculadora que permita ingresar una cadena simple con un método *int add (String numbers)* que tenga las siguientes características:

1. El método puede tener **0, 1 o n números**, y devolverá su suma (para una cadena vacía devolverá 0), por ejemplo:
  * Entrada: *""* -> Salida: *0*.
  * Entrada: *"1"* -> Salida: *1*.
  * Entrada: *"1,2"* -> Salida: *3*.
  * Entrada: *"1,2,3,40"*- -> Salida: *46*.
2. Se puede ingresar el **caracter de nueva línea** entre los números (en vez de comas). Por ejemplo la siguiente entrada está bien:
  * Entrada: *"1 \ n2,3"* -> Salida: *6*.
3. La siguiente entrada también debe ser válida:
  * Entrada: *"1, \ n"* -> Salida: *1*.
4. Se puede ingresar una cadena con diferentes delimitadores en lugar de la como (,). Para cambiar un delimitador, el principio de la cadena contendrá una línea separada que tiene este patrón:
  * **"// [delimitador] \ n [números ...]"**, por ejemplo:
    * Entrada: *"//; \ n 1; 2"* -> Delimitador: *“;”* -> Salida: *3*.
5. Si se ingresa un **número negativo** el programa arrojará una excepción *"Negatives Not Allowed:"* seguido del número negativo que ha sido ingresado. Si hay varios números negativos, se deben mostrar todos en el mensaje de excepción de la siguiente forma:
  * *“Negatives Not Allowed: -3,-23”*.
