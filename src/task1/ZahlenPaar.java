package task1;

public class ZahlenPaar<T extends Number, U extends Number> extends Paar<T, U> {
	//Konstruktor
	public ZahlenPaar(T t_Var, U u_Var) {
		super(t_Var, u_Var);
	}	
	//Methode zum Summieren der beiden übergebenen Werte
	public double sumTwoValues() {
		return getTvar().doubleValue() + getUvar().doubleValue();
	}
}