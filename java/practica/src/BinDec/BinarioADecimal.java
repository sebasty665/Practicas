package BinDec;

public class BinarioADecimal {
  public static void main(String[] args)
  {
    int Dec []=new int [8];
    for (int i=0; i<Dec.length; i++)
    {
      Dec[i]=(int)(Math.random()*2); //*Asigna un numero aleatorio a cada elemento del array de enteros "Dec"
      System.out.println(Dec[i]);   //*Imprime el valor de los numero aleatorios
    }
    diferente();
  }

  public static void diferente()
  {
    int Dec[]=new int[8];
    for (int i=0; i<Dec.length; i++)
    {
    System.out.println("ingresa el numero binario");
    Dec[i]=Leer.datoInt();//*Llama al metodo Leer
    if(Dec[i]>1 || Dec[i]<0)
    {
      System.out.println("El Numero ingresado no se aplica a los numeros decimales");
      i--;
      continue;
      }//*Verificamos
    }
    System.out.println("------------------------------------------------");
    for (int i =0; i < Dec.length ; i++ )
    {
      System.out.println(Dec[i]);
    }
  }
}
