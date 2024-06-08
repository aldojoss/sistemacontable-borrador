public class App {
    public static void main(String[] args) throws Exception {
        
        BalanceGen bala= new BalanceGen();
        EstadoResultado est = new EstadoResultado();
// aqui simplemente estuve probando las funciones aver si funcionaban y si funcionan
//ahi ves vos com oorganizas eso

    

        est.agregarvalordeingresos();
        est.agregarvalordegastos();

        int ingresos = est.calcularingresos();
        int gastos = est.calculargastos();

        System.out.println("Sus ingresos son de "+est.calcularingresos());
        System.out.println("Sus gastos son de "+est.calculargastos());

        est.mostraringresos();
        est.mostrargastos();
        int utilidaddelejercicio=est.resultadofinal(ingresos, gastos);

        System.out.println("La utilidad del ejercicio es "+utilidaddelejercicio);

        bala.agregarutilidaddelejercicio(utilidaddelejercicio);
        // le pedi el capital aver si me volvia a pedir el valor de utilidad del ejercicio pero 
        //no lo hizo pq le puse una condicion pq la utilidad del ejericicio ya esta es la del
        //estado de resultado q acabo de hacerxd

        bala.agregarvalordecapital();

        bala.mostrarcapital();


        

       

       
        
    }
}
