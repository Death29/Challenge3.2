import java.util.*
class Tampilan {
    fun layar(){
        var masukkan = Scanner(System.`in`)
        // var input = Scanner(System.`in`)

        println("||==========GAME SUIT==========||")
        println("||1. Mulai                     ||")
        println("||2. Keluar                    ||")
        println("||=============================||")
        print("Masukkan pilihan : ")
        var pil =masukkan.nextInt()

        if (pil == 1){
            //Runtime.getRuntime().exec("cls")
            print("Pilihan Pemain 1 : ")
            var pilihanPemain1 = readLine()
           // var pem1 = PemainSuit(pilihanPemain1)
            print("Pilihan Pemain 2 : ")
            var pilihanPemain2 = readLine()
           // var pem2 = PemainSuit(pilihanPemain2)
            if (pilihanPemain1.equals("Gunting", ignoreCase = true)||
                pilihanPemain1.equals("Batu", ignoreCase = true)||
                pilihanPemain1.equals("Kertas", ignoreCase = true)||
                pilihanPemain2.equals("Gunting", ignoreCase = true)&&
                pilihanPemain2.equals("Batu", ignoreCase = true)||
                pilihanPemain2.equals("Kertas", ignoreCase = true)) {
                println("==========GAME SUIT==========")
                println("Pilihan pemain 1 : ${pilihanPemain1}")
                println("Pilihan pemain 2 : ${pilihanPemain2}")
                var syaratMain = Persyaratan()
                println(pilihanPemain1?.let { pilihanPemain2?.let { it1 -> syaratMain.syaratMenang(it, it1) } })
                println("=============================")
            }else{
                println("||==========PESAN==========||")
                println("||INPUTAN TIDAK SESUAI     ||")
                println("||=========================||")
            }
        }else
            print("Game Keluar")
    }
}