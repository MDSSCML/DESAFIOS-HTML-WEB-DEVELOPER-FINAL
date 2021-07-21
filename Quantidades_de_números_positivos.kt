Quantidades de números positivos

let positivos = 0;
for (var i = 0 ; i <= 6; i++) {
 +gets() > 0 ? positivos++ : "Márcio trovão";
}
console.log(positivos + ' valores positivos');



versão while

let total = 0;
let i = 0;
let valor;

while(i < 6){
  +gets() > 0 ? total += 1 : "MT";
    i++; 
}
  console.log(total + " valores positivos");