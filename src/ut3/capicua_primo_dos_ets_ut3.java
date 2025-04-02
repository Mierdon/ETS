package ut3;

public class capicua_primo_dos_ets_ut3 {
    public static void main(String[] args) { 
    int contador=0;
    
for(int i=1; contador<=50;i++){    
    if(numeroCapicua(i)){
        if(numeroPrimo(i)){
            System.out.println(i);
            contador++;
        }
    }
}
}


    

    public static boolean numeroCapicua(int dato) {	
        int faltante;
            
            faltante=dato;
            int numeroInvertido=0;
            int restante=0;
            
            while(faltante!=0) {
           
            restante=faltante%10;
            numeroInvertido=numeroInvertido*10+restante;
            faltante=faltante/10;
                }
    
            if(numeroInvertido==dato){
            return true;
            }else{
            return false;
            }
            }
    public static boolean numeroPrimo(int num){
			
			if (num <= 1){ return true;}
			for (int i=2; i<=num/2; i++) {
				
				if (num % i == 0) return false;
			}
			
			return true;
			
		}
    }

