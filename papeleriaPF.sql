-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema papeleriaPF
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema papeleriaPF
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `papeleriaPF` DEFAULT CHARACTER SET utf8 ;
USE `papeleriaPF` ;

-- -----------------------------------------------------
-- Table `papeleriaPF`.`Servicio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `papeleriaPF`.`Servicio` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `tipoServicio` VARCHAR(45) NULL,
  `descripcion` VARCHAR(45) NULL,
  `costo` DECIMAL(9,2) NULL,
  `disponibilidad` ENUM('En existencia', 'Sin existencia') NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `papeleriaPF`.`Empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `papeleriaPF`.`Empleado` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellidoPaterno` VARCHAR(45) NULL,
  `apellidoMaterno` VARCHAR(45) NULL,
  `direccion` VARCHAR(45) NULL,
  `telefono` VARCHAR(10) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `papeleriaPF`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `papeleriaPF`.`Producto` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(45) NULL,
  `precio` DECIMAL(9,2) NULL,
  `stock` INT NULL DEFAULT 0,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `papeleriaPF`.`Proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `papeleriaPF`.`Proveedor` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `ubicacion` VARCHAR(45) NULL,
  `telefono` VARCHAR(10) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  UNIQUE INDEX `telefono_UNIQUE` (`telefono` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `papeleriaPF`.`Pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `papeleriaPF`.`Pedido` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `fecha` DATE NULL,
  `cantidad` INT NULL,
  `total` DECIMAL(9,2) NULL,
  `idEmpleado` INT UNSIGNED NOT NULL,
  `idProveedor` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Pedido_Empleado1_idx` (`idEmpleado` ASC) VISIBLE,
  INDEX `fk_Pedido_Proveedor1_idx` (`idProveedor` ASC) VISIBLE,
  CONSTRAINT `fk_Pedido_Empleado1`
    FOREIGN KEY (`idEmpleado`)
    REFERENCES `papeleriaPF`.`Empleado` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedido_Proveedor1`
    FOREIGN KEY (`idProveedor`)
    REFERENCES `papeleriaPF`.`Proveedor` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `papeleriaPF`.`DetallaPedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `papeleriaPF`.`DetallaPedido` (
  `idPedido` INT UNSIGNED NOT NULL,
  `idProducto` INT UNSIGNED NOT NULL,
  `subtotal` DECIMAL(9,2) NULL,
  `cantidad` INT NULL,
  PRIMARY KEY (`idPedido`, `idProducto`),
  INDEX `fk_Pedido_has_Producto_Producto1_idx` (`idProducto` ASC) VISIBLE,
  INDEX `fk_Pedido_has_Producto_Pedido1_idx` (`idPedido` ASC) VISIBLE,
  CONSTRAINT `fk_Pedido_has_Producto_Pedido1`
    FOREIGN KEY (`idPedido`)
    REFERENCES `papeleriaPF`.`Pedido` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedido_has_Producto_Producto1`
    FOREIGN KEY (`idProducto`)
    REFERENCES `papeleriaPF`.`Producto` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `papeleriaPF`.`Venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `papeleriaPF`.`Venta` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `fecha` DATE NULL,
  `cantidad` INT NULL,
  `total` DECIMAL(9,2) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `papeleriaPF`.`DetallaServicio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `papeleriaPF`.`DetallaServicio` (
  `idServicio` INT UNSIGNED NOT NULL,
  `idVenta` INT UNSIGNED NOT NULL,
  `subtotal` DECIMAL(9,2) NULL,
  `cantidad` INT NULL,
  PRIMARY KEY (`idServicio`, `idVenta`),
  INDEX `fk_Servicio_has_Venta_Venta1_idx` (`idVenta` ASC) VISIBLE,
  INDEX `fk_Servicio_has_Venta_Servicio1_idx` (`idServicio` ASC) VISIBLE,
  CONSTRAINT `fk_Servicio_has_Venta_Servicio1`
    FOREIGN KEY (`idServicio`)
    REFERENCES `papeleriaPF`.`Servicio` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Servicio_has_Venta_Venta1`
    FOREIGN KEY (`idVenta`)
    REFERENCES `papeleriaPF`.`Venta` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `papeleriaPF`.`DetallaProducto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `papeleriaPF`.`DetallaProducto` (
  `idVenta` INT UNSIGNED NOT NULL,
  `idProducto` INT UNSIGNED NOT NULL,
  `subtotal` DECIMAL(9,2) NULL,
  `catidad` INT NULL,
  PRIMARY KEY (`idVenta`, `idProducto`),
  INDEX `fk_Venta_has_Producto_Producto1_idx` (`idProducto` ASC) VISIBLE,
  INDEX `fk_Venta_has_Producto_Venta1_idx` (`idVenta` ASC) VISIBLE,
  CONSTRAINT `fk_Venta_has_Producto_Venta1`
    FOREIGN KEY (`idVenta`)
    REFERENCES `papeleriaPF`.`Venta` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venta_has_Producto_Producto1`
    FOREIGN KEY (`idProducto`)
    REFERENCES `papeleriaPF`.`Producto` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
