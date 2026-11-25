public class ChickenShop {
	String tipo;
	String condimento;
	int Preco;
	Double quantidade;
   ChickenShop(String tipo,String condimento,int Preco,Double quantidade){
	   this.tipo = tipo;
	   this.condimento = condimento;
	   this.Preco = Preco;
	   this.quantidade = quantidade;
   }
   void comecar_pedido() {
	   System.out.println("seja bem vindo a nossa loja");
	   System.out.println("por favor introduza a quantidade que pretende");
	   
   }
}
