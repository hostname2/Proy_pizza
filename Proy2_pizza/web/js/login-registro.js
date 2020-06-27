

function init() {
    var RefDiv = document.getElementById('regis');

    if (RefDiv) {
        var btn = document.createElement("Button");
        btn.className = 'btn2';
        btn.id = 'registrar-btn';
        btn.innerHTML = 'Regístrate';
        RefDiv.appendChild(btn);
    }

    document.getElementById('registrar-btn').addEventListener('click',
            function () {
                document.querySelector('.bg-register').style.display = 'flex';
            });
}

function ceclose() {
    document.getElementById('close').addEventListener('click',
            function () {
                document.querySelector('.bg-register').style.display = 'none';
            });
}

