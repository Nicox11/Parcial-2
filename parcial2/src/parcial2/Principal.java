package parcial2;

public class Principal {
	
	public static void main(String[] args) {
		
		Libro libro1=new Libro(101, "Nicolas carmona", "Nicolas", 100);
		Libro libro2=new Libro(102, "La historia", "Nicolas", 220);	
		
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		
		libro1.setNumPaginas(70);
		System.out.println(libro1.toString());
		
		
		if(libro1.getNumPaginas () >libro2.getNumPaginas()) {
			System.out.println(libro1.getTitulo()+ " tiene mas paginas");
		}else{
			System.out.println(libro2.getTitulo()+ " tiene mas paginas");
		}
		
		

	}

}
