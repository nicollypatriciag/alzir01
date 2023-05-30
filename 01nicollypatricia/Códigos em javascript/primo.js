function numeroPrimo(numero) {
    let primo = true;
    for(let contador = 2; contador < numero; contador++) {
      if(numero % contador === 0) {
        primo = false;
        break;
      }
    }
    if(primo == true) {
     console.log(`O valor ${numero} é primo!`);
    } else {
      console.log(`O valor ${numero} não é primo!`);
    }
   }

let c = numeroPrimo(4);
