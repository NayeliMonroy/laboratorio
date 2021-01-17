create database prueba;
use prueba;

/*--------------------------------------------------------------------------*/

create table Proveedor(
IdProveedor int not null,
NombreCompañia varchar(45) not null,
NombreProveedor varchar(45) not null,
TituloProveedor varchar(45) not null,
Direccion varchar(45) not null,
CodigoPostal varchar(10) not null,
Telefono varchar(10) not null,
primary key(IdProveedor)
)ENGINE = INNODB;

create table Almacen(
idAlmacen int  not null,
MateriaPrima varchar(45) not  null,
IdProveedor int not null,
stock int not null,
primary key (idAlmacen,IdProveedor),
foreign key(IdProveedor)
references Proveedor(IdProveedor)
on delete cascade 
on update cascade
)ENGINE = INNODB;

create table NuevoProducto(
idCodigo int  not null,
IdProveedor int not null,
Producto varchar(45) not null,
Stock int not null,
Precio decimal(10,2) not null,
Descripcion varchar(45) not null,
primary key(Producto,IdProveedor,Precio),
foreign key(IdProveedor)
references Almacen(IdProveedor)
on delete cascade 
on update cascade
)ENGINE = INNODB;

create table Ventas(
IdVenta int not null,
Producto varchar(45) not null,
Cantidad int not null,
fecha varchar(20) not null,
Total double not null,
primary key(IdVenta,Producto),
foreign key(Producto)
references NuevoProducto(Producto)
on delete cascade 
on update cascade
)ENGINE = INNODB;



