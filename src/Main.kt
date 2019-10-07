import kotlin.random.Random

fun main()
{
    val random = Random
    val BobClase = Minero(random.nextInt(3),0,random.nextInt(5))
    val MinaClase = MinaDeOro()
    BobClase.show()

    for(num in 1..20) {


        if (BobClase.Gold < 3) {
            BobClase.Gold = (MinaClase.BolsadeOroFuncion(BobClase.Gold))
            BobClase.sed = (MinaClase.FatigaFuncion(BobClase.sed))
            BobClase.fatiga = (MinaClase.FatigaFuncion(BobClase.fatiga))
            println("Minero Bob: Recolectando una pepita de oro, oro actual : ${BobClase.Gold}")
            Thread.sleep(1000)
        } else {
            println("Minero Bob: Voy para el banco, si señor")
            Thread.sleep(1000)
            BobClase.Gold = (MinaClase.BolsadeOroFuncion(BobClase.Gold))
            println("Minero Bob: Depositando el oro en el banco. Total de oro ahorrado: ${MinaClase.total} ")
            Thread.sleep(1000)


            if (BobClase.fatiga >= 8) {
                BobClase.fatiga = (MinaClase.FatigaBancoFuncion(BobClase.fatiga))
                println("Minero Bob: Me siento muy cansado. Iré a descansar.")
                Thread.sleep(1000)
                println("Minero Bob: De camino a mi hogar dulce hogar.")
                Thread.sleep(1000)
                println("Minero Bob: Hogar dulce hogar.")
                Thread.sleep(1000)
                println("Minero Bob: Zzzzz...")
                Thread.sleep(1000)
                println("Minero Bob: De regreso a la mina.")
                Thread.sleep(1000)
            }

        }


        if (BobClase.sed >= 5) {
            println("Minero Bob: Hombre, estoy sediento. Me dirijo a la taberna.")
            Thread.sleep(1000)
            BobClase.sed = (MinaClase.SedientoFuncion(BobClase.sed))

            if (BobClase.fatiga >= 10) {
                BobClase.fatiga = (MinaClase.FatigaFuncion(BobClase.fatiga))
                println("Minero Bob: Me siento muy cansado. Iré a descansar.")
                Thread.sleep(1000)
                println("Minero Bob: De camino a mi hogar dulce hogar.")
                Thread.sleep(1000)
                println("Minero Bob: Hogar dulce hogar.")
                Thread.sleep(1000)
                println("Minero Bob: Zzzzz...")
                Thread.sleep(1000)
                println("Minero Bob: De regreso a la mina.")
                Thread.sleep(1000)
            }else{
                println("Minero Bob: De regreso a la mina.")
                Thread.sleep(1000)
            }

        }

        if (BobClase.fatiga >= 10) {
            BobClase.fatiga = (MinaClase.FatigaFuncion(BobClase.fatiga))
            println("Minero Bob: Me siento muy cansado. Iré a descansar.")
            Thread.sleep(1000)
            println("Minero Bob: De camino a mi hogar dulce hogar.")
            Thread.sleep(1000)
            println("Minero Bob: Hogar dulce hogar.")
            Thread.sleep(1000)
            println("Minero Bob: Zzzzz...")
            Thread.sleep(1000)
            println("Minero Bob: De regreso a la mina.")
            Thread.sleep(1000)
        }

    }
}

