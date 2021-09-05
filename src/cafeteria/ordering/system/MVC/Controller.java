package cafeteria.ordering.system.MVC;


public class Controller implements java.awt.event.ActionListener {

	private Model model;
	private View view;

	public Controller() {	
		
	}

        @Override
	public void actionPerformed(java.awt.event.ActionEvent e){
		model.GenerateReports();
	}

	public void addModel(Model m){
		this.model = m;
	}

	public void addView(View v){
		this.view = v;
	}

	public void initModel(int x){
		model.setValue(x);
	}

}