
/**
 * Un ejemplo que modela un Televisor simple usando POO
 * 
 * @author (Milton Jes�s Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Televisor
{
   /**
    * Tipo de entrada
 	*   0 = Apagado
 	*   1 = Antena (maximo 13 canales)
 	*   2 = Cable (el maximo de canales es 100)
 	*   3 = Auxiliar (DVD, VH, etc), un canal
    **/
   protected int tipoDeEntrada;
   
   /**Volumen del televisor*/
   protected int volumen;
   
   /**
    * Canal sintonizado, si la entrada es auxiliar, el canal es el 1, 2  3
    **/
   protected int canal;
   
   /**Constante maximo volumen*/
   public static final int maximoVolumen = 20;
   
   /**Constante tipo de entarda apagado*/
   public static final int apagado = 0;
   
   /**Constante tipo de entarda antena*/
   public static final int antena = 1;
   
   /**Constante tipo de entarda cable*/
   public static final int cable = 2;
   
   /**Constante tipo de entarda auxiliar*/
   public static final int auxiliar = 3;
   
   /**Arreglo constante con nombres de cada entrada*/
   public static final String [] tiposDeEntrada = {"Apagado", "Antena", "Cable", "Auxiliar"};
   

   /**Constructor que inicializa con valores por defecto*/
   public Televisor()
   {
   }//Fin constructor default

   /***
    * Construye un televisor inicializando sus propiedades con los par�metros recibidos
    * @param    tipoDeEntrada valor inicial de la propiedad tipoDeEntrada
    * @param    volumen valor inicial de la propiedad volumen
    * @param    canal valor inicial de la propiedad canal
    */
   public Televisor(int tipoDeEntrada, int volumen,int canal)
   {
     this.tipoDeEntrada=tipoDeEntrada;
     this.canal=canal;
     this.volumen=volumen;
    }//Fin constructor con par�metros

    /***
     * Sube el volumen del televisor
     * @return  true si pudo subirlo, false si lleg� al m�ximo
     */
    public boolean subirVolumen()
    {
       boolean sePuedeSubir = false;
       //COMPLETE EL ALGORITMO
       if(this.volumen<20)
       {
           volumen++;
           sePuedeSubir=true;
        }
       
       return sePuedeSubir;
    }//fin m�todo subirVolumen
    
    /***
     * Baja el volumen del televisor
     * @return  true si pudo bajar, false si lleg� al m�nimo (0)
     */
    public boolean bajarVolumen()
    {
       boolean sePuedeBajar = false;
       //COMPLETE EL ALGORITMO
       if(this.volumen>0){
           volumen--;
           sePuedeBajar=true;
        }
       return sePuedeBajar;
    }//fin m�todo bajarVolumen
    
    /***
     * Avanza el canal del televisor, si llega al m�ximo regresa al m�nimo
     */
    public void avanzarCanal()
    {
      //COMPLETE EL ALGORITMO
      switch(this.tipoDeEntrada){
          case 0:
          if(canal==3){
              canal=1;
            }
            else canal++;
            break;
          case 1:
          if(canal==13) canal=1;                       
            else canal++;
            break;
          case 2:
          if(canal==100){
              canal=1;
            }
            else canal++;
            break;
          case 3:
          if(canal==3){
              canal=1;
            }
            else canal++;
            break;
            
        }
    }//fin m�todo subirVolumen
    
    /***
     * Retrocede el canal del televisor, si llega al m�nimo pasa al m�ximo
     */
    public void retrocederCanal()
    {
      //COMPLETE EL ALGORITMO
       switch(this.tipoDeEntrada){
          case 0:
          if(canal==1){
              canal=3;
            }
            else canal--;break;
          case 1:
          if(canal==1){
              canal=13;
            }
            else canal--;break;
          case 2:
          if(canal==1){
              canal=100;
            }
            else canal--;break;
          case 3:
          if(canal==1){
              canal=3;
            }
            else canal--;break;
          
        
        }
    }//fin m�todo subirVolumen        
    
    /**
     * M�todo de acceso al canal m�ximo seg�n la entrada
     * @return el valor del m�ximo canal
     */
    public int getMaximoCanal()
    {
      int maximoCanal= 0;
      //COMPLETE EL ALGORITMO
      switch(this.tipoDeEntrada){
           
          case 0:
          maximoCanal=0;
          break;
          case 1:
          maximoCanal=13;
            break;
          case 2:
          maximoCanal=100;
          break;
          case 3:
          maximoCanal=3;
          break;
          default:
          maximoCanal=0;
          break;
        
        }
      return maximoCanal;
    }//fin getVolumen
    
    /**
     * M�todo de acceso a la propiedad volumen
     * @return el valor de volumen para �ste objeto Televisor
     */
    public int getVolumen()
    {
      return this.volumen;
    }//fin getVolumen
    
    /***
     * M�todo para modificaci�n de la propiedad volumen
     * @param   volumen el nuevo valor de la propiedad volumen
     */
    public void setVolumen(int volumen)
    {
       this.volumen = volumen;
    }//fin setVolumen   
    
    /**
     * M�todo de acceso a la propiedad canal
     * @return el valor de canal para �ste objeto Televisor
     */
    public int getCanal()
    {
       return this.canal;
    }//fin getCanal
    
    /***
     * M�todo para modificaci�n de la propiedad canal
     * @param   canal el nuevo valor de la propiedad canal
     */
    public void setCanal(int canal)
    {
       this.canal = canal;
    }//fin setCanal
    
    /**
     * M�todo de acceso a la propiedad tipoDeEntrada
     * @return el valor de tipoDeEntrada para �ste objeto Televisor
     */
    public String getTipoDeEntrada()
    {
       String rta = null;
       //COMPLETE EL ALGORITMO
       switch(this.tipoDeEntrada){
           case 0:
           rta=this.tiposDeEntrada[0];
           break;
           case 1:
           rta=this.tiposDeEntrada[1];
           break;
           case 2:
           rta=this.tiposDeEntrada[2];
           break;
           case 3:
           rta=this.tiposDeEntrada[3];
           break;
        }
       
       
       return rta;
    }//fin getTipoDeEntrada
    
    /***
     * M�todo para modificaci�n de la propiedad tipoDeEntrada
     * @param   tipoDeEntrada el nuevo valor de la propiedad tipoDeEntrada
     */
    public void setTipoDeEntrada(int tipoDeEntrada)
    {
      //COMPLETE EL ALGORITMO
      this.tipoDeEntrada=tipoDeEntrada;
      setCanal(1);
    }//fin setTipoDeEntrada
    
   
    /***
     * Regresa una cadena String con los datos del Televisor
     * @override java.lang.Object.toString
     */
    public String toString()
    {
      String str = "\n**********Televisor**********\n";
      str = str + "Entrada: " + this.getTipoDeEntrada()+"\n";
      str = str + "Canal: "  + this.getCanal()+"\n";
      str = str + "Volumen: "  + this.getVolumen()+"\n";
      return str;
    }//fin toString
    
}//fin clase Televisor