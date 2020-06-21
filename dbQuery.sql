CREATE DATABASE Nomina

USE Nomina

CREATE TABLE Usuarios(
	idUsuario INT PRIMARY KEY IDENTITY(1,1),
	numeroCedula NVARCHAR(MAX),
	nombreCompleto NVARCHAR(MAX),
	correoElectronico NVARCHAR(MAX) NOT NULL,
	contrasenna NVARCHAR(MAX) NOT NULL
)

CREATE TABLE Empleados(
	IdEmpleado INT PRIMARY KEY IDENTITY(1,1),
	numeroCedula NVARCHAR(MAX) NOT NULL,
	nombreCompleto NVARCHAR(MAX) NOT NULL,
	sueldoBase FLOAT NOT NULL,
	correoElectronico NVARCHAR(MAX) NOT NULL,
)