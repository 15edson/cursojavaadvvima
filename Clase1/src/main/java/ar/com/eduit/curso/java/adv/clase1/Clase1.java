package ar.com.eduit.curso.java.adv.clase1;
public class Clase1 {
    public static void main(String[] args) {
        //while(true);
        /*
        Curso: Java advanced 15 hs
        Días: Viernes 10:00 13:00 hs
        Profe: Carlos Ríos  carlos.rios@educacionit.com
        
        Software:       JDK 8.X  o 11
        
        LTS: Long Term Support      8 años
        
        Version         Liberado            Vence
        JDK 8 LTS       Marzo 2014          Marzo 2022
        JDK 9           Septiembre 2017     Marzo 2018
        JDK 10          Marzo 2018          Septiembre 2018
        JDK 11 LTS      Septiembre 2018     Septiembre 2026
        JDK 12          Marzo 2019          Septiembre 2019
        JDK 13          Septiembre 2019     Marzo 2020
        JDK 14 LTS      Marzo 2020          Marzo 2028
        
        */
        
        /*
        Tarea 1     Abrir y cargar File1 del medio 1            10s
        Tarea 2     Abrir y cargar File2 del medio 2            10s
        Tarea 3     Abrir form y mostrar contenidos file 1 y 2   1s
        
          Tarea 1    Tarea 2   Tarea 3
        |----------|----------|-|
            10 s      10 s     1 s
        
        Total: 21 s
        
          Tarea 1
        |----------|
            10 s
        
          Tarea 2
        |----------|
            10 s
        
                     Tarea 3
                    |-|
                     1 s
        
        Total: 11 s
        
          Tarea 1
        |----------|
            10 s
        
          Tarea 2
        |----------|
            10 s
        
         Tarea 3
        |-|
         1 s
        
        Total: 10 s
        */
        
        //declaración de clase interna
        class HiloT extends Thread{
            //Las clases que heredan de Thread pueden abrir un hilo nuevo
            String nombre;

            public HiloT(String nombre) {
                this.nombre = nombre;
            }
            
            @Override
            public void run(){
                //El método run es el unico método que puede ejecutarse en 
                //un nuevo hilo
                for (int i = 1; i <= 10; i++) {
                    System.out.println(nombre+" "+i);
                    try { Thread.sleep(1000); } catch(Exception e){}
                }
            }
        }//end class HiloT
        
        HiloT hiloT1=new HiloT("hilo 1");
        HiloT hiloT2=new HiloT("hilo 2");
        HiloT hiloT3=new HiloT("hilo 3");
        HiloT hiloT4=new HiloT("hilo 4");
        
        // El método run() no se ejecuta en un hilo nuevo
        //hiloT1.run();
        //hiloT2.run();
        //hiloT3.run();
        //hiloT4.run();
        
        
        // el método start() invoca al método run() en un nuevo hilo
        //hiloT1.start();
        //hiloT2.start();
        //hiloT3.start();
        //hiloT4.start();
        
        
        //Interfaz Runnable
        class HiloR implements Runnable{
            String nombre;

            public HiloR(String nombre) {
                this.nombre = nombre;
            }
            
            @Override
            public void run() {
               for(int a=1;a<=10;a++){
                   System.out.println(nombre+" "+a);
                   try{ Thread.sleep(1000); }catch(Exception e){}
               }
            }
            
        }//end HiloR
        
        HiloR hiloR1=new HiloR("hilo1");
        HiloR hiloR2=new HiloR("hilo2");
        HiloR hiloR3=new HiloR("hilo3");
        HiloR hiloR4=new HiloR("hilo4");
        
        Thread tHiloR1=new Thread(hiloR1);
        Thread tHiloR2=new Thread(hiloR2);
        Thread tHiloR3=new Thread(hiloR3);
        Thread tHiloR4=new Thread(hiloR4);
        
        tHiloR1.start();
        tHiloR2.start();
        tHiloR3.start();
        tHiloR4.start();
        new Thread(new HiloR("hilo5")).start();
        
        
    }//end main
}//end Clase1
