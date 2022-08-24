public class Main {

    public static void main(String[] args) {
        int res;
        res=suma(2,2,10);
        System.out.println("La suma es : "+res );

        Coche micoche= new Coche();
        micoche.aumentarPuertas();
        System.out.println("El número de puertas de mi coche es: "+micoche.puertas);

    }

    public static int suma(int num1, int num2, int num3) {
        int res = num1 + num2 + num3;
        return res;

    }
}

  class Coche{
      public int puertas=4;

      public void aumentarPuertas() {
          this.puertas++;
      }
  }

