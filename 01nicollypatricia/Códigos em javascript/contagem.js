let n = 5;
console.log(n);
let valor;
let intcont = 0;
let cont = 0.0;
let i = 0;

    valor = [2.5, 6, 1, 3.9, 4];
for(let j=0; j<valor.length;j++){
    if(valor[j] % 1 === 0 ){
        intcont = intcont + 1;
    }else{
        cont = cont + 1;
    
    }
}
console.log("Numeros que são inteiros são: " + intcont);
console.log("Numeros que não são inteiros são: " + cont);