Contagem de cédulas

let valor_entrada = parseInt(gets());

const cedulas = [100, 50, 20, 10, 5, 2, 1];

console.log(valor_entrada);

for (let cedula of cedulas) {
    let qtd_cedula = parseInt(valor_entrada / cedula);

    console.log(qtd_cedula + " nota(s) de R$ " + cedula + ",00 ");

    valor_entrada %= cedula;

}