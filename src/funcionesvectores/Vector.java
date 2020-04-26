/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesvectores;

import java.util.Random;/**
 *
 * @author usuario
 */
public class Vector {/*esta es la clase vector de la práctica anterior, con
                        algunas modificaciones (no muchas) */
    
    private int tamano;//define la cantidad de posiciones
    private int[] arreglo;//define el arreglo inicial
    private int posUltima;//define la última posición, es equivalente a la
                          //cantidad de elementos
    private boolean vacio;//define si el vector está vacío
    private boolean lleno;//define si el vector está lleno
    
    /**
     * Constructor 1 de la clase vector (tamaño indefinido).
     * Crea un vector de tamaño 10 por defecto
     */
    public Vector(){
        setTamano(10);
        this.arreglo= new int[tamano];
        setPosUltima(0);
        setVacio(true);
        setLleno(false);
}
    /**
     * Constructor 2 de la clase vector (tamaño definido)
     * Crea un vector con un tamaño específico
     * @param tamaño Define el tamaño que tendrá el vector
     */
    public Vector(int tamaño){
        setTamano(tamaño);
        this.arreglo=new int[tamano];
        setPosUltima(0);
        setVacio(true);
        setLleno(false);
    }
    
    /**
     * Aumenta en 10 el tamaño del vector para cuando los elementos superen el tamaño
     */
    public void aumentarTamaño(){
        int[] nuevoArreglo= new int[tamano+10];
        for (int i = 0; i < tamano; i++) {//este ciclo copia todos los elementos
                                        //del vector para que no se pierdan
            nuevoArreglo[i]=arreglo[i];
        }
        setTamano(tamano+10);
        arreglo=nuevoArreglo;
    }
    
    /**
     * Agrega un dato en la última posición vacía del vector
     * @param dato El número que se va a agregar
     */
    public void agregarDato(int dato){
        if (posUltima>=tamano){
            aumentarTamaño();
        }
        arreglo[posUltima]=dato;
        setPosUltima(posUltima+1);
        setVacio(false);                
    }
    
    /**
     * agrega un elemento en una posición específica
     * @param dato El número que se va a agregar al vector
     * @param pos  La posicion en que se va a agregar el número
     */
    public void agregarDato(int dato, int pos){
        if(pos >=0 && pos<=tamano){
            arreglo[pos]=dato;
            setVacio(false);
        }
        
    }
    
    /**
     * Agrega un número aleatorio al final, qe va desde -100n hasta 100n, donde n
     * es el tamaño del vector
     */
    public void agregarRandomFin(){
        Random rand = new Random();
        boolean signo = rand.nextBoolean();
        int num = rand.nextInt(100*tamano+1);
        if (signo==true){
            agregarDato(num);
        }
        else{
            agregarDato(-num);
        }
    }
    
    /**
     * Agrega un número aleatorio en una posición específica
     * @param posicion Es la posición (en base 0) en la que se va a agregar el número
     */
    public void agregarRandomEn(int posicion){
        Random rand = new Random();
        boolean signo = rand.nextBoolean();
        int num = rand.nextInt(100*tamano+1);
        if (signo==true){
            agregarDato(num, posicion);
        }
        else{
            agregarDato(-num, posicion);
        }
    }
    
    
    /**
     * suma todos los elementos que están en el vector
     * @return Devuelve la suma de todos los elementos del vector
     */
    public int sumarElementos(){
        int suma=0;
        for (int i = 0; i < posUltima; i++) {
            suma=suma+arreglo[i];
        }
        return(suma);
    }
    
    /**
     * Ordena los elementos del vector, ubicando los números de menor a mayor
     */
    public void ordenarAscendente(){
        if(posUltima>1){
            for (int i = 0; i < posUltima-1; i++) {
                for (int j = i+1; j < posUltima; j++) {
                    if(arreglo[i]>arreglo[j]){
                        int dato=arreglo[i];
                        arreglo[i]=arreglo[j];
                        arreglo[j]=dato;
                    }
                }
            }
        }
        
    }
    
