// scanner
import java.util.Scanner;

public class Carro{

    // os objetos que serão utilizados
    public String Marca;
    public String Modelo;
    public double VelocidadeMax;
    public int Anofabricação;
    public String Cor;
    public int NumPortas;
    public String Cambio;

    //Método set
    public void setMarca(String marca){
        Marca = marca;
    }
    public void setModelo(String modelo){
        Modelo = modelo;

    }
    public void setCor(String cor){
           Cor = cor;
    }
    public void setCambio(String cambio){
            Cambio = cambio;
    }
    public void setVelocidade(double max){
        VelocidadeMax = max;
    }
    public void setNumPortas(int portas){
           NumPortas = portas;
    }
    public void setAnofabricação(int ano){
           Anofabricação = ano;
    }
    
    // o retorno do método
    public String getMarca(){
          return Marca;
    }
    public String getModelo(){
        return Modelo;
    }
     public String getCor(){
         return Cor;
    }
    public String getCambio(){
        return Cambio;
    }
    public double getVelocidadeMax(){
        return VelocidadeMax;
    }
       public int getNumPortas(){
       return NumPortas;
   }
   public int getAnofabricação(){
    return  Anofabricação;
}
    
    
    
    public void exibir(){

    //  método get
         
       String marca = this.getMarca();
        String modelo = this.getModelo();
        String cor  = this.getCor();
        String cambio = this.getCambio();
        int portas = this.getNumPortas();
        int ano = this.getAnofabricação();
        double max = this.getVelocidadeMax();

        System.out.println("Marca:" +marca );
        System.out.println("Modelo:" +modelo );
        System.out.println("Cor:" +cor );
        System.out.println("Cambio;" +cambio );
        System.out.println("portas:" +portas );
        System.out.println("Ano:" +ano );
        System.out.println("Voelocidade Maxima:" +max );
    }
    
    //listagem dos dados 
     public void listar(){
       
        String marca = this.getMarca();
        String modelo = this.getModelo();
        String cor  = this.getCor();
        String cambio = this.getCambio();
        int portas = this.getNumPortas();
        int ano = this.getAnofabricação();
        double max = this.getVelocidadeMax();
      
        // listagem de modo de coluna     
    System.out.println("Marca | modelo | Cor | Cambio | numero das portas | ano | Velocidade maximaa ");
    System.out.println(marca+" | " +modelo+ " | " +cor+ " | " +cambio+ "|" +portas+ "|" +ano+ "|"+ max  );
    }
    
     // salvamento das informações inseridas
    public void salvar(){
      Scanner ler = new Scanner(System.in);

      String marca,modelo,cor,cambio;
      int portas,ano;
      double max;

      System.out.println("Digite a marca de seu carro:");
      marca = ler.next();
      this.setMarca(marca);

      System.out.println("Digite o modelo de seu carro:");
      modelo = ler.next();
      this.setModelo(modelo);

      System.out.println("Digite a cor do seu carro");
      cor = ler.next();
      this.setCor(cor);

      System.out.println("Digite o cambio de seu carro:");
      cambio = ler.next();
      this.setCambio(cambio);

      System.out.println("Digite o numero de portas de seu carro:");
      portas = ler.nextInt();
      this.setNumPortas(portas);

      System.out.println("Digite o ano de fabricação de seu carro:");
      ano = ler.nextInt();
      this.setAnofabricação(ano);

      System.out.println("Digite a velocidade Maxima de seu carro:");
      max = ler.nextDouble();
      this.setVelocidadeMax(max);

    
    
    }
    private void setVelocidadeMax(double max) {
    }
    // para o scanner funcionar e fazer leitura dos dados
    public static void main (String[] args){

        Carro carro = new Carro();
   
        carro.salvar();
        carro.exibir();
        carro.listar();

}

}