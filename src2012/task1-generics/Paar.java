package task1;

public class Paar<T, U> {
	//Variablen
	protected T t_Var;
	protected U u_Var;
	//Konstruktor
	public Paar(T t_Var, U u_Var) {
		this.t_Var = t_Var;
		this.u_Var = u_Var;
	}
	//Getter t_Var
	public T getTvar() {
		return this.t_Var;
	}
	//Getter u_Var
	public U getUvar() {
		return this.u_Var;
	}	
}