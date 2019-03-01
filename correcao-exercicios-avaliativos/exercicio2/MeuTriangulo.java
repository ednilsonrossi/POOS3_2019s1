import java.util.Scanner;

/**
 *  Elaborado por Ednilson Rossi
 *
 * Classe MeuTriangulo é a evolução de um exercício proposto na primeira aula envolvendo programação.
 * Nesta implementação foi definida uma classe MeuTriangulo que encapsula atributos e métodos
 * pertinentes ao contexto de um triângulo. São atributos os valores de cada um dos lados do
 * triângulo. E são métodos o construtor, que atribui valores aos atributos e os métodos isTriangulo()
 * e getTipoTriangulo().
 * Aqui é apresentada uma solução OO.
 */
public class MeuTriangulo{

     private int lado1;
     private int lado2;
     private int lado3;
     private String tipo;

     public MeuTriangulo(int a, int b, int c){
          this.lado1 = a;
          this.lado2 = b;
          this.lado3 = c;
          this.tipo = getTipoTriangulo();
     }

     public String getTipo(){
         return tipo;
     }

     public boolean isTriangulo(){
          boolean retorno = false;
          if (this.lado1 + this.lado2 > this.lado3){
              if(this.lado1 + this.lado3 > this.lado2){
                  if(this.lado2 + this.lado3 > this.lado1){
                      retorno = true;
                      /* Só se chega aqui se todas as condições forem verdadeiras. */
                  }
              }
          }
          return retorno;
     }

     public String getTipoTriangulo(){
          String tipo;
          if(this.isTriangulo()){
              /* Se formam triângulo, verifica-se qual o tipo de triângulo. */
              if(this.lado1 == this.lado2 && this.lado1 == this.lado3){
                  tipo = "equilátero";
              }else{
                  if(this.lado1 != this.lado2 && this.lado1 != this.lado3 && this.lado2 != this.lado3){
                      tipo = "escaleno";
                  }else{
                      tipo = "isósceles";
                  }
              }
          }else{
             tipo = "Não é triângulo";
          }
          return tipo;
     }

}
