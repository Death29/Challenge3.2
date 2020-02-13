class Persyaratan(val callBack: CallBack){
    internal fun syaratMenang(suit1:String,suit2:String) {
    var nilai1 = "MENANG"
        var nilai2 = "KALAH"
        var nilai3 = "DRAW"
            if(suit1.equals("Gunting", ignoreCase = true)&&suit2.equals("Kertas",ignoreCase = true)||
                suit1.equals("Batu", ignoreCase = true)&&suit2.equals("Gunting",ignoreCase = true)||
                suit1.equals("Kertas", ignoreCase = true)&&suit2.equals("Batu",ignoreCase = true)){
                callBack.cetakPemenang("Pemain 1 ${nilai1}")
        }else if (suit1.equals("Gunting", ignoreCase = true)&&suit2.equals("Batu",ignoreCase = true)||
                suit1.equals("Batu", ignoreCase = true)&&suit2.equals("Kertas",ignoreCase = true)||
                suit1.equals("Kertas", ignoreCase = true)&&suit2.equals("Gunting",ignoreCase = true)){
            callBack.cetakPemenang("Pemain 2 ${nilai1}")
            }else
                callBack.cetakPemenang("$nilai3")
    }
}