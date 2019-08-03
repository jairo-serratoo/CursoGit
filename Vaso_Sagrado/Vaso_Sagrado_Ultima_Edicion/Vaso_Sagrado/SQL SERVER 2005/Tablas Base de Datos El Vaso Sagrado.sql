create database Articulos_Religiosos_Vaso_Sagrado
use Articulos_Religiosos_Vaso_Sagrado

create table Producto(
	Clasificacion_Producto int primary key not null,
	Nombre_Class_Producto varchar(30) not null)

insert into Producto values(1,'Custodias')
insert into Producto values(2,'Caliz')
insert into Producto values(3,'Acetres')
insert into Producto values(4,'Cestos')
select * from Producto


create table Custodias(
	idClass int default(1) references Producto(Clasificacion_Producto),
	idCustudia int not null identity,
	idNombre varchar (30) not null primary key,
	Altura int not null,
	Coste money not null,
	Existencia int not null)



create table Caliz(
	idClass int default(2) references Producto(Clasificacion_Producto),
	idCaliz int not null identity,
	idNombre varchar (30) not null primary key,
	Altura int not null,
	Coste money not null,
	Existencia int not null)

drop table Caliz

create table Acetres(
	idClass int default(3) references Producto(Clasificacion_Producto),
	idAcetres int not null identity,
	idNombre varchar (30) not null primary key,
	Cap_Almac_Litros int not null,
	Coste money not null,
	Existencia int not null)
drop table Acetres
select * from Acetres
create table Cestos(
	idClass int default(4) references Producto(Clasificacion_Producto),
	idCestos int  not null identity,
	idNombre varchar (30) not null primary key,
	Capacidad varchar (10) not null,
	Coste money not null,
	Existencia int not null)
drop table Cestos

create table Clientes(
	idCliente int not null identity,
	idNombre varchar (50) not null primary key,
	Telefono numeric not null unique,
	Email varchar (30),
	Direccion varchar (80) not null)
drop table Clientes

------------------------------------------------------------------------------------
create table Empleados(
	idEmpleado int not null identity,
	idNombre varchar (50) not null primary key ,
	Puesto varchar (30) not null,
	Telefono numeric not null unique,
	Sueldo money not null,
	Direccion varchar (80) not null)
drop table Empleados

create table Trabajo_Realizar(
	idEmpleado varchar(50) primary key references Empleados(IdNombre) not null,
	Piezas varchar(30),
	Comentarios varchar(200))


select * from Custodias

select * from Trabajo_Realizar