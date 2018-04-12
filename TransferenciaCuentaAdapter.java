
public class TransferenciaCuentaAdapter implements CajeroAutomatico{
	
	private Cuenta adaptee1;

	public TransferenciaCuentaAdapter(Cuenta cuenta) {
		// TODO Auto-generated constructor stub
		this.adaptee1 = cuenta;
	}
	
	@Override
	public void order( String target, float amount ){
		this.adaptee1.transferir(amount, target);
	}

}
