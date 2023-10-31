-- Integrador
/*CANDADO A
Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de
datos:
Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
centro o esté comprendida en otras posiciones.*/
-- posicion
select count(temporada) from estadisticas 
where Asistencias_por_partido=(select max(Asistencias_por_partido) from estadisticas);
-- da como resultado 2
-- clave 
select sum(j.peso) from jugadores j inner join equipos e on e.nombre=j.Nombre_equipo where e.conferencia='east' and j.posicion like '%c%';
-- da como resultado 14043

/*CANDADO B
Posición: El candado B está ubicadPosiciono en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
jugadores que tiene el equipo Heat.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
datos:
La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.*/
-- posicion
select count(j.codigo) from jugadores j inner join estadisticas e on e.jugador=j.codigo 
where Asistencias_por_partido>(select count(codigo) from jugadores where Nombre_equipo='heat');
-- da como resultado 3
-- clave 
select count(codigo) from partidos where temporada like '%99%';
-- da como resultado 3480
/*CANDADO C
Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
parte de equipos de la conferencia oeste.
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
195, y a eso le vamos a sumar 0.9945.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
datos:
Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
tapones por partido. Además, este resultado debe ser, donde la división sea central.*/
-- posicion
select count(j.codigo) from jugadores j inner join equipos e on j.Nombre_equipo= e.nombre
where procedencia='michigan' and Conferencia='west';
select count(codigo) from jugadores where peso>=195;
-- da como resultado 2/362+0.9945=1
-- clave 
select floor(avg(puntos_por_partido)+(select sum(Tapones_por_partido)+count(Asistencias_por_partido) from estadisticas inner join jugadores on jugador=codigo 
where Nombre_equipo 
in (select nombre_equipo from jugadores inner join equipos e on e.nombre=Nombre_equipo where division='central'))
) as suma from estadisticas e inner join equipos eq on division='central';
-- da como resultado 631
/*CANDADO D
Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
resultado debe ser redondeado. Nota: el resultado debe estar redondeado
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de
datos:
Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
de todos los jugadores de procedencia argentina.*/
-- posicion
select round(tapones_por_partido) from estadisticas inner join jugadores on jugador=codigo
 where nombre='corey maggette' and temporada='00/01';
 -- da como resultado 4
 -- codigo
 select round(sum(puntos_por_partido)) from estadisticas inner join jugadores on jugador=codigo 
 where procedencia='argentina';
 -- da como resultado 191