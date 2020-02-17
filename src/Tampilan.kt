import java.util.*
class Tampilan : CallBack {
    fun layar() {
        var masukkan: Int
        var lagi:String? = null
        do {
            println("||==========GAME SUIT==========||")
            println("||1. Mulai                     ||")
            println("||2. Keluar                    ||")
            println("||=============================||")
            print("Masukkan pilihan : ")
            masukkan = readLine()!!.toInt()

            if (masukkan == 1) {
                //Runtime.getRuntime().exec("cls")
                print("Pilihan Pemain 1 : ")
                var pilihanPemain1 = readLine()
                // var pem1 = PemainSuit(pilihanPemain1)
                print("Pilihan Pemain 2 : ")
                var pilihanPemain2 = readLine()
                // var pem2 = PemainSuit(pilihanPemain2)
                var pilihan = listOf<String>("gunting", "kertas", "batu")
                if (pilihan.contains(pilihanPemain1!!.toLowerCase())) {
                    println("==========GAME SUIT==========")
                    println("Pilihan pemain 1 : ${pilihanPemain1}")
                    println("Pilihan pemain 2 : ${pilihanPemain2}")
                    var syaratMain = Persyaratan(this)
                    if (pilihanPemain2 != null) {
                        syaratMain.syaratMenang(pilihanPemain1, pilihanPemain2)
                    }
                    //println(pilihanPemain1?.let { pilihanPemain2?.let { it1 -> syaratMain.syaratMenang(it, it1) } })
                    println("=============================")

                } else {
                    println("||==========PESAN==========||")
                    println("||INPUTAN TIDAK SESUAI     ||")
                    println("||=========================||")
                }
                println("Mau main lagi? ")
                lagi = readLine()
            } else
                print("Game Keluar")
        } while (lagi == "Y" || lagi == "y" && masukkan !=2)
        print("Game Keluar")
    }

    override fun cetakPemenang(status: String) {
        println(status)
    }
}