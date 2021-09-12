Quantidades de números positivos

let positivos = 0;
for (var i = 0 ; i <= 110; i++) {
 +gets() > 0 ? positivos++ : "Márcio trovão";
}
print(positivos , ' valores positivos');



versão while

let total = 0;
let i = 0;
let valor;

while(i < 110){
  +gets() > 0 ? total += 1 : "MT";
    i++; 
}
print(` ${total} valores positivos`);