/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* global fetch */
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
var codpepe = null;
var codsupre = null;
var codhawa = null;
var codmarga = null;
var codchica = null;
var codjyq = null;
var total = 0;
function init() {
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
            console.log("Seleccionando producto: " + codigo + ", " + precio + ", " + tamano+", " + codpepe);
            var pipsa = new Pizza(codigo, precio, tamano, codpepe);
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
            codpepe = "ssg5";
        }
        if (tamano === "familiar") {
            preciopepe = 7000;
            codpepe = "ssm5";
        }
        if (tamano === "personal") {
            preciopepe = 3000;
            codpepe = "ssp5";
        }
        modificarPreciopepe();
    }
}

function modificarPreciopepe() {
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
            codsupre = "sg5";
        }
        if (tamano === "familiar") {
            preciosupre = 8000;
            codsupre = "sm5";
        }
        if (tamano === "personal") {
            preciosupre = 3500;
            codspre = "sp5";
        }
        modificarPreciosupre();
    }
}

function modificarPreciosupre() {
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
            codhawa = "hg5";
        }
        if (tamano === "familiar") {
            preciohawa = 7000;
            codhawa = "hm5";
        }
        if (tamano === "personal") {
            preciohawa = 3000;
            codhawa = "hp5";
        }
        modificarPreciohawa();
    }
}

function modificarPreciohawa() {
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
            codmarga = "mg5";
        }
        if (tamano === "familiar") {
            preciomarga = 7000;
            codmarga = "mm5";
        }
        if (tamano === "personal") {
            preciomarga = 3000;
            codmarga = "mp5";
        }
        modificarPreciomarga();
    }
}

function modificarPreciomarga() {
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
            codchica = "cg5";
        }
        if (tamano === "familiar") {
            preciochica = 7000;
            codchica = "cm5";
        }
        if (tamano === "personal") {
            preciochica = 3000;
            codchica = "cp5";
        }
        modificarPreciochica();
    }
}

function modificarPreciochica() {
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
            codjyq = "vg5";
        }
        if (tamano === "familiar") {
            preciojyq = 7000;
            codjyq = "vm5";
        }
        if (tamano === "personal") {
            preciojyq = 3000;
            codjyq = "vp5";
        }
        modificarPreciojyq();
    }
}

function modificarPreciojyq() {
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
            var pipsa = new Pizza(codigo, precio, tamano);
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
            var pipsa = new Pizza(codigo, precio, tamano);
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
            var pipsa = new Pizza(codigo, precio, tamano);
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
            var pipsa = new Pizza(codigo, precio, tamano);
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
            var pipsa = new Pizza(codigo, precio, tamano);
            tablaFactura.push(pipsa);
        } else {
            productoSeleccionado = null;
            console.error("No se ha seleccionado el producto.");
        }
    }
}


function EnviarFactura() {
    console.log("Enviando factura a ServicioFactura");
    var data = new FormData();
    var datos = JSON.stringify(tablaFactura);
    data.append('Factura', datos);
    data.set('Factura', datos);
    data.forEach((value, key) => {
        console.log(key + " " + value)
    });

    getJSON('ServicioFactura', data, procesarRespuesta);
}
function procesarRespuesta(datos) {
    console.log(datos);
//    actualizarCodigo(datos);
    eliminarTabla();
}

function eliminarTabla() {
    var refTabla = document.getElementById("cuerpoTabla");
    if (refTabla) {

        for (var i = 0; i < refTabla.rows.length; i++) {
        tablaFactura.splice(i, 1);
        refTabla.deleteRow(i-i);
        }

    }

}

function guardarFactura() {
    localStorage.setItem("Factura", JSON.stringify(tablaFactura));
}

function cargarFactura() {
    var guardado = localStorage.getItem("Factura");
    tablaFactura = JSON.parse(guardado);
    console.log('objetoObtenido: ', JSON.parse(guardado));
    agregarDatos();
}

function initCarrito() {
    cargarFactura();
}

function agregarDatos() {
    var productos = tablaFactura;
    for (var i = 0; i < productos.length; i++) {
        var producto = productos[i];
        total += parseInt(producto.precio);
        agregar(producto);
    }
    var reftotal = document.getElementById("total");
    reftotal.innerText = total;
}

