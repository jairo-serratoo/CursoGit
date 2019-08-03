use Articulos_Religiosos_Vaso_Sagrado

-------custodia-----


------Alta Custodia-----
create procedure Alta_Custodia
	@idClass int,
	@Nombre varchar(30),
	@Altura int,
	@Coste int,
	@Existencia int,
	@Res varchar(50) output
as
	insert into Custodias values(@idClass, @Nombre, @Altura, @Coste, @Existencia)
	set @Res = 'Alta Realizada Satisfactoriamente'
	print @Res

Alta_Custodia 1,'Custodia de Sol', 30, 1200, 5, ''
select * from Custodias

-------Borrar Custodia-----
create procedure Borrar_Custodia
	@Nombre varchar(30),
	@Res varchar(50) output
as
	delete from Custodias where idNombre = @Nombre
	set @Res = 'Borrado Satisfactoriamente'
	print @Res

Borrar_Custodia 'Custodia de Sol', ''

-------Actualizar Datos Custodia-----
create procedure Actualizar_Custodia
	@Nombre varchar(30),
	@Altura int,
	@Coste int,
	@Existencia int,
	@Res varchar(30) output
as
	update Custodias set idNombre = @Nombre, Altura=@Altura, Coste=@Coste, Existencia=@Existencia where idNombre=@Nombre
	set @Res='Actualizacion Realizada Satisactoriamente'
	print @Res
Actualizar_Custodia 'Custodia de Sol', 60, 1500, 2, ''


--------Caliz-----

----insertar Caliz-----


create procedure Alta_Caliz
	@idClass int,
	@Nombre varchar(30),
	@Altura int,
	@Coste int,
	@Existencia int,
	@Res varchar(50) output
as
	insert into Caliz values(@idClass, @Nombre, @Altura, @Coste, @Existencia)
	set @Res = 'Alta Realizada Satisfactoriamente'
	print @Res
Alta_Caliz 2, 'Caliz de Vaso', 35, 1000, 9, ''
select * from Caliz

-------Borrar Caliz-----
create procedure Borrar_Caliz
	@Nombre varchar(30),
	@Res varchar(50) output
as
	delete from Caliz where idNombre = @Nombre
	set @Res = 'Borrado Satisfactoriamente'
	print @Res
Borrar_Caliz 'Caliz de Vaso', ''

-------Actualizar Datos Caliz-----
create procedure Actualizar_Caliz
	@Nombre varchar(30),
	@Altura int,
	@Coste int,
	@Existencia int,
	@Res varchar(30) output
as
	update Caliz set idNombre = @Nombre, Altura=@Altura, Coste=@Coste, Existencia=@Existencia where idNombre=@Nombre
	set @Res='Actualizacion Realizada Satisactoriamente'
	print @Res
Actualizar_Caliz 'Caliz de Uvas', 20, 1500, 3, ''


--------Acetres-----

----insertar Acetres-----


create procedure Alta_Acetre
	@idClass int,
	@Nombre varchar(30),
	@Capacidad int,
	@Coste int,
	@Existencia int,
	@Res varchar(50) output
as
	insert into Acetres values(@idClass, @Nombre, @Capacidad, @Coste, @Existencia)
	set @Res = 'Alta Realizada Satisfactoriamente'
	print @Res
Alta_Acetre 3, 'Acetre mini', 1, 300, 9, ''
select * from Acetres

-------Borrar Acetres-----
create procedure Borrar_Acetre
	@Nombre varchar(30),
	@Res varchar(50) output
as
	delete from Acetres where idNombre = @Nombre
	set @Res = 'Borrado Satisfactoriamente'
	print @Res
Borrar_Acetre 'Acetre mini', ''

-------Actualizar Datos Acetres-----
create procedure Actualizar_Acetre
	@Nombre varchar(30),
	@Capacidad int,
	@Coste int,
	@Existencia int,
	@Res varchar(30) output
as
	update Acetres set idNombre = @Nombre, Cap_Almac_Litros=@Capacidad, Coste=@Coste, Existencia=@Existencia where idNombre=@Nombre
	set @Res='Actualizacion Realizada Satisactoriamente'
	print @Res
Actualizar_Acetre 'Acetre mini', 2, 500, 3, ''



--------Cestos-----

----insertar Cestos-----


create procedure Alta_Cestos
	@idClass int,
	@Nombre varchar(30),
	@Capacidad int,
	@Coste int,
	@Existencia int,
	@Res varchar(50) output
as
	insert into Cestos values(@idClass, @Nombre, @Capacidad, @Coste, @Existencia)
	set @Res = 'Alta Realizada Satisfactoriamente'
	print @Res
Alta_Cestos 4, 'Cesto mini', 100, 500, 4, ''
select * from Cestos

-------Borrar Cestos-----
create procedure Borrar_Cestos
	@Nombre varchar(30),
	@Res varchar(50) output
as
	delete from Cestos where idNombre = @Nombre
	set @Res = 'Borrado Satisfactoriamente'
	print @Res
Borrar_Cestos 'Cesto mini', ''

-------Actualizar Datos Cestos-----
create procedure Actualizar_Cestos
	@Nombre varchar(30),
	@Capacidad int,
	@Coste int,
	@Existencia int,
	@Res varchar(30) output
as
	update Cestos set idNombre = @Nombre, Capacidad=@Capacidad, Coste=@Coste, Existencia=@Existencia where idNombre=@Nombre
	set @Res='Actualizacion Realizada Satisactoriamente'
	print @Res
