function tabuada(){
    var num = document.getElementById('txtn')
    var tab = document.getElementById('seltab')


    if(num.value.length <= 0){
        window.alert('Por favor, digite um número')

    }else{
        var n = Number(num.value) //conveter só para número
        var c = 1

        tab.innerHTML = ''
        while (c <= 10){
            var item = document.createElement('option') //criar um elemento no ID
            item.text = `${n} x ${c} = ${n*c}` //transformar em texto
            tab.appendChild(item)
            c++
        }
    }
    
}

