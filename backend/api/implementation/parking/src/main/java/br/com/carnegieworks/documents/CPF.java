package br.com.carnegieworks.documents;

import br.com.carnegieworks.documents.interfaces.IDocumentStrategy;

public class CPF extends Document implements IDocumentStrategy{

	@Override
	public Boolean evaluate() {
		return true;
	}

}
