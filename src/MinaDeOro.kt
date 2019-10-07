
 open class MinaDeOro {
  var total = 0
  val bank = Banco()
  val taver = Taberna()
  val home = Hogar()

  open fun FatigaFuncion (Fatiga : Int) : Int
  {
   if (Fatiga < 10) {
    //Bob seguira trabajando
    return Fatiga + 2
   }
   else {
    //Bob esta fatigado por tanto se ira a su hogar dulce hogar
    return home.Home(Fatiga)
   }
   }
  open fun BolsadeOroFuncion(GoldPocket : Int) : Int {
   if(GoldPocket < 3)
   {
    // aun tiene espacio puede seguir buscando
    return GoldPocket + 1
   }
   else
   {
    // ya no tiene espacio, depositara en el banco

    total = bank.OroBanco(GoldPocket)
    return GoldPocket - GoldPocket
   }
  }
  open fun SedientoFuncion (thirst : Int) : Int
  {
 if (thirst <5)
 {
  return thirst + 1
 }
   else
 {
  return taver.TabernaFuncion(Sed = 0)
 }
  }
  open fun FatigaBancoFuncion (Fatiga : Int) : Int
  {
   if (Fatiga < 8) {
    //Bob seguira trabajando
    return Fatiga + 2
   }
   else {
    //Bob esta fatigado por tanto se ira a su hogar dulce hogar
    return home.Home(Fatiga)
   }
  }
}