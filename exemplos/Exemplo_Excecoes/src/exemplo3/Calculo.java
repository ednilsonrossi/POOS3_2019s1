package exemplo3;

public class Calculo {

	public int divide(int x, int y) throws Exception{
        if(x < y){
            throw new Exception("X é menor que Y");
        }
        return x / y;
    }
	
	public static void main(String[] args) {
		Calculo c = new Calculo();
        int r;
        try {
            r = c.divide(1, 2);
            System.out.println("Divisão: " + r);
        } catch (Exception ex) {
            System.out.println("Exceção gerada: " + ex);
        }
	}
}
