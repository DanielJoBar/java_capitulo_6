/* Alumno:  DANIEL JÓDAR BARBERO

 * Curso :  1º DAM

 * Turno :  Mañana

 */




/*Enunciado : Realiza un programa para gestionar un ticket de compra de una tienda.

El ticket se genera después de indicar el tipo de producto, el nombre, la cantidad y el precio teniendo en cuenta las siguientes situaciones:

Los productos de alimentación tienen diferentes tipos de iva:

Huevos, Leche, Pan, Fruta y Verdura tienen un 4% de iva.

El resto de productos de alimentación tiene un 10% de iva.

Los productos electrónicos tienen una oferta del 20% de descuento y un iva del 21%

Los productos de farmacia tienen un 4% de iva

Los productos de moda tienen una oferta de 3x2 (Se lleva 3 y paga 2) y un iva del 21% */




import java.util.Scanner;

 public class Examen_Capitulo_4{

    public static void main(String[] args){




        /*

         * PROFESOR

         * La sentencia case no puede contener distintos valores separados por comas

         * El programa no compila por lo tanto no es válido independientemente del resto

         * Tienes condiciones en if sin sentido

         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el tipo de producto(Pon el número o exactamente el texto, no importa si no se pone las tildes): ");

        System.out.println("1.Alimentación");

        System.out.println("2.Electrónica");

        System.out.println("3.Farmacia");

        System.out.println("4.Moda");

        String producto=System.console().readLine();

        double iva=0;

        double descuento =0;

        int oferta=0;

        String Alimento="";

        switch(producto){

            case  "Alimentación","1","Alimentacion":

            System.out.println("Opción: 1");

            System.out.println("Introduzca el tipo de alimento: ");

            System.out.println("1.Huevos");

            System.out.println("2.Leche");

            //Se puso 4 a corde con el enunciado del ejercicio

            System.out.println("4.Pan");

            System.out.println("5.Fruta");

            System.out.println("6.Verdura");

            System.out.println("7.Otros");

            Alimento=System.console().readLine();

            if(Alimento.equals("7")||Alimento.equals("Otros")){

                iva=0.1;

            }

            else{iva=0.04;}

            switch(Alimento){

                case "1","Huevos":

                Alimento="Huevos";

                System.out.println("Opción: 1");

                break;

                case "2","Leche":

                Alimento="Leche";

                System.out.println("Opción: 2");

                break;

                case "4","Pan":

                Alimento="Pan";

                System.out.println("Opción: 4");

                break;

                case "5","Fruta":

                Alimento="Fruta";

                System.out.println("Opción: 5");

                break;

                case "6","Verdura":

                Alimento="Verdura";

                System.out.println("Opción: 6");

                break;

                case "7","Otros":

                Alimento="Otros";

                System.out.println("Opción: 7");

                break;

            }

            break;

            case  "Electrónica","2","Electronica":

            System.out.println("Opción: 2");

            iva=0.21;

            descuento=0.20;

            break;

            case  "Farmacia","3":

            System.out.println("Opción: 3");

            iva=0.04;

            break;

            case  "Moda","4":

            System.out.println("Opción: 4");

            iva=0.21;

            break;

        }

        System.out.print("Introduzca el nombre del producto: ");

        String nombreProducto = System.console().readLine();

        System.out.print("Introduzca la cantidad de productos: ");

        int cantidad = sc.nextInt();

        System.out.print("Introduzca el precio por unidad del producto(los centimos se indican por coma): ");

        double precioUnidad = sc.nextDouble();

        double Total = cantidad*precioUnidad;

        System.out.println();

        System.out.println("Factura");

        //Factura alimentacion(4% IVA)

        if((producto.equals("1")||producto.equals("Alimentación")||producto.equals("Alimentacion"))&&(Alimento.equals("Otros"))){

        System.out.println("________________________________________");

        System.out.println("Articulo        "+nombreProducto);

        System.out.println("Precio          "+precioUnidad+"€/unidad");

        System.out.println("Cantidad        "+cantidad);

        System.out.println("Total           "+Total+"€");

        System.out.println("IVA al "+(int)(iva*100)+"%       "+iva*Total+"€");

        System.out.println("________________________________________");

        System.out.println("Total con IVA   "+(Total+(iva*Total))+"€");

        }

        //Factura alimentacion(10% IVA)

        else if(producto.equals("1")||producto.equals("Alimentación")||producto.equals("Alimentacion")){

            System.out.println("________________________________________");

            System.out.println("Articulo        "+Alimento+" "+nombreProducto);

            System.out.println("Precio          "+precioUnidad+"€/unidad");

            System.out.println("Cantidad        "+cantidad);

            System.out.println("Total           "+Total+"€");

            System.out.println("IVA al "+(int)(iva*100)+"%      "+iva*Total+"€");

            System.out.println("________________________________________");

            System.out.println("Total con IVA   "+(Total+(iva*Total))+"€");

        }

        //Factura Electrónica

        else if(producto.equals("2")||producto.equals("Electrónica")||producto.equals("Electronica")){

        System.out.println("________________________________________");

        System.out.println("Articulo              "+nombreProducto);

        System.out.println("Precio                "+precioUnidad+"€/unidad");

        System.out.println("Cantidad              "+cantidad);

        System.out.println("Total                 "+Total+"€");

        System.out.println("Descuento(20%)       -"+descuento*Total+"€");

        System.out.println("Total con descuento   "+(Total-(descuento*Total))+"€");

        System.out.println("IVA al "+(int)(iva*100)+"%            "+iva*(Total-(descuento*Total))+"€");

        System.out.println("________________________________________");

        System.out.println("Total con IVA         "+((Total-descuento*Total)+(iva*(Total-(descuento*Total))))+"€");

        }

        //Factura Farmacia

        else if(producto.equals("3")||producto.equals("Farmacia")){

        System.out.println("________________________________________");

        System.out.println("Articulo        "+nombreProducto);

        System.out.println("Precio          "+precioUnidad+"€/unidad");

        System.out.println("Cantidad        "+cantidad);

        System.out.println("Total           "+Total+"€");

        System.out.println("IVA al "+(int)(iva*100)+"%      "+iva*Total+"€");

        System.out.println("________________________________________");

        System.out.println("Total con IVA   "+(Total+(iva*Total))+"€");

        }

        //Factura Moda

        else if(producto.equals("4")||producto.equals(("Moda"))){

        oferta =cantidad-(int)(cantidad/3);

        System.out.println("________________________________________");

        System.out.println("Articulo        "+nombreProducto);

        System.out.println("Precio          "+precioUnidad+"€/unidad");

        System.out.println("Cantidad        "+cantidad);

        System.out.println("Total           "+Total+"€");

        System.out.println("Descuento(3x2)       -"+oferta*precioUnidad+"€");

        System.out.println("Total con descuento       "+(Total-(oferta*precioUnidad))+"€");

        System.out.println("IVA al "+(int)(iva*100)+"%      "+iva*(Total-(oferta*precioUnidad))+"€");

        System.out.println("________________________________________");

        System.out.println("Total con IVA   "+(Total-(oferta*precioUnidad)+iva*(Total-(oferta*precioUnidad)))+"€");

        }

        sc.close();

}




}
