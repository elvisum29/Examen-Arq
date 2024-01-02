-- Tabla para la cabecera de la factura
CREATE TABLE FacturaCabecera (
    factura_id SERIAL PRIMARY KEY,
    cliente_nombre VARCHAR(100) NOT NULL,
	cliente_num_documento VARCHAR(15) NOT NULL,
    fecha_emision DATE NOT NULL,
    total DECIMAL(10, 2) NOT NULL
);

-- Tabla para los productos
CREATE TABLE Productos (
    producto_id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10, 2) NOT NULL,
    stock INT NOT NULL
);
Select * from Productos 
INSERT INTO Productos (nombre, descripcion, precio, stock)
VALUES
  ('Jeans', 'Jeans color negro', 100.99, 100),
  ('Jeans Americano', 'Jeans Inportado', 115.99, 50),
  ('Jeans Blue', 'Jenas edicion limitada', 210.99, 200),
  ('Polo Americano', 'Polo Americano Negro', 45.99, 75),
  ('Casaca Jino', 'Casaca de diseñador', 88.99, 150),
  ('Calzado Sport', 'Calzado Sport Negro', 120.99, 80),
  ('Nike', 'Calzado deportivo', 180.99, 120),
  ('Adidas', 'Calzado Deportivo', 190.99, 90),
  ('Camisa', 'Camisa elegante', 54.99, 60),
  ('Chompa', 'Chompa edicion limitada', 160.99, 110);


-- Tabla para el detalle de la factura
CREATE TABLE FacturaDetalle (
    detalle_id SERIAL PRIMARY KEY,
    factura_id INT REFERENCES FacturaCabecera(factura_id) ON DELETE CASCADE,
    producto_id INT REFERENCES Productos(producto_id),
    cantidad INT NOT NULL,
    precio_unitario DECIMAL(10, 2) NOT NULL,
    subtotal DECIMAL(10, 2) NOT NULL
);




















