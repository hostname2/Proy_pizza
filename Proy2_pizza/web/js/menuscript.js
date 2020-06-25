/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var datospizza = null;
var datoscont = null;
var tablaFactura = [];
var productoSeleccionado = null;
var preciopepe = null;
var preciosupre = null;
var preciohawa = null;
var preciomarga = null;
var preciochica = null;
var preciojyq = null;

function init(){
     modificarPrecio1();
     modificarPrecio2();
     modificarPrecio3();
     modificarPrecio4();
     modificarPrecio5();
     modificarPrecio6();
}

function incializarDatos(newdatospizza, newdatoscomp) {
    datospizza = newdatospizza;
    datoscont = newdatoscomp;
    console.log("datos cargados");
}

function agregarCarrito() {
//    var refMenu = document.getElementById(idtabla);4ex
    var refnombre = document.getElementById("pepenombre");
    var refprecio = document.getElementById("pepeprecio");
    var reftam = document.getElementById("pepetam");
    if (refnombre) {
        var codigo = refnombre.innerHTML;
        var precio = refprecio.value;
        var tamano = reftam.value;
        if (codigo !== "null") {
            console.log("Seleccionando producto: " + codigo + ", " + precio + ", " + tamano);
            var pipsa = new Pizza(codigo,precio,tamano);
            tablaFactura.push(pipsa);
            //productoSeleccionado = obtenerProducto(codigo);
        } else {
            productoSeleccionado = null;
            console.error("No se ha seleccionado el producto.");
        }
    }
}

function modificarPrecio1() {
    var reftam = document.getElementById("pepetam");
    if (reftam) {
        var tamano = reftam.value;
        if (tamano === "grande") {
            preciopepe = 5000;
        }
        if (tamano === "familiar") {
            preciopepe = 7000;
        }
        if (tamano === "personal") {
            preciopepe = 3000;
        }
        modificarPreciopepe();
    }
}

function modificarPreciopepe(){
    var objetivo = document.getElementById('pepeprecio');
    objetivo.value = preciopepe;
   // objetivo.innerHTML = preciopepe;
}
function modificarPrecio2() {
    var reftam = document.getElementById("supretam");
    if (reftam) {
        var tamano = reftam.value;
        if (tamano === "grande") {
            preciosupre = 6000;
        }
        if (tamano === "familiar") {
            preciosupre = 8000;
        }
        if (tamano === "personal") {
            preciosupre = 3500;
        }
        modificarPreciosupre();
    }
}

function modificarPreciosupre(){
    var objetivo = document.getElementById('supreprecio');
    objetivo.value = preciosupre;
   // objetivo.innerHTML = preciopepe;
}
//--------------------------------------------------------------------------------
function modificarPrecio3() {
    var reftam = document.getElementById("hawatam");
    if (reftam) {
        var tamano = reftam.value;
        if (tamano === "grande") {
            preciohawa = 5000;
        }
        if (tamano === "familiar") {
            preciohawa = 7000;
        }
        if (tamano === "personal") {
            preciohawa = 3000;
        }
        modificarPreciohawa();
    }
}

function modificarPreciohawa(){
    var objetivo = document.getElementById('hawaprecio');
    objetivo.value = preciohawa;
   // objetivo.innerHTML = preciopepe;
}
//--------------------------------------------------------------------------------
function modificarPrecio4() {
    var reftam = document.getElementById("margatam");
    if (reftam) {
        var tamano = reftam.value;
        if (tamano === "grande") {
            preciomarga = 5000;
        }
        if (tamano === "familiar") {
            preciomarga = 7000;
        }
        if (tamano === "personal") {
            preciomarga = 3000;
        }
        modificarPreciomarga();
    }
}

function modificarPreciomarga(){
    var objetivo = document.getElementById('margaprecio');
    objetivo.value = preciomarga;
   // objetivo.innerHTML = preciopepe;
}
//--------------------------------------------------------------------------------
function modificarPrecio5() {
    var reftam = document.getElementById("chicatam");
    if (reftam) {
        var tamano = reftam.value;
        if (tamano === "grande") {
            preciochica = 5000;
        }
        if (tamano === "familiar") {
            preciochica = 7000;
        }
        if (tamano === "personal") {
            preciochica = 3000;
        }
        modificarPreciochica();
    }
}

