
public class Restaurant {

	public static void main(String[] args) 
	{
		
		 Plat pizza = new Plat("pizza",10.99);
		 Plat hanburger = new Plat("hanburger",7.99);
		 Plat salade = new Plat("salade César",6.50);
		 
		 Menu menu = new Menu();
		 menu.getMenu().add(pizza);
		 menu.getMenu().add(hanburger);
		 menu.getMenu().add(salade);
		 
		 for(int i=0;i<3;i++) 
		 {
			 menu.getMenu().get(i).afficherPlat();
			 
			 
			 }
		 
		 
		 
	}
	
}
