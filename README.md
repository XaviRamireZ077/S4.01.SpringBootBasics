# S4.01.SpringBootBasics

Genera un projecte Spring boot amb les següents 
característiques:
Project (gestor de dependències)
Maven

Language
Java

Spring Boot
La darrera versió estable

Project Metadata Group
cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01

Artifact
S04T01N01GognomsNom

Name
S04T01N01GognomsNom

Description
S04T01N01GognomsNom

Package name
cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01

Packagin
Jar

Java
Mínim versió 11

Dependències:
Spring Boot DevTools
Spring Web

Importa’l a Eclipse amb l’opció File > Import > Existing Maven Project
A l’arxiu application.properties, configura la variable server.port amb el valor 9000.
Convertirem aquesta aplicació en una API REST:
Depenent del package principal, crear un altre subpackage anomenat Controllers, i dins seu, 
afegeig la classe HelloWorldController.
Haurà de tenir dos mètodes:
- String saluda
- String saluda2
Aquests dos mètodes rebran un paràmetre String anomenat nom, i retornaran la frase:
“Hola, “ + nom + “. Estàs executant un projecte Maven”.
El primer mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el 
paràmetre com un RequestParam. El paràmetre nom tindrà el valor per defecte “UNKNOWN”.
Haurà de respondre a:
http://localhost:9000/HelloWorld
http://localhost:9000/HelloWorld?nom=El meu nom
El segón mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el 
paràmetre com una PathVariable. El paràmetre nom, serà opcional.
Haurà de respondre a:
http://localhost:9000/HelloWorld2
http://localhost:9000/HelloWorld2/el meu nom

