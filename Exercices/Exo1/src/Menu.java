import java.util.List;
import java.util.ArrayList;

public class Menu {
	
	private List <Plat> menu;
	
	public Menu() 
	{
		this.menu = new ArrayList<>();
		
	}

	public List<Plat> getMenu() {
		return menu;
	}

	public void setMenu(List<Plat> menu) {
		this.menu = menu;
	}

	
}
