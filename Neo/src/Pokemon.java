import java.util.Scanner;

public class Pokemon {
    private int vida,ataque,speed;
    private String especie,golpe[]={"Splash","Splash","Splash","Splash"};

    public int getSpeed(){
        return speed;
    }
    public int getVida(){
        return vida;
    }
    public String getEspecie(){
        return especie;
    }

    public void setAttributes(String especie){
        if(especie.equalsIgnoreCase("Turtwig")){
            vida=55;
            ataque=10;
            speed=55;
            golpe[0]="Tackle";
            golpe[1]="Growl";
        }else if(especie.equalsIgnoreCase("Bulbasaur")){
            vida=45;
            ataque=11;
            speed=65;
            golpe[0]="Tackle";
            golpe[1]="Withdraw";
        }
    }

    public void ataque (int vida){
        int golpeEscolhido;
        
        System.out.println("Escolha o golpe do "+especie+": ");
        System.out.println("1 - "+golpe[1]+"2 - "+golpe[2]+"3 - "+golpe[3] + "4 - "+golpe[4]);
        Scanner scanner = new Scanner(System.in);
        do{
            golpeEscolhido = scanner.nextInt()-1;
            if (golpeEscolhido<1||golpeEscolhido>4)
                System.out.println("Escolha um valor entre 1 e 4.");
        }while(golpeEscolhido<1||golpeEscolhido>4);
        scanner.close();
        System.out.println(especie+" utilizou "+golpeEscolhido);
        if(golpe[golpeEscolhido]=="Tackle")
            vida-=ataque;
    }
}