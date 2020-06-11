package view;

public class print implements View {

	@Override
	public void show() {
		
		out.println(request.get("userId"));
		
		
		menuController.menuprocess();
	}

}
