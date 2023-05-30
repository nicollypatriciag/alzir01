const numero = 5;
let n1 = 0, n2 = 1, proxTermo;

console.log("Fibonacci:");

for (let i = 1; i <= numero; i++) {
    console.log(n1);
    proxTermo = n1 + n2;
    n1 = n2;
    n2 = proxTermo;
}
