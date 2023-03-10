/**
 * Paquete que conecta la vista al controller
 */
package co.edu.unbosque.view;

public class Vista {

	public VentanaPrincipal vp;
	public Juju juju;
	
	/**
	 * Metodo constructor
	 */
	public Vista () {
		
	vp = new VentanaPrincipal();
	juju = new Juju();
	
	}

	/**
	 * @return the vp
	 */
	public VentanaPrincipal getVp() {
		return vp;
	}

	/**
	 * @param vp the vp to set
	 */
	public void setVp(VentanaPrincipal vp) {
		this.vp = vp;
	}

	/**
	 * @return the juju
	 */
	public Juju getJuju() {
		return juju;
	}

	/**
	 * @param juju the juju to set
	 */
	public void setJuju(Juju juju) {
		this.juju = juju;
	}
	
	
}

