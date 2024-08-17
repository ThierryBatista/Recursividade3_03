package controller;

public class PlvrInvController
{
 public PlvrInvController()
 {
 super();
 }
 public String RecPlvrInv(String teste, String cta, int tamanho)
 {
//assim que o tamanho do vetor chegar 0, o texto invertido é retornado 
  if (tamanho == 0)
  {
  return cta;
  }
   else
   {
//com as operações concat e substring o programa pega letra por letra da palavra principal da direita pra esquerda e adiciona na variável cta 
   cta = cta.concat(teste.substring(tamanho - 1, tamanho));
   return RecPlvrInv(teste, cta, tamanho - 1);
   }
 }
}