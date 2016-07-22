import java.util.Arrays;
/**
 * Francisco septiembre.
 * 3.   El objetivo es que codifiques esta clase de forma que funcione de la misma forma que los HashSet de Java pero 
 * conteniendo elementos de tipo int. Para ello ten en cuenta que    :
 * Las únicas clases que no se pueden utilizar en este proyecto son las clases Integer y HashSet.
 */
public class MiHashSet
{
    private int[] num;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        num = new int[0];
    }
    
    /**
     * añade el elemento al conjunto si no estaba. Devuelve verdadero en caso de que el elemento no estuviera presente
     * en el conjunto y falso en caso contrario.
     */
    public boolean add(int valor){
        boolean noEstaba = false;
        if(getValor(valor) == -1){
            add2(valor);
            noEstaba = true;
        }
        return noEstaba;
    }
    
    /**
     * añade el elemento al conjunto 
     */
    private void add2(int valor){
        int num2[] = num;
        num = new int[num2.length +1];
        for(int i = 0; i < num2.length; i ++){
            num[i] = num2[i];

        }
        num[num2.length] = valor;        
    }
    /**
     * informa del índice que tiene el valor pasado, o -1 si el valor pasado no está en la colección.
     */
    public int getValor2(int valor){
        int sol = -1;
        for(int i = 0; i < num.length; i++){
            if(num[i] == valor){
                sol = i;
            }
        }
        return sol;
    }
    
    /**
     * retorna el valor pasado como parámetro, si este valor ya está en la colección, -1 si no está en la colección.
     * @return -1 si el valor del parámetro no está en la colección
     */
    public int getValor(int valor){
        int sol = -1;
        for(int i = 0; i < num.length; i++){
            if(num[i] == valor){
                sol = valor;
            }
        }
        return sol;
    }
    
    /**
     * elimina del conjunto el elemento dado si existía y devuelve verdadero. Si no existiera devuelve falso;
     */
    public boolean remove(int elemento){
        boolean existe = false;
        int sol = getValor2(elemento); //almaceno el índice en le que está elemento;
        if(getValor(elemento) != -1){//el elemento sí está en la colección y pasamos a eliminarle.
            existe = true;
            int[] num3 = num;
            num = new int[num3.length -1];
            for(int i = 0; i < sol; i ++){
                num[i] = num3[i];
            }
            for(int a = sol; a < num.length; a ++){
                num[a] = num3[a +1];
            }
        }
        
        return existe;
    }
}

















