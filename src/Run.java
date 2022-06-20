public class Run {
    public static int elevarConModulo(int base, int exponente, int modulo){
        int resultado=1;
        //aqui se va a ir guardando el resultado de las operaciones intermedias y al final sera devuelto como resultado
        String cadena=decToBin(exponente);
        //en la variable cadena meto una cadena con el equivalente del exponente en binario
        for (int x=0;x<cadena.length();x++){
            //bucle que va a ir recorriendo en numero binario de izquierda a derecha, ej el 4, 100->: 1,0,0
            if(cadena.charAt(x)=='1'){
                //si el caracter actual es 1 hace (resultaro^2*base)mod (modulo)
                resultado =(resultado*resultado*base)%modulo;
            }else{
                //si el caracter actual es 0 hace (resultaro^2)mod (modulo)
                resultado =(resultado*resultado)%modulo;
            }
        }

        return resultado;
    }
    public static String decToBin(int num){
        String binario;
        if(num<=1){
            //si el numero es 0 o 1 pone directamente 0 o 1 y acaba el programa
            binario = String.valueOf(num);

        }else{
            //si no cumple la condicion se inicializa como una cadena vacia
            binario="";
            while (num>1){
                //bucle que va añadiendo el resto de la division entera del numero entre 2 a la cadena de caracteres por la izquierda
                //hasta que num sea 1
                binario =String.valueOf(num%2) +binario;
                num=num/2;


            }
            //pone un uno al final de la cadena de caracteres concluyendo el paso a binario
            binario ="1"+binario;


        }
        return binario;
    }
    public static void main(String[] args) {

        System.out.println(elevarConModulo(2,46,11));
    }
}
