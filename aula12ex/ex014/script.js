function carregar(){
    var msg = window.document.getElementById('msg')
    var img = window.document.getElementById('imagem')
    var data = new Date()
    //var hora = data.getHours()
    var hora = 19

    msg.innerHTML = `Agora são ${hora} horas.`
    if(hora >= 0 && hora < 12) {
        //BOM DIA
        img.src = 'foto-manhã.png'
        document.body.style.background = '#FFC340'
        msg.style.background = '#FFC340'
        
    } else if(hora >= 12 && hora < 18){
        //Boa tarde
        img.src = 'foto-tarde.png'
        document.body.style.background = '#FE8330'
        msg.style.background = '#FE8330'
    } else{
        //Boa noite!
        img.src = 'foto-noite.png'
        document.body.style.background = '#13293D'
        msg.style.background = '#13293D'
        msg.style.color = 'white'
        
    }

}

