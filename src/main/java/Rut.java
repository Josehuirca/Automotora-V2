import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rut {
    public void ValidarRut() throws IOException {

        int rut,digito,suma,resto,resultado,factor;
        String rutString;

        InputStreamReader e = new InputStreamReader(System.in);
        BufferedReader ingreso = new BufferedReader(e);

        do{
            System.out.println("RUT");
            System.out.println("Ingrese rut sin digito verificador y sin puntos ni guion:");

            rutString = ingreso.readLine();
            rut = Integer.parseInt(rutString);

        } while(rut <= 8);

        for(factor = 2, suma = 0; rut > 0; factor++){

            digito = rut % 10;
            rut /= 10;
            suma += digito * factor;

            if(factor >= 7) factor = 1;

        }

        resto = suma % 11;
        resultado = 11 -resto;

        System.out.println("El digito verificador es: ");

        if(resultado < 10) System.out.println(resultado+"\n");
        else if (resultado == 10) System.out.println("K\n");
        else System.out.println("0\n");


    }
}
