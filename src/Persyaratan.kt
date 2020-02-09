class Persyaratan(){
    internal fun syaratMenang(suit1:String,suit2:String): String {
    var nilai1 = "MENANG"
        var nilai2 = "KALAH"
        var nilai3 = "DRAW"
            if(suit1.equals("Gunting", ignoreCase = true)&&suit2.equals("Kertas",ignoreCase = true)||
                suit1.equals("Batu", ignoreCase = true)&&suit2.equals("Gunting",ignoreCase = true)||
                suit1.equals("Kertas", ignoreCase = true)&&suit2.equals("Batu",ignoreCase = true)){
                return  "Pemain 1 ${nilai1}"
        }else if (suit1.equals("Gunting", ignoreCase = true)&&suit2.equals("Batu",ignoreCase = true)||
                suit1.equals("Batu", ignoreCase = true)&&suit2.equals("Kertas",ignoreCase = true)||
                suit1.equals("Kertas", ignoreCase = true)&&suit2.equals("Gunting",ignoreCase = true)){
            return "Pemain 2 ${nilai1}"
            }else
                return nilai3
    }
}