    /**
     *Ordena los elementos del vector, ubicando los números de mayor a menor
     */
    public void ordenarDescendente(){
        if(posUltima>1){
            for (int i = 0; i < posUltima-1; i++) {
                for (int j = i+1; j < posUltima; j++) {
                    if(arreglo[i]<arreglo[j]){
                        int dato=arreglo[i];
                        arreglo[i]=arreglo[j];
                        arreglo[j]=dato;
                    }
                }
            }
        }
        
    }
    
    /**
     * Toma los números pares del vector y los envía a otro
     * @return Devuelve un vector con números pares
     */
    public Vector numerosPares(){
        Vector pares =new Vector();
        for (int i = 0; i < posUltima; i++) {
            if (arreglo[i]%2==0){
                pares.agregarDato(arreglo[i]);
            }
        }
        return(pares);
    }
    
    /**
     * Toma los números primos de un vector y los envía a otro
     * @return Devuelve un vector con los números primos del primero
     */
    public Vector numerosPrimos(){
        Vector primos =new Vector();
        for (int i = 0; i < posUltima; i++) {
            if(arreglo[i]>1){
                if(arreglo[i]==2 || arreglo[i]==3 || arreglo[i]==5){
                    primos.agregarDato(arreglo[i]);
                }
                else if(arreglo[i]%2 != 0){
                    for (int j = 3; j < (arreglo[i]/2+2); j+=2) {
                        if(j > arreglo[i]/2){
                            primos.agregarDato(arreglo[i]);
                        }
                        else if(arreglo[i]%j==0){
                            j=arreglo[i];                            
                        }
                    }
                }
            }
        }
        return(primos);
    }
    
    /**
     * Toma los números impares de un vector y los envía a otro
     * @return Devuelve un vector con los números impares
     */
    public Vector numerosImpares(){
        Vector impares =new Vector();
        for (int i = 0; i < posUltima; i++) {
            if (arreglo[i]%2==1){
                impares.agregarDato(arreglo[i]);
            }
        }
        return(impares);
    }
    
    /**
     * Muestra el vector completo por consola, incluyendo posiciones vacías
     */
    public void mostrarVector(){
        for (int i = 0; i < tamano; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
    /**
     * Muestra los elementos no vacíos del vector, siempre y cuando no hayan
     * elementos vacíos en medio
     */
    public void mostrarElementos(){//
        for (int i = 0; i < posUltima; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
    /**
     * devuelve un elemento en la posición (con base 0) dada
     * @param pos Posición en la que se busca el elemento
     * @return Devuelve el elemento especificado en "pos"
     */
    public int obtenerElemento(int pos){
        if (pos>=tamano || pos<0){
            return(0);
        }
        else{
            return(arreglo[pos]);
        }
    }
    
    /**
     * Intercambia la posición de dos elementos del vector
     * @param pos1 La posición del primer elemento
     * @param pos2 La posición del segundo elemento
     */
    public void intercambiarPosiciones(int pos1, int pos2){
        if (pos1 != pos2){
            int dato = arreglo[pos1];
            arreglo[pos1]=arreglo[pos2];
            arreglo[pos2]=dato;
        }
    }
    

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * @return the arreglo
     */
    public int[] getArreglo() {
        return arreglo;
    }

    /**
     * @param arreglo the arreglo to set
     */
    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    /**
     * @return the posicionUltima
     */
    public int getPosUltima() {
        return posUltima;
    }

    /**
     * @param posicionUltima the posicionUltima to set
     */
    public void setPosUltima(int posicionUltima) {
        this.posUltima = posicionUltima;
    }

    /**
     * @return the vacio
     */
    public boolean isVacio() {
        if(posUltima==0){
            return(true);
        }
        else{
            return(false);
        }
    }
    /**
     * @param vacio the vacio to set
     */
    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    /**
     * @return the lleno
     */
    public boolean isLleno() {
        if(posUltima==(tamano-1))
        {
            return(true);
        }
        else{
            return(false);
        }
    }
    /**
     * @param lleno the lleno to set
     */
    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }
    
    
    
}
