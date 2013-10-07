  function validarprofessor() {
var nome = cadastrarProfessor.nome.value;
var sobrenome = cadastrarProfessor.sobrenome.value;
var email = cadastrarProfessor.email.value;
var data = cadastrarProfessor.data.value;
var rg = cadastrarProfessor.rg.value;
var cpf = cadastrarProfessor.cpf.value;
var usuario = cadastrarProfessor.usuario.value;
var senha = cadastrarProfessor.senha.value;

if (usuario == "") {
alert('Preencha o campo com seu Usuario');
cadastrarProfessor.usuario.focus();
return false;
}
if (sobrenome == "") {
alert('Preencha o campo com seu Sobrenome');
cadastrarProfessor.sobrenome.focus();
return false;
}
if (data == "") {
alert('Preencha o campo com sua Data');
cadastrarProfessor.data.focus();
return false;
}
if (rg == "") {
alert('Preencha o campo com seu RG');
cadastrarProfessor.rg.focus();
return false;
}
if (cpf == "") {
alert('Preencha o campo com seu CPF');
cadastrarProfessor.cpf.focus();
return false;
}
if (email == "") {
alert('Preencha o campo com seu E-Mail');
cadastrarProfessor.email.focus();
return false;
}
if (nome == "") {
alert('Preencha o campo com seu Nome');
cadastrarProfessor.nome.focus();
return false;
}
if (senha == "") {
alert('Preencha o campo com sua senha');
cadastrarProfessor.senha.focus();
return false;
}
}