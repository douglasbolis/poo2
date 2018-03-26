/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata.botoes;

import javax.swing.JButton;

/**
 *
 * @author douglas
 */
public class FabricaBotoesIcones extends FabricaAbstrataBotoes {
	@Override
	public JButton criaBotaoOK () {
		return new ButtonOK();
	}

	@Override
	public JButton criaBotaoCancel () {
		return new ButtonCancel();
	}
}
