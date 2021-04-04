Exibindo números pares

let num = parseInt(gets());
for (cont = 1; cont <= num; cont++) {
    if (cont % 2 == 0) {
        console.log(cont);
    }
}