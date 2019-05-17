package exemplo3;

public class Calculo2 {
	public int divide(int x, int y) throws ExceptionDivisaoImpossivel{
        if(x < y){
            throw new ExceptionDivisaoImpossivel("X é menor que Y");
        }
        return x / y;
    }
	
	public static void main(String[] args) {
		Calculo2 c = new Calculo2();
        int r;
        try {
            r = c.divide(1, 2);
            System.out.println("Divisão: " + r);
        } catch (ExceptionDivisaoImpossivel ex) {
            System.out.println("Exceção gerada: " + ex);
        }
	}
}

class ExceptionDivisaoImpossivel extends Exception{

    public ExceptionDivisaoImpossivel(String msg){
        super(msg);
    }
}