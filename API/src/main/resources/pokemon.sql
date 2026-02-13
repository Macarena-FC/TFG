-- Crear la tabla (si no existe)
CREATE TABLE pokedex (
    pokedex_id INT PRIMARY KEY,
    nombre VARCHAR(50),
    tipos VARCHAR(50),
    peso_kg DECIMAL(5,2),
    altura_m DECIMAL(4,2),
    generacion VARCHAR(20)
);

-- Importar CSV
LOAD DATA INFILE 'src\main\resources\pokemon.csv'
INTO TABLE pokedex
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(pokedex_id, nombre, tipos, peso_kg, altura_m, generacion);

-- Seleccionar todos los datos
SELECT * FROM pokedex;
