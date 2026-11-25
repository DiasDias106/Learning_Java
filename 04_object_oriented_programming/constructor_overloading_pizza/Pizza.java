public class Pizza {
	String pao;
	int temp;
	String molho;
	String queijo;
	String acompanhamentos;
	
  Pizza(String pao , int temp,String molho,String queijo,String acompanhamentos){
	 this.pao = pao;
	 this.molho = molho;
	 this.queijo = queijo;
	 this.acompanhamentos = acompanhamentos;
	 this.temp = temp;
  }
  Pizza(String pao ,String molho,String queijo,String acompanhamentos){
		 this.pao = pao;
		 this.molho = molho;
		 this.queijo = queijo;
		 this.acompanhamentos = acompanhamentos;
	  }
}
