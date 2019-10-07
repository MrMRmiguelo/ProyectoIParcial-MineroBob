 class Banco  {
var Gold = 0
     open fun OroBanco(OroBolso : Int) : Int{
         var GoldBefore = OroBolso
         Gold = Gold + GoldBefore
         return Gold
     }
}