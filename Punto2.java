public class Punto2 {

    public void P2(int d) {
        Metodos m = new Metodos();
        ObjTienda[][] M = new ObjTienda[d][d];
        M = m.llenarMatrizTienda(d);
        m.mostrarMatriz(M);
        System.out.println("el total de ventas en abril es: " + m.SumarCantidades(M));

    }
}

    

