use Articulos_Religiosos_Vaso_Sagrado
create table Usuarios(
	idUser int primary key identity,
	Nombre varchar(30) not null,
	Pass varchar(20) not null,
	Email varchar(30),
	nivel int check(nivel>=1 and nivel <=3) not null)
	
insert into Usuarios values('Jairo Serrato','201310137','jairo-serratoo@hotmail.com',1)
insert into Usuarios values('Terious Uribe','201310969','terious_11@hotmail.com',1)
insert into Usuarios values('Amir De Leon','201312345','ing.amir@hotmail.com',1)
insert into Usuarios values('Carlos Severiano','201310594','carlosazcapo@hotmail.com',2)


insert into Usuarios values('Guadalupe Serrato','1234','orfebre-pita@hotmail.com',2)
insert into Usuarios values('Paul Rodriguez','PaulRodriguez','paul-rodriguez@hotmail.com',3)
 insert into Producto values('Cestos')
select * from Producto

select * from Usuarios
select * from Empleados
select * from Trabajo_Realizar