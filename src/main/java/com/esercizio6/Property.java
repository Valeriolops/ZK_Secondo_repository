package com.esercizio6;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class Property extends SelectorComposer<Window> {
	
	@Wire
	Textbox mio_input;
	@Wire
	Label risultato;
	
	@Listen("onClick=#idMioBottone")
	
	
	
	public void recupera() {
		risultato.setValue(mio_input.getValue());
		
		
	}
	
	
	

}
