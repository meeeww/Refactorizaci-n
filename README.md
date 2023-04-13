# Tarea Refactorización

En esta practica vamos a aprender a Refactorizar mediante algunos de los métodos de refactorización explicados en clase. Os dejo en el Moodle la clase Trabajador en la que podemos observar que un trabajador esta formado por los siguientes campos:

![N|Solid](https://i.gyazo.com/d8a62c3ec8a0a86be2fceef6967db292.png)

¿Os parecen adecuados los nombres escogidos para cada uno de los atributos del trabajador? 1) Debéis renombrar cada parámetro por el nombre que aparece en el comentario situado a su lado. 2) Una vez tengamos renombrados los atributos vamos a proceder a tabular de manera automática el código, ya que es más fácil comprender un código si esta tabulado. 3) Una vez tenemos los atributos definidos de manera correcta, quiero que todos atributos estén encapsulados. Aplicaremos esta encapsulación de manera automática. 4) Por ultimo, vemos que dentro del Main existen unas formulas para calcular el sueldo del trabajador, como podemos observar en la siguiente imagen:

![N|Solid](https://i.gyazo.com/57cd6a7d5f593796220d55a2ca47ee85.png)

Esto no es adecuado realizarlo de esta manera, como solución a este problema os propongo encapsular todos esos cálculos dentro de una nueva función. Esto se denomina extraer método y el propio IDE nos ayuda a realizarlo de manera automática. Vamos a crear la acción llamada calculaSueldo(Trabajador t1). Adaptaremos el código de manera manual para que nos muestre por pantalla el calculo del sueldo del trabajador, añadiendo en el main:

>System.out.println("El sueldo del trabajador es: " + getSueldo());

Vamos a proceder a probar el código completo creando el siguiente trabajador:

>Trabajador t1 = new Trabajador("Pepe",29,1,2,830);

Salida por consola: El sueldo del trabajador es: 1720.5 Ya hemos mejorado el código de la clase de manera automática.