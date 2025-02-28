import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjTienda[][] llenarMatrizTienda(int dimension) {
        ObjTienda[][] m = new ObjTienda[dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjTienda o = new ObjTienda();
                System.out.println("Ingrese numero de semana a validar");
                o.setSemana(sc.next());
                System.out.println("ingrese la cantidad de ventas de la semana");
                o.setVentas(sc.nextInt());
                
                

                m[i][j] = o;
            }
        }
        return m;

    }

    public void mostrarMatriz(ObjTienda[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println(m[i][j].getSemana() +"Semana ");
                System.out.println("Ventas: " + m[i][j].getVentas());
            }
            System.out.println();
        }
    }

    public int SumarCantidades(ObjTienda[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                suma = suma + m[i][j].getVentas();
            }
        }
        return suma;
    }
}
