
/**
 * Write a description of class Reloj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private int hora;
    
    private int minutos;
    
    
    /**
     * Constructor for objects of class Reloj
     */
    public ClockDisplay()
    {
        hora = 0;
        minutos = 0;
      
    }
    /**
     * Metodo que permite cambiar la hora
     */
    public void setTime(int valorHora, int valorMinutos)
    {
        if (valorHora <= 23 && valorHora >=0 && valorMinutos <= 59 && valorMinutos >=0)
        {
            hora = valorHora;
            minutos = valorMinutos;
        }
        else
        {
            System.out.println("La hora: " + valorHora + ":" + valorMinutos + " no existe");
        }
    }
    
    /**
     * Añade un minuto al tiempo
     */
    public void timeTick()
    {
        minutos = minutos + 1;
        if ( minutos == 60)
        {
         minutos = 0;
         hora = hora + 1;
        }
        if (hora == 24)
        {
          minutos = 0;
          hora =0;
        }
    }
    /**
     * Muestra por pantalla la hora
     */
    public void getTime()
    { 
       if (hora < 10 && minutos > 10)
       {
           System.out.println("0"+hora + ":" + minutos);
       }
       if(minutos < 10 && hora > 10)
       {
           System.out.println(hora + ":0" + minutos);
    
       }
       if (hora < 10 && minutos < 10)
       {
           System.out.println("0"+hora + ":0" + minutos);
       }
       if (hora > 10 && minutos > 10)
       {
           System.out.println(hora + ":" + minutos);
       }
    }
}

