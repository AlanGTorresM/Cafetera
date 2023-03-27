package org.example;

public class Cafetera {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;
    boolean condicional;
    public Cafetera(){
        this.agua=5000;
        this.cafe=1000;
        this.crema=1500;
        this.vasos=50;
        this.condicional=true;
    }
    public void MostrarCantidad(){
        System.out.println("cantidad de agua es de: "+ this.agua);
        System.out.println("cantidad de cafe es de: "+ this.cafe);
        System.out.println("cantidad de crema es de: "+ this.crema);
        System.out.println("cantidad de vasos es de: "+ this.vasos);
    }
    public void Americano(){
        if(this.agua>=180 && this.cafe>=15 && this.vasos!=0){
            this.agua-=180;
            this.cafe-=15;
            this.vasos--;
            System.out.println("se sirvio un americano");
            MostrarCantidad();
        }else{
            System.out.println("Ya no se puede");
            condicional= false;
        }
    }
    public void Expreso(){
        if(this.agua>=120 && this.cafe>=20 && this.vasos!=0){
            this.agua-=120;
            this.cafe-=20;
            this.vasos--;
            System.out.println("se sirvio un expreso");
            MostrarCantidad();

        }else{
            System.out.println("Ya no se puede");
            condicional=false;
        }
    }
    public void Capuchino(){
        if(this.agua>=100 && this.cafe>=14 && this.crema>=70 && this.vasos!=0){
            this.agua-=100;
            this.cafe-=14;
            this.crema-=70;
            this.vasos--;
            System.out.println("se sirvio un capuchino");
            MostrarCantidad();
        }else{
            System.out.println("Ya no se puede");
            condicional=false;
        }
    }


}