function agregar(nuevoProducto) {
    var refTabla = document.getElementById("cuerpoTabla");
    if (refTabla && nuevoProducto) {
        var datosProducto = {
            tipo: "Pizza",
            nombre: nuevoProducto.nombre,
            precio: nuevoProducto.precio,
            tamano: nuevoProducto.tamano,
            cantidad: 1
        };
        console.log("Agregando producto: " + JSON.stringify(nuevoProducto));
        var indice = refTabla.rows.length;
        var nuevaFila = refTabla.insertRow(-1);
        var nuevaCelda;
        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.innerText = datosProducto.tipo;
        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.id = "nom" + indice.toString();
        nuevaCelda.innerText = nuevoProducto.nombre;
        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.id = "tam" + indice.toString();
        nuevaCelda.innerText = nuevoProducto.tamano;
        // La cantidad del producto se muestra en un campo editable.
        // El atributo 'indice' sirve para identificar a cuál
        // producto se refiere el campo, por medio de la posición
        // en la tabla de productos.

        nuevaCelda = nuevaFila.insertCell(-1);
        var campo = document.createElement("INPUT");
        campo.setAttribute("type", "number");
        campo.setAttribute("min", 0.0);
        campo.setAttribute("max", 1000.0);
        campo.setAttribute("indice", indice);
        campo.value = datosProducto.cantidad;
        //campo.onchange = actualizarCampo;
        nuevaCelda.appendChild(campo);
        // El valor del subtotal debe tener un atributo 'id', para poder
        // referenciarlo cuando se actualiza la cantidad.

        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.id = "total" + indice.toString();
        // nuevaCelda.id = "total" + String(indice);
//        nuevaCelda.className = "c2";
        nuevaCelda.innerText = nuevoProducto.precio;
        // Por último, se coloca un botón para indicar cuando una fila
        // debe eliminarse. Observe que el atributo 'indice' es asignado
        // al botón, pero el evento es manejado por el icono asignado.

        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.className = "c3";
        var btn = document.createElement("BUTTON");
        btn.className = "btn";
        btn.setAttribute("indice", indice);
        btn.innerHTML = "<i class='material-icons' onclick='eliminarFila();'>delete</i>";
        nuevaCelda.appendChild(btn);
        // Ya se ha incluido el producto, por lo que hay que recalcular
        // los subtotales y el total general.

//        actualizarTabla();
//
//        actualizarMenu();
//        actualizarCodigo();
    }
}

function eliminarFila() {
    console.log("Se deberia eliminar un elemento");
    var x = JSON.parse(event.target.parentNode.getAttribute("indice"));
    console.log(x);
    eliminar(JSON.parse(event.target.parentNode.getAttribute("indice")));
}

function eliminar(fila) {
    console.log("Eliminando fila: " + fila);
    var refTabla = document.getElementById("cuerpoTabla");
    if (refTabla) {

//var codigo = tablaFactura[fila].codigo;

// Elimina la fila de la tabla de datos y de la tabla mostrada
// en la página.
        var lugar = "total" + String(fila);
        var refSubtotal = document.getElementById(lugar);
        restarTotal(refSubtotal.innerText);
        //-------------------------------------------------------------------
//        var refnom = "nom" + String(fila);
        var refnom = document.getElementById("nom" + String(fila));
//        var reftam = "tam" + String(fila);
        var reftam = document.getElementById("tam" + String(fila));
        eliminarenFactura(refnom.innerText, reftam.innerText);
        //-------------------------------------------------------------------
        tablaFactura.splice(fila, 1);
        refTabla.deleteRow(fila);

        for (var i = fila; i < refTabla.rows.length; i++) {
            var refFila = refTabla.rows[i];
//
            var campo = refFila.getElementsByTagName("INPUT")[0];
            campo.setAttribute("indice", i);
            var refSubtotal = document.getElementById("total" + String(i + 1));
            var refnom = document.getElementById("nom" + String(i + 1));
            var reftam = document.getElementById("tam" + String(i + 1));


            refSubtotal.id = "total" + String(i);
            refnom.id = "nom" + String(i);
            reftam.id = "tam" + String(i);
//
            var btn = refFila.getElementsByTagName("I")[0].parentNode;
            btn.setAttribute("indice", i);
        }
    }
}

function restarTotal(yeye) {
    total -= parseInt(yeye);
    var reftotal = document.getElementById("total");
    reftotal.innerText = total;
}

function eliminarenFactura(refnom, reftam) {
    var productos = tablaFactura;
    for (var i = 0; i < productos.length; i++) {
        var producto = productos[i];
        if (producto.nombre === refnom && producto.tamano === reftam) {
            tablaFactura.splice(i, 1);
        }
    }
}


function Pizza(nombre, precio, tamano,cod) {
    this.nombre = nombre;
    this.precio = precio;
    this.tamano = tamano;
    this.codigo = cod;
}

