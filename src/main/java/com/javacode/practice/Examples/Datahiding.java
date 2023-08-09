package com.javacode.practice.Examples;

class Datahiding {
   private String x="Ram";

   public String getx(){
    return x;
   }
   public void setx(String x){
    this.x=x;
   }
}
class Testdata{
    public static void main(String[] args) {
        Datahiding d=new Datahiding();
        System.out.print(d.getx());
    }
}


