function MDC(a,b){
  
    for(let i=b;i>1;i--){
      
      if(a%i == 0 && b%i==0){
        return i;
      }
    }
    
    
  }
  console.log("MDC: ");
  console.log(MDC(16,36));
  