Actualizar_Cestos 'Cesto mini', 3, 500, 10, ''



--------Clientes-----

----insertar Clientes-----

create procedure Alta_Clientes
	@Nombre varchar(50),
	@Tel numeric,
	@Email varchar (30),
	@Direccion varchar (80),
	@Res varchar(50) output
as
	insert into Clientes values(@Nombre, @Tel, @Email, @Direccion)
	set @Res = 'Alta Realizada Satisfactoriamente'
	print @Res

Alta_Clientes 'Javier Loera', 5520304011, 'jor-pli@gmom', 'Alcatraces 12', ''
select * from Clientes

-------Borrar Clientes-----
create procedure Borrar_Cliente
	@Nombre varchar(30),
	@Res varchar(50) output
as
	delete from Clientes where idNombre = @Nombre
	set @Res = 'Borrado Satisfactoriamente'
	print @Res
Borrar_Cliente 'Jorge Pliego', ''

-------Actualizar Datos Clientes-----
create procedure Actualizar_Clientes
	@Nombre varchar(50),
	@Tel numeric,
	@Email varchar (30),
	@Direccion varchar (80),
	@Res varchar(50) output
as
	update Clientes set idNombre = @Nombre, Telefono=@Tel, Email=@Email, Direccion=@Direccion where idNombre=@Nombre
	set @Res='Actualizacion Realizada Satisactoriamente'
	print @Res
Actualizar_Clientes 'Jorge Pliego', 5511740871, 'jorge-lol', 'Alcatraces 26', ''



--------Empleados-----

----insertar Empleados-----

create procedure Alta_Empleados
	@Nombre varchar(50),
	@Puesto varchar(30),
	@Tel numeric,
	@Sueldo int,
	@Direccion varchar (80),
	@Res varchar(50) output
as
	insert into Empleados values(@Nombre, @Puesto, @Tel, @Sueldo, @Direccion)
	set @Res = 'Alta Realizada Satisfactoriamente'
	print @Res

Alta_Empleados 'Juan Rodriguez', 'Armador', 5520304345, 2000, 'Teotihuacan 23', ''
select * from Empleados

-------Borrar Empleados-----
create procedure Borrar_Empleado
	@Nombre varchar(30),
	@Res varchar(50) output
as
	delete from Empleados where idNombre = @Nombre
	set @Res = 'Borrado Satisfactoriamente'
	print @Res
Borrar_Empleado 'Paul Rodriguez', ''

-------Actualizar Datos Empleados-----
create procedure Actualizar_Empleados
	@Nombre varchar(50),
	@Puesto varchar(30),
	@Tel numeric,
	@Sueldo int,
	@Direccion varchar (80),
	@Res varchar(50) output
as
	update Empleados set idNombre = @Nombre, Puesto=@Puesto, Telefono=@Tel, Sueldo=@Sueldo, Direccion=@Direccion where idNombre=@Nombre
	set @Res='Actualizacion Realizada Satisactoriamente'
	print @Res
Actualizar_Empleados 'Paul Rodriguez', 'Armador', 5520303030, 2500, 'Teotihuacan 21', ''


------Acualizar Datos Personales ------
create procedure Actualizar_Datos
	@Nombre varchar(50),
	@Tel numeric,
	@Direccion varchar (80),
	@Res varchar(50) output
as
	update Empleados set idNombre = @Nombre, Telefono=@Tel, Direccion=@Direccion where idNombre=@Nombre
	set @Res='Actualizacion Realizada Satisactoriamente'
	print @Res


--------Trabajos-------

-----Alta Trabajo------

create procedure Alta_Trabajo
	@idEmpleado varchar(50),
	@Piezas varchar(30),
	@Comentarios varchar(200),
	@Res varchar(50) output
as
	insert into Trabajo_Realizar values(@idEmpleado, @Piezas, @Comentarios)
	set @Res='Trabajo Asignado'
	print @Res

Alta_Trabajo 'Juan Rodriguez','Caliz Uvas', 'Trabajo a realizar para esta semana', ''
select * from Trabajo_Realizar

--------Borrar Trabajo Asignado------

create procedure Borrar_Trabajo
	@idEmpleado varchar(50),
	@Res varchar (50) output
as
	delete from Trabajo_Realizar where idEmpleado=@idEmpleado
	set @Res='Trabajo Borrado'
	print @Res
Borrar_Trabajo 'Paul Rodriguez', ''


-------Actualizar Trabajo Asignado-------

create procedure Actualizar_Trabajo
	@idEmpleado varchar(50),
	@Piezas varchar(30),
	@Comentarios varchar(200),
	@Res varchar(50) output
as
	update Trabajo_Realizar set idEmpleado=@idEmpleado, Piezas=@Piezas, Comentarios=@Comentarios where idEmpleado=@idEmpleado
	set @Res='Trabajo Actualizado'
	print @Res

Actualizar_Trabajo 'Paul Rodriguez','Caliz divino rostro', 'Trabajo a realizar para esta semana...', ''



------Cambiar Pass-----

create procedure Cam_Pass
	@Name varchar(30),
	@Pass varchar(20),
	@NewPass varchar(20),
	@Res varchar(50) output
as
	update Usuarios set Pass=@NewPass where Pass=@Pass
	set @Res='Password Actualizado'
	print @Res


Cam_Pass 'Paul Rodriguez', '2345', '23457', ''