# SOLID

Integrantes: Daniel Pareja, Juan Felipe Gomez


Errores o violaciones al principio SOLID encontrados en las clases:

Los errores documentados a continuación fueron listados e identificados por clase/interfaz de la carpeta original: https://github.com/dani-saavedra/diplomado2024-2/tree/main/src/main/java/com/example/demo/unsolid

Employee.java

La clase Employee tiene los atributos de name y department son públicos, lo que permite que se puedan modificar desde fuera de la clase, esto viola el principio de encapsulamiento SOLID ya que los datos de esta clase no están protegidos. Adicionalmente falta el constructor para inicializarlos. Con los arreglos a la clase (hacer los atributos privados y proporcionar un constructor), la clase queda cumpliendo el principio de responsabilidad única.

EmployeeManager.java

La clase EmployeeManager asume demasiadas responsabilidades al encargarse de agregar y eliminar empleados, calcular salarios y guardar en archivo, violando el principio de responsabilidad única, que establece que una clase debe tener una única razón para cambiar. 

EmployeeOperations.java

Esta clase también se encarga de agregar y eliminar empleados, calcular salarios y guardar en archivo, lo que viola el principio de responsabilidad única. Al agrupar diferentes tipos de operaciones en una sola interfaz, se crea una dependencia innecesaria entre las operaciones que no están relacionadas entre sí.

PartTimeEmployee.java

La clase PartTimeEmployee extiende a Employee, haciendo que herede sus comportamientos, pero se sobreescribe el método getName() en PartTimeEmployee lanzando una excepción UnsupportedOperationException. Esto es innecesario y problemático, ya que getName() es un comportamiento heredado de Employee que se espera que funcione de manera consistente en todas las clases derivadas. Al lanzar una excepción en este método, se está violando el Principio de Sustitución de Liskov (LSP) de los principios SOLID, ya que no se puede usar un objeto PartTimeEmployee en lugar de un objeto Employee sin cambiar el comportamiento del programa, lo cual es una violación del LSP.

ReportGenerator.java

La clase de generar reporte viola el principio de open/close, ya que no está abierta para extensión y cerrada para modificación. Si queremos agregar un nuevo formato de reporte, habría que modificar el método de generar reporte.


SalaryCalculator.java

La clase SalaryCalculator depende directamente de EmployeeManager violando el principio de inversión de dependencias. Este principio establece que las clases deben depender de abstracciones, no de implementaciones concretas.

5 profe? 🙏

