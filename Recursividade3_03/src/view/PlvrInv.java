package view;

import controller.PlvrInvController;

public class PlvrInv
{
 public static void main(String Args[])
 {
 PlvrInvController PIC = new PlvrInvController();
 String teste = "teste";
 String cta = "";
 int tamanho = teste.length();
 
 cta = PIC.RecPlvrInv(teste, cta, tamanho);
 System.out.println(cta);

 }
}