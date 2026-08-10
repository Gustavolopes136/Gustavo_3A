// Exercícios de JavaScript PARTE 2

//1
let inicio = Number(prompt("Digite o início do intervalo:"));
let fim = Number(prompt("Digite o fim do intervalo:"));

console.log("Números ímpares:");

for (let i = inicio; i <= fim; i++) {
    if (i % 2 !== 0) {
        console.log(i);
    }
}

//2
let numero = Number(prompt("Digite um número:"));
let primo = true;

if (numero < 2) {
    primo = false;
}

for (let i = 2; i < numero; i++) {
    if (numero % i === 0) {
        primo = false;
        break;
    }
}

if (primo) {
    console.log(numero + " é primo.");
} else {
    console.log(numero + " não é primo.");
}
//3
while (true) {

    let nomeProduto = prompt("Digite o nome do produto ou 'sair' para encerrar:");

    if (nomeProduto.toLowerCase() === "sair") {
        break;
    }

    let dataVencimento = prompt("Digite a data de vencimento (AAAA-MM-DD):");

    let hoje = new Date();
    let vencimento = new Date(dataVencimento);

    if (vencimento < hoje) {
        console.log(nomeProduto + " está vencido.");
    } else {
        console.log(nomeProduto + " não está vencido.");
    }
}

//4
let nigeria = 195.9;
let china = 1393;
let ano = 0;

while (nigeria <= china) {

    nigeria = nigeria + (nigeria * 0.038);
    china = china + (china * 0.0037);

    ano++;

    console.log("Ano " + ano);
    console.log("Nigéria: " + nigeria.toFixed(2) + " milhões");
    console.log("China: " + china.toFixed(2) + " milhões");
    console.log("-------------------------");
}

console.log("A Nigéria ultrapassará a China após " + ano + " anos.");

//5
let carro1 = 10;
let carro2 = 20;
let volta = 0;

while (carro1 <= carro2) {

    volta++;

    carro1 = carro1 + 3;
    carro2 = carro2 + 1.5;

    console.log("Volta: " + volta);
    console.log("Carro 1: " + carro1 + " km/h");
    console.log("Carro 2: " + carro2 + " km/h");
    console.log("----------------------");
}

console.log("O carro 1 ultrapassou o carro 2!");
console.log("Total de voltas: " + volta);
//6
let baseMaior = 120;
let baseMenor = 75;
let altura = 145;

let larguraPalco = 15;
let alturaPalco = 8.5;

// Área do trapézio
let areaTrapezio = ((baseMaior + baseMenor) * altura) / 2;

// Área do palco
let areaPalco = larguraPalco * alturaPalco;

// Área disponível para o público
let areaPublico = areaTrapezio - areaPalco;

// 4 pessoas por m²
let ingressos = areaPublico * 4;

console.log("Área do trapézio: " + areaTrapezio + " m²");
console.log("Área do palco: " + areaPalco + " m²");
console.log("Área disponível: " + areaPublico + " m²");
console.log("Quantidade de ingressos: " + Math.floor(ingressos));
//7
let pes = Number(prompt("Digite a altura em pés:"));

let metros = pes * 0.3048;

console.log("Altura em metros: " + metros.toFixed(2) + " m");

//8
let valor = 360;

let valorTotal = valor / 0.80;

console.log("Valor correspondente a 100%: R$ " + valorTotal.toFixed(2));

//9
let mariana = 18;
let sabrina = 22;

let gabriel = ((mariana + sabrina) / 4) + 17;

console.log("Gabriel tem " + gabriel + " pontos.");

//10
let primeiroNome = "Will";
let segundoNome = "Lucas";

for (let i = 1; i <= 5; i++) {

    let temporario = primeiroNome;

    primeiroNome = segundoNome;
    segundoNome = temporario;

    console.log("Interação " + i);
    console.log("Primeiro nome: " + primeiroNome);
    console.log("Segundo nome: " + segundoNome);
    console.log("--------------------");
}
//11
let largura = Number(prompt("Digite a largura:"));
let altura = Number(prompt("Digite a altura:"));

for (let i = 0; i < altura; i++) {

    let linha = "";

    for (let j = 0; j < largura; j++) {
        linha += "* ";
    }

    console.log(linha);
}

//12
for (let i = 0; i <= 1000; i += 10) {
    console.log(i);
}

//13
let numero = Number(prompt("Digite o número:"));
let expoente = Number(prompt("Digite o expoente:"));

let resultado = 1;

for (let i = 1; i <= expoente; i++) {
    resultado *= numero;
}

console.log("Resultado: " + resultado);
//14
for (let i = 99; i >= 1; i -= 2) {
    console.log(i);
}

//15
//Dia 1 → R$ 2
//Dia 2 → R$ 4
//Dia 3 → R$ 6
//...
//Dia 12 → R$ 24

let total = 0;
let deposito = 2;

for (let dia = 1; dia <= 12; dia++) {

    total += deposito;

    console.log(
        "Dia " + dia +
        ": R$ " + deposito.toFixed(2)
    );

    deposito += 2;
}

console.log("Total acumulado: R$ " + total.toFixed(2));

//16
let agua = 150;

while (agua >= 7) {

    agua -= 7;

    console.log("Água restante: " + agua + " litros");
}

console.log("Água restante no final: " + agua + " litros");

//17
let tempo = 0;

for (let degrau = 1; degrau <= 20; degrau++) {

    tempo += 3;

    console.log(
        "Degrau " + degrau +
        ": " + tempo + " segundos"
    );
}
//18
for (let numero = 1; numero <= 25; numero++) {

    if (numero % 3 === 0) {
        console.log("Pulo");
    } else {
        console.log(numero);
    }
}
//19
let vezes = Number(prompt("Quantas vezes o eco acontece?"));

for (let i = 1; i <= vezes; i++) {

    let linha = "";

    for (let j = 1; j <= i; j++) {
        linha += "Olá ";
    }

    console.log(linha);
}