package fp.compras.test;
import fp.compras.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EjerciciosExpresiones {
	
	public static void  testprovincia(Compra c, String p) {
		
		if (c.getProvincia()==p) {
			
			System.out.println("La compra sí fue comprada en "+p);
		}
		else {
			System.out.println("La compra no fue comprada en "+p);}
			
	}
	
public static void  testimporte(Compra c, Double p) {
		
		if (c.getTotalCompra()>p) {
			
			System.out.println("La compra fue superior a "+p+ " euros.");
		}
		else
			{System.out.println("La compra no fue superior a "+p+ " euros.");}
			
	}
	
public static void  testfechasalida(Compra c, LocalDateTime p) {
	
	if (c.getFechaSalida().isBefore(p)) {
		
		System.out.println("La compra fue realizada antes de "+p.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM")));}
	else {
		System.out.println("La compra no fue realizada antes de "+p.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM")));}
		
}
public static void  testcomparasuper(Compra c,Compra d, String p) {
	
	if (c.getSupermercado()==p || d.getSupermercado()==p) {
		
		System.out.println("Alguna compra sí fue realizada en "+p);
	}
	else {
		System.out.println("Ninguna compra se realizó en "+p);}
		
}
public static void  testcomparadia(Compra c,Compra d) {
	
	if (c.getFechaLlegada().toLocalDate().isEqual(d.getFechaLlegada().toLocalDate())) {
		
		System.out.println("Las compras fueron realizadas en mismo día");
	}
	else {
		System.out.println("Las compras no fueron realizadas en mismo día");}
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compra compra1= new Compra("40961226C","Mercadona","Cadiz",LocalDateTime.of(2019, 02, 24, 05, 33), LocalDateTime.of(2019, 02, 24, 05, 57),8.65);
		Compra compra2= new Compra("86302030G","Mercadona","Malaga",LocalDateTime.of(2019, 02, 24, 10, 1), LocalDateTime.of(2019, 02, 24, 10, 34),188.65);
		Compra compra3= new Compra("37089432T","Mas","Granada",LocalDateTime.of(2019, 02, 24, 10, 9), LocalDateTime.of(2019, 02, 24, 12, 56),60.43);
		Compra compra4= new Compra("97785005E","Mercadona","Malaga",LocalDateTime.of(2019, 02, 24, 13, 58), LocalDateTime.of(2019, 02, 24, 15, 48),17.43);

		testprovincia(compra1,"Malaga");
		testprovincia(compra2,"Malaga");
		testimporte(compra1,60.0);
		testimporte(compra2,60.0);
		testfechasalida(compra2, LocalDateTime.of (2019, 2, 28, 17,35));
		testcomparasuper(compra1,compra3,"Mercadona");
		testcomparadia(compra2, compra3);
		testcomparadia(compra1, compra4);
	}

}