function modificarPreciochica(){
    var objetivo = document.getElementById('chicaprecio');
    objetivo.value = preciochica;
   // objetivo.innerHTML = preciopepe;
}
//--------------------------------------------------------------------------------
function modificarPrecio6() {
    var reftam = document.getElementById("jyqtam");
    if (reftam) {
        var tamano = reftam.value;
        if (tamano === "grande") {
            preciojyq = 5000;
        }
        if (tamano === "familiar") {
            preciojyq = 7000;
        }
        if (tamano === "personal") {
            preciojyq = 3000;
        }
        modificarPreciojyq();
    }
}

function modificarPreciojyq(){
    var objetivo = document.getElementById('jyqprecio');
    objetivo.value = preciojyq;
   // objetivo.innerHTML = preciopepe;
}

function agregarCarrito2() {
    var refnombre = document.getElementById("suprenombre");
    var refprecio = document.getElementById("supreprecio");
    var reftam = document.getElementById("supretam");
    if (refnombre) {
        var codigo = refnombre.innerHTML;
        var precio = refprecio.value;
        var tamano = reftam.value;
        if (codigo !== "null") {
            console.log("Seleccionando producto: " + codigo + ", " + precio + ", " + tamano);
            var pipsa = new Pizza(codigo,precio,tamano);
            tablaFactura.push(pipsa);
        } else {
            productoSeleccionado = null;
            console.error("No se ha seleccionado el producto.");
        }
    }
}
function agregarCarrito3() {
    var refnombre = document.getElementById("hawanombre");
    var refprecio = document.getElementById("hawaprecio");
    var reftam = document.getElementById("hawatam");
    if (refnombre) {
        var codigo = refnombre.innerHTML;
        var precio = refprecio.value;
        var tamano = reftam.value;
        if (codigo !== "null") {
            console.log("Seleccionando producto: " + codigo + ", " + precio + ", " + tamano);
            var pipsa = new Pizza(codigo,precio,tamano);
            tablaFactura.push(pipsa);
        } else {
            productoSeleccionado = null;
            console.error("No se ha seleccionado el producto.");
        }
    }
}
function agregarCarrito4() {
    var refnombre = document.getElementById("marganombre");
    var refprecio = document.getElementById("margaprecio");
    var reftam = document.getElementById("margatam");
    if (refnombre) {
        var codigo = refnombre.innerHTML;
        var precio = refprecio.value;
        var tamano = reftam.value;
        if (codigo !== "null") {
            console.log("Seleccionando producto: " + codigo + ", " + precio + ", " + tamano);
            var pipsa = new Pizza(codigo,precio,tamano);
            tablaFactura.push(pipsa);
        } else {
            productoSeleccionado = null;
            console.error("No se ha seleccionado el producto.");
        }
    }
}
function agregarCarrito5() {
    var refnombre = document.getElementById("chicanombre");
    var refprecio = document.getElementById("chicaprecio");
    var reftam = document.getElementById("chicatam");
    if (refnombre) {
        var codigo = refnombre.innerHTML;
        var precio = refprecio.value;
        var tamano = reftam.value;
        if (codigo !== "null") {
            console.log("Seleccionando producto: " + codigo + ", " + precio + ", " + tamano);
            var pipsa = new Pizza(codigo,precio,tamano);
            tablaFactura.push(pipsa);
        } else {
            productoSeleccionado = null;
            console.error("No se ha seleccionado el producto.");
        }
    }
}
function agregarCarrito6() {
    var refnombre = document.getElementById("jyqnombre");
    var refprecio = document.getElementById("jyqprecio");
    var reftam = document.getElementById("jyqtam");
    if (refnombre) {
        var codigo = refnombre.innerHTML;
        var precio = refprecio.value;
        var tamano = reftam.value;
        if (codigo !== "null") {
            console.log("Seleccionando producto: " + codigo + ", " + precio + ", " + tamano);
            var pipsa = new Pizza(codigo,precio,tamano);
            tablaFactura.push(pipsa);
        } else {
            productoSeleccionado = null;
            console.error("No se ha seleccionado el producto.");
        }
    }
}

function Pizza(nombre,precio,tamano){
    this.nombre = nombre;
    this.precio = precio;
    this.tamano = tamano;
}

