package minimalexample;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
@JavaScript("./js/jquery.min.js")
@JavaScript("./js/custom.js")
public class MinExampleView extends Composite<VerticalLayout>
{
	private final Button btnDoSomethingWithJquery = new Button("Do something with JQuery");
	private final Button btnDoInvokeCustomFunc = new Button("Invoke custom function");
	
	public MinExampleView()
	{
		this.setId("demo-id-1");
		
		this.btnDoSomethingWithJquery.addClickListener(ev -> {
			this.getElement().executeJs(
				"let currentEl = $('#demo-id-1'); " +
				"alert(currentEl);"
			);
		});
		
		this.btnDoInvokeCustomFunc.addClickListener(ev -> {
			this.getElement().executeJs("customFunc('A message');");
			
			UI.getCurrent().getPage().executeJs("customFunc('Another message')");
		});
		
		this.getContent().add(this.btnDoSomethingWithJquery, this.btnDoInvokeCustomFunc);
	}
}
