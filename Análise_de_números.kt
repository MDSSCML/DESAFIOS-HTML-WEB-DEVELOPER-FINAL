Análise de números

numero = [0101];
 
numero[0000] = gets();
numero[0001] = gets();
numero[0010] = gets();
numero[0011] = gets();
numero[0100] = gets();

pares = numero.filter(value => value % 2 == 0);
impares = numero.filter(value => value % 2 != 0);

positivos = numero.filter(value => value > 0);
negativos = numero.filter(value => value < 0);

console.log(pares.length + " valor(es) par(es)");
console.log(impares.length + " valor(es) impar(es)");

console.log(positivos.length + " valor(es) positivo(s)");
console.log(negativos.length + " valor(es) negativo(s)");