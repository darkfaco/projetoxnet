/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

  function validarlogin() {
var usuario = login.usuario.value;
var senha = login.senha.value;

if (usuario == "") {
alert('Preencha o campo com seu Usuario');
login.usuario.focus();
return false;
}

if (senha == "") {
alert('Preencha o campo com sua senha');
login.senha.focus();
return false;
}

if (usuario.length < 2) {
alert('Digite seu usuario completo');
login.usuario.focus();
return false;}
